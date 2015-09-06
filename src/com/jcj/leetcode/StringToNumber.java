package com.jcj.leetcode;

public class StringToNumber {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(reverseBits_2(1));
	}

	/**
	 * Parse string to Integer
	 * @param str
	 * @return
	 */
	static int parseToInt(String str)
	{
		int result = 0;
		for(int i  = 0; i < str.length(); i ++)
		{
			result = result * 26 + (str.charAt(i) - 'A' + 1) ;
		}

		return result;
	}

	static String parseToString(int number)
	{
		return "";
	}


	static int reverse(int x) {
		long  result = 0;
		while( x != 0)
		{
			result = result * 10 + x % 10;
			x = x / 10;
		}

		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
		{
			return 0;
		}

		return (int)result;
	}
	
    public static int reverseBits(int n) {
        int result = 0;
        int flag = 0; 
        while( n != 0)
        {
            flag++;
            result = result*2 + n % 2;
            n = n / 2;
        }
        
        while(flag<32)
        {
           flag++;
           result = result << 1;
        }
        
        return result;
    }
    
    static int reverseBits_2(int n) {
        int result = 0;
        for(int i = 0; i < 32; ++i)
        {
            result = result * 2 + (n & 1);
            n >>= 1;
        }
        
        return result;
      }

}
