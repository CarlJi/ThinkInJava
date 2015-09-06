package com.jcj.leetcode;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Test Cases:
	 * 1. 121
	 * 2. 1221
	 * 3. 1111
	 * 4. -121
	 * 5. 12345
	 * 6. 1
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome(int x) {
		long reverse = 0;
		long temp = x;
		while(x != 0)
		{
			reverse = reverse * 10 + x%10;
			x = x/10;
		}

		return (temp == reverse);
	}
	
	/**
	 * Refer: http://articles.leetcode.com/2012/01/palindrome-number.html
	 * 
	 * @param x
	 * @return
	 */
	public static boolean isPalindrome_2(int x) {
        if(x<0) return false;
        int div = 1;
        while(x/div >= 10)
        {
            div *= 10;
        }

		while(x != 0)
		{
			int f = x/div;
			int l = x % 10;
			if(f != l) return false;
			x = (x % div)/10;
			div = div/100;
		}

		return true;
	}
	

}
