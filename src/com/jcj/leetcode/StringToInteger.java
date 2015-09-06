package com.jcj.leetcode;

public class StringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myAtoi(" 123sdf "));
	}

	/**
	 * This method need handle all kinds of inputs
	 * 1. Normal - 1234
	 * 2. Negative
	 * 3. Integer.MAX_VALUE
	 * 4. Integer.MIN_VALUE
	 * 5. "  123  "
	 * 6. abc
	 * 7. 123sdf345
	 * 8. " "
	 * 
	 * @param str
	 * @return
	 */
	public static int myAtoi(String str) {
		boolean isNegative = false;
		int i = 0;

		long result = 0;
		if (str == null || str.isEmpty()) return 0;
		
		while(str.charAt(i) == ' ')
		{
			i++;
		}

		if(str.charAt(i) == '-' || str.charAt(i) == '+')
		{
			i++;
			isNegative = (str.charAt(i) == '-');

		}

		while(i < str.length())
		{
			int singleNumber = str.charAt(i) - '0';
			if(singleNumber < 0 || singleNumber >9) break;

			result = result * 10 +	(str.charAt(i) - '0');
			if(isNegative && (-result < Integer.MIN_VALUE))
			{
				return Integer.MIN_VALUE;
			}
			else if (!isNegative && result > Integer.MAX_VALUE)
			{
				return Integer.MAX_VALUE;
			}
			i++;
		}

		return isNegative? -(int)result: (int)result;

	}

}
