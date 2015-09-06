package com.jcj.leetcode;

import com.carl.util.Util;

public class L189RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3};
		
		rotate_2(nums,2);
		
		Util.printArray(nums);
	}
	
	/**
	 * 
	 * I forgot:
	 * 1. [1,2] 1
	 * 
	 * @param nums
	 * @param k
	 */
    public static void rotate(int[] nums, int k) {
        if(nums.length < 1) return;
        int[] newNums = new int[nums.length];
        int m = k % nums.length;
        if(m==0)return;
        int j = 0;
        for(int i = nums.length - m; i < nums.length; i++)
        {
            newNums[j] = nums[i];
            j++;
        }
        
        for(int i = 0; i < nums.length - m; i++)
        {
            newNums[j]=nums[i];
            j++;
        }
        
        for(int i = 0; i < nums.length; i++)
        {
        	nums[i] = newNums[i];
        }
    }
    
    /**
     * Refer:https://leetcode.com/discuss/36477/easy-to-read-java-solution
     * 
     * Space:O(1) Time:O(n)
     * 
     * @param nums
     * @param k
     */
    public static void rotate_2(int[] nums, int k)
    {
    	if(nums.length < 1) return;
    	k = k%nums.length;
    	
    	reverse(nums,0,nums.length-1);
    	reverse(nums, 0, k -1);
    	reverse(nums, k, nums.length -1);
    }
    
    public static void reverse(int[] nums, int start, int end)
    {
    	while(start<end)
    	{
    		int temp = nums[start];
    		nums[start]=nums[end];
    		nums[end]=temp;
    		start++;
    		end--;
    	}
    }

}
