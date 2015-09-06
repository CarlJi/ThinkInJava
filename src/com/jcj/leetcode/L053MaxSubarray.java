package com.jcj.leetcode;

public class L053MaxSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] res = {6,-3,-2,7,-15,1,2,2};
         System.out.println(maxSum(res));
	}
	
	/**
	 * Test Cases:
	 * 1. 6,-3,-2,7,-15,1,2,2 
	 * 2. -3,-2,-1
	 * 3. 5,-2,-5,8,-7,10
	 * 4. 5,-1,-3
	 * 
	 * 
	 * I forgot !!!!!
	 * 1. [1,2,-1,-2,2,1,-2,1]
	 * 
	 * @param nums
	 * @return
	 */
	public static int maxSum(int[] nums)
	{
		if(nums == null || nums.length < 0) return Integer.MIN_VALUE; 

		int max = nums[0];
		int temp = 0;
		int start = 0;
		int nextStart = 0;
		int end = 0;
		for(int i =0; i < nums.length; i++)
		{
			temp += nums[i];
			if(temp > max)
			{
				max = temp;
				end = i;
				start = nextStart;
				nextStart = i+1;
			}
			
			if(temp < 0)
			{
				temp = 0;
			}
		}
		System.out.println(start + " " + end);
		return max;

	}

}
