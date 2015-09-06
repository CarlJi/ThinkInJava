package com.jcj.jzoffer;

public class L010CountOne {
	
	public static void main(String[] args) throws Exception
	{
		System.out.println(countOne(-1));
	}
	
	public static int countOne(int n) throws Exception
	{
		int count = 0;
		while(n !=0)
		{
			count++;
			n=n&(n-1);
		}
		
		return count;
	}

}
