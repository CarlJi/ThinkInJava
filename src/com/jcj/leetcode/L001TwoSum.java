package com.jcj.leetcode;

import java.util.Arrays;
import java.util.HashMap;

import com.carl.util.Util;

/**
 * Target: https://leetcode.com/problems/two-sum/
 * 
 * @author Carl Ji
 *
 */
public class L001TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums_1 = {2,7,12,15};
		int[] nums = {5,75,25, 25, 95};
		
		twoSum_2(nums, 100);
		
		Util.printArray(twoSum(nums_1, 19));
	}

	/**
	 * Use HashMap
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target)
	{
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int[] result = new int[2];

		for(int i = 0; i < nums.length; i ++)
		{
			if(hm.containsKey(nums[i]))
			{
				result[0] = hm.get(nums[i]) + 1;
				result[1] = i + 1;
			}

			hm.put(target - nums[i], i);
		}

		return result;
	}
	
	/**
	 * Refer: http://articles.leetcode.com/2010/04/finding-all-unique-triplets-that-sums.html
	 * Quadratic algorithm : http://en.wikipedia.org/wiki/3SUM
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public static void twoSum_2(int[] nums, int target)
	{
		Arrays.sort(nums);
		for(int i = 0; i < nums.length - 1; i++)
		{
			int expect = target - nums[i];
			int last = nums.length -1;
			while(i<last)
			{
				if(nums[last] > expect)
				{
					last--;
				}
				else if (nums[last] == expect)
				{
					System.out.println(nums[i] + " " + nums[last]);
					break;
				}
				else
				{
					break;
				}
			}
		}

	}

}
