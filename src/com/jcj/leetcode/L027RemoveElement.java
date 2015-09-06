package com.jcj.leetcode;

public class L027RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}
	
	/**
	 * Thoughts:
	 * æŠŠå?Žé?¢çš„è¦†ç›–å‰?é?¢çš„
	 * 
	 * Test Case:
	 * 1. 1,1,2 - 1
	 * 2. 1,3,2 - 1
	 * 3. 1 - 1
	 * 
	 * @param nums
	 * @param val
	 * @return
	 */
    public static int removeElement(int[] nums, int val) {
        int end = nums.length - 1;
        int count = 0;
        for(int i = 0; i <= end; i++)
        {
        	if(nums[i] != val)
        	{
        		count++;
        	}
        	else
        	{
        		nums[i] = nums[end];
        		end--;
        		i--;
        	}
        }
        
        return count;
    }

}
