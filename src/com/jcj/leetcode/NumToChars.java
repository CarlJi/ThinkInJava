package com.jcj.leetcode;

public class NumToChars {

	public static void main(String[] args) {

		int num = 26*26*26;

		System.out.println(see_numberToString(num));
	}

	/**
	 * {1, 2, 3, 4, 5, ..., 26} = > {A, B, C, D, E, ..., Z}
	 * 
	 * e.g. 26 = > z, 27 = >AA, 52 = > AZ
	 * 
	 * @param number
	 * @return
	 */
	public static String see_numberToString(int number)
	{
		String result = "";
		
		while(number != 0)
		{
			number = number - 1;
			result = (char)((number % 26) + 'A') + result;
			number = number/26;
		}
		
		return result;
	}
}
