package com.jcj.jzoffer;

public class L008FindMinInRotatedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] res = {1,0,1,1,1};
		
		System.out.println(findMin(res));
	}
	
	
	/**
	 * 
	 * Test Cases:
	 * 1,2,3,4,5
	 * 3,4,5,1,2
	 * 1,0,1
	 * 1,0,1,1,1
	 * 
	 * 
	 * @param nums
	 * @return
	 */
	public static int findMin(int[] nums)
	{
		if(nums==null||nums.length<1)
			throw new RuntimeException("Invalid Parameter!");
		
		int s =0;
		int e = nums.length -1;
		int m = s;
		
		while(nums[s] >= nums[e])
		{
			
			if(e - s == 1)
			{
				m = e;
				break;
			}
			
			m = s+ (e-s)/2;
			
			if(nums[s]==nums[m] && nums[s] == nums[e])
			{
				return searchInOrder(nums);
			}
			
			if(nums[m] >= nums[s])
			{
				s=m;
			}
			else if (nums[m] <= nums[e])
			{
				e=m;
			}
		}
		
		return nums[m];
		
	}


	private static int searchInOrder(int[] nums) {
		int res = nums[0];
		
		for(int i =0; i < nums.length; i++)
		{
			if(res>nums[i])
			{
				res=nums[i];
			}
		}
		
		return res;
	}
	

}
