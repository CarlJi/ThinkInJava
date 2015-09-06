package com.jcj.jzoffer;

public class L031ContinueMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] res = {-5,-4,-3,-2,-1};

		maxSum(res);
	}

	/**
	 * Test Cases:
	 * 1. 6,-3,-2,7,-15,1,2,2 
	 * 2. -3,-2,-1
	 * 3. 5,-2,-5,8,-7,10
	 * 4. 5,-1,-3
	 * 
	 * 
	 * I forget!!!
	 * 1. [1,2,-1,-2,2,1,-2,1]
	 * 
	 * @param nums
	 * @return
	 */
	public static int maxSum(int[] nums)
	{
		if(nums == null || nums.length < 0) return Integer.MIN_VALUE; 

		int max = nums[0];
		int temp = max;
		int start =0, end = 0;
		int nextStart = 0;
		for (int i = 1 ; i < nums.length; i++)
		{
			if(temp + nums[i] < 0)
			{
				if(temp > max)
				{
					max = temp;
					start = nextStart;
					end = i-1;
				}
				temp = nums[i];
				nextStart = i;
			}
			else
			{
				temp += nums[i];
			}
		}

		if(temp > max)
		{
			max = temp;
			end = nums.length-1;
		}

		System.out.println(max + " " + start + " " + end);
		return max;

	}
}
