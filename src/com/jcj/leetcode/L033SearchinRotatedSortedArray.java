package com.jcj.leetcode;

public class L033SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums= {1,3};
		
		System.out.println(search(nums, 3));
	}

	/**
	 * Refer: http://articles.leetcode.com/2010/04/searching-element-in-rotated-array.html
	 * 
	 * Test Case:
	 * 1. {3,4,5,6,7,0,1,2} - 7, 3, 1, 10
	 * 2. {7,0,1,2,3,4,5,6} - 7, 3, 1, 10
	 * 
	 * I forget:
	 * [3,1], 1
	 * [1,3],3
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
    public static int search(int[] nums, int target) {
        
    	int left = 0;
    	int right = nums.length - 1;
    	
    	while(left <= right)
    	{
    		int mid = left + (right-left)/2;
    		if(nums[mid] == target) return mid;
    		
    		if(nums[left] <= nums[mid])
    		{
    			if(target >= nums[left] && target < nums[mid])
    			{
    				right = mid-1;
    			}
    			else
    			{
    				left = mid+1;
    			}
    		}
    		else
    		{
    			if(target > nums[mid] && target <= nums[right])
    			{
    				left = mid+1;
    			}
    			else
    			{
    				right = mid-1;
    			}
    		}
    	}
    	
    	return -1;
    }
    
}
