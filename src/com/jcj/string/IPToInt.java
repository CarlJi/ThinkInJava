package com.jcj.string;

public class IPToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println(ipToLong("255.255.255.1")); 
    
    System.out.println(Integer.MAX_VALUE);
	}
	
	/** Unable to convert ip to int in java since the max value of int in java is 
	* equals 2<sup>31</sup>-1, not 2<sup>32</sup>-1!!!!
	* 
	* Note: Focus on the bit operation
    **/ 
	public static long ipToLong(String ip)
	{
		String[] nums = ip.split("\\.");
		
		long result = 0;
		
		for(int i = 0; i < nums.length; i++)
		{
			int temp = Integer.parseInt(nums[i]);
			result = (result << 8) | temp;
		}
		
		return result;
	}
	

}
