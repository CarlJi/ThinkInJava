package com.jcj.interview;

public class ToHex {

	public static void main(String[] args) {
		System.out.println(floatToHex(0.0f));
	}

	public static char[] base = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E', 'F'};
	public static int MAX_LENGTH = 6;

	public static String floatToHex(float m)
	{
		boolean isNegative = false;
		if(m < 0)
		{
			isNegative = true;
			m=-m;
		}

		long partOne = (long)m;
		float partTwo = m - partOne;

		String resOne = intToHex(partOne);
		String resTwo = decimalsToHex(partTwo);

		return isNegative ? "-"+resOne + "." + resTwo: resOne + "." + resTwo;
	}

	public static String intToHex(long n)
	{
		String result = "";
		while(n!=0)
		{
			result = base[(int)(n%16)] + result;
			n=n/16;
		}

		return result==""?"0":result;
	}

	/**
	 * About how to convert decimals to hex, please refer http://202.197.191.206:8080/23/text/ch02/se01/part2/r2_1_2_3.htm
	 * 
	 * @param n
	 * @return
	 */
	public static String decimalsToHex(float n)
	{
		if(n != 0)
		{
			String decimals = "";
			while(n != 0 && decimals.length() <= MAX_LENGTH)
			{
				int temp = (int)(n*16);
				decimals = decimals + base[temp];
				n = n*16 - temp;
			}

			return decimals;
		}

		return "0";
	}
}
