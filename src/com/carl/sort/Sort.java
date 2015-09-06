package com.carl.sort;

import java.util.List;

import com.carl.util.Util;


public class Sort {

	public static void main(String[] args) {

		//int[] nums = {6,5,7,-6,11,6,3};
		int[] nums = {6};
		
		quickSort(nums, 0, 0);
		
		Util.printArray(nums);


	}

	/**
	 * 
	 * Case i forgot:
	 * 
	 * Must judge left >= right !!!!
	 * 
	 * 
	 * @param nums
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] nums, int left, int right)
	{
		if(left >= right) return;
		
		int s = left;
		int r = right;
		int base = nums[s];
		
		while(s < r)
		{
			while(s < r && nums[r] >= base)
			{
				r--;
			}

			if(s < r)
			{
			    nums[s] = nums[r];
			    s++;
			}

			while(s < r && nums[s] <= base)
			{
				s++;
			}
			if(s < r)
			{
				nums[r] = nums[s];
				r--;
			}
		}
		
		nums[s] = base;
		quickSort(nums, left, s-1);
		quickSort(nums, s+1, right);
	}

	/**
	 * 
	 * @param ls
	 */
	public static void insertSort(List<Integer> ls)
	{
		if(ls == null)
		{
			return;
		}

		for(int i = 1; i < ls.size() ; i++)
		{
			int temp = ls.get(i);
			int j ;
			for(j = i-1; j >= 0 && ls.get(j) > temp ; j --)
			{
				ls.set(j + 1, ls.get(j));
			}

			ls.set(j + 1, temp);
		}
	}
	
	public static int partition(int[] nums, int start, int end) throws Exception
	{
		if(nums == null || start > end) throw new Exception("Invalid Parameters!");
		
		int base = start;

		swap(nums, base, end);
		
		int index = start;
		for(int i = start; i<end; i++)
		{
			if(nums[i] < nums[end])
			{
				swap(nums, i, index);
				index++;
			}
		}
		
		swap(nums, index, end);
		
		return index;
	}
	
	private static void swap(int[] nums, int des, int target)
	{
		int temp = nums[des];
		nums[des] = nums[target];
		nums[target]=temp;
	}
	

}
