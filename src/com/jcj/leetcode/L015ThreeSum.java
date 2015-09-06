package com.jcj.leetcode;

import java.util.*;

public class L015ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}

	/**
	 * Refer:http://articles.leetcode.com/2010/04/finding-all-unique-triplets-that-sums.html
	 *       http://en.wikipedia.org/wiki/3SUM
	 * Requirement:
	 * 1. Non descending
	 * 2. No duplicate
	 * 
	 * Test Cases:
	 * 1. null
	 * 2. [1,2]
	 * 3. [-1,0,1]
	 * 4. [-1,-1,0,1,1]
	 * 5. [-3,-2,-1,0,1,2,3,4]
	 * 
	 * Important Notes, i forget the following scenarios:
	 * [-2,0,1,1,2] - [[-2,0,2],[-2,1,1]]
	 * 
	 * Worse i missed:
	 * [-2,0,0,2,2] - [[-2,0,2]]
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> triplets = new ArrayList<List<Integer>>();

		for(int i = 0; i < nums.length - 2; i++)
		{
			if(i - 1 >= 0 && nums[i] == nums[i-1])
			{
				continue;
			}
			int expect = - nums[i];
			int first = i +1;
			int last = nums.length -1;
			while(first < last)
			{
				int actual = nums[first] + nums[last];
				if(actual > expect)
				{
					last--;
				}
				else if (actual == expect)
				{
					triplets.add(Arrays.asList(nums[i], nums[first], nums[last]));
					while(first<last && nums[first] == nums[first+1]) first++;
					while(first<last && nums[last] == nums[last-1]) last--;
				}
				else
				{
					first++;
				}
			}
		}

		return triplets;
	}
}
