package com.jcj.BeautyOfProgramming;

public class L32TelephoneNumberToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {1,2,3,8,9,3,3,2,2};
		String res = "";
		printWords(nums, 0, res);
	}

	private static char[][] chars = {
		{},
		{},
		{'A','B','C','D'},
		{'D','E','F'},
		{'G','H','I'},
		{'J','K','L'},
		{'M','N','O'},
		{'P','Q','R','S'},
		{'T','U','V'},
		{'W','X','Y','Z'},
	};

	/**
	 * Use recursion method
	 * 
	 * f(n) = f(n-1)+ iterator chars in chars[n]
	 * 
	 * @param numbers
	 * @param index
	 * @param res
	 */
	public static void printWords(int[] numbers, int index, String res)
	{
		if(index == numbers.length -1)
		{
			System.out.println(res);
			return;
		}

		int length = chars[numbers[index]].length;

		// number equals 0 or 1, no chars needed to added into the string
		if(length == 0)
		{
			printWords(numbers, index+1, res);
		}
		else
		{
			for(int i = 0; i < length ; i++)
			{
				printWords(numbers, index+1, res+chars[numbers[index]][i]);
			}
		}
	}

}
