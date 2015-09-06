package com.jcj.leetcode;

import java.util.Arrays;

public class L016ThreeSumClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,1,1,0};
		System.out.println(threeSumClosest(a, -100));
	}
	
	/**
	 * Test Cases:
	 * 1. [1,1,1,0] -100
	 * 2. [1,1,1] - 0
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = Integer.MAX_VALUE;
        int expect = 0;
        for(int i = 0 ; i < nums.length - 2; i++)
        {
            int start = i+1;
            int end = nums.length-1;
            while(start<end)
            {
                int actual = nums[i] + nums[start] + nums[end];
                int temp = target - actual;
                
                if(Math.abs(temp) < closest)
                {
                	closest = Math.abs(temp);
                	expect = actual;
                }
                
                if (temp == 0)
                {
                	return actual;
                }
                else if (temp < 0)
                {
                	end--;
                }
                else
                {
                	start++;
                }
            }
        }
        
        return expect;
    }

}
