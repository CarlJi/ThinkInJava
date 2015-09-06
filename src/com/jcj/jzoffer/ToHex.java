package com.jcj.jzoffer;

public class ToHex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(floatToHex(Float.MAX_VALUE));
		
		Float.toHexString(1.0f);
	}
	
	public static String floatToHex(float m)
	{
		boolean isNegative = false;
		String num = m+"";
		if(m < 0)
		{
			isNegative = true;
			num = -m +"";
		}
		
		long partOne = Long.parseLong(num.substring(0, num.indexOf('.')));
		long partTwo = Long.parseLong(num.substring(num.indexOf('.')+1));
		
		String temp = intToHex(partTwo);
		if(temp == "0")
		{
			return isNegative ? "-"+intToHex(partOne):intToHex(partOne);
		}
		
		return isNegative ? "-"+intToHex(partOne) + "." + intToHex(partTwo):intToHex(partOne) + "."+ intToHex(partTwo);
		
	}
	
	public static String intToHex(long n)
	{
		char[] base = new char[]{'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E', 'F'};
		String result = "";
		while(n!=0)
		{
			result = base[(int)(n%16)] + result;
			n=n/16;
		}
		
		return result==""?"0":result;
	}
}
