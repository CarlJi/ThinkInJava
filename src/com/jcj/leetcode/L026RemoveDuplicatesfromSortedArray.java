package com.jcj.leetcode;

public class L026RemoveDuplicatesfromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Refer:https://leetcode.com/discuss/20266/my-concise-java-solution
	 * 
	 * Test Case:
	 * 1. 1, 1, 2
	 * 2. 1,1,1,2,2,3
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public static int removeDuplicates(int[] nums) {
        if(nums.length < 2) return nums.length;
        int index = 0;
        for(int i = 1; i < nums.length; i ++)
        {
            if(nums[i] != nums[index])
            {
                nums[++index] = nums[i];
            }
        }
        
        return index+1;
    }
}
