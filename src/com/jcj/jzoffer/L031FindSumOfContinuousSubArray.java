package com.jcj.jzoffer;

public class L031FindSumOfContinuousSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1, -3, 2, 4, -1, 8, 9};
		
		System.out.println(findMaxSumOfConArray(nums, nums.length -1));
	}
	
	public static int findMaxSumOfConArray(int[] nums, int n)
	{
		if(n == 0)
			return nums[n];
		
		int max = Integer.MIN_VALUE;
		int curSum = findMaxSumOfConArray(nums, n -1);
		
		if(curSum <= 0)
		{
			curSum = nums[n];
		}
		else
		{
			curSum += nums[n];
		}
		
		if(curSum > max)
		{
			max = curSum;
		}
		
		return max;
	}

}
