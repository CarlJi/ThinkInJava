package com.jcj.leetcode;

public class L125ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(isPalindrome("!#!"));
	}

	/**
	 * Test Cases:
	 * 1. null
	 * 2. ""
	 * 3. "ac"
	 * 4. "aa"
	 * 5. "a$a"
	 * 
	 * I forgot!!!
	 * 1. "1a2"
	 * 
	 * 
	 * Notes: 问清楚各种特殊字符的处理问题, 比如数字，比如“！！！”， “!#!”
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isPalindrome(String s) {
       
		if(s == null || s.isEmpty()) return true; // Remember this

		String ls = s.toLowerCase();
		int start = 0;
		int end = ls.length() -1;
		while(start < end)
		{
			
			if(!isValidChar(ls.charAt(start)))
			{
				start++;
				continue;
			}

			if(!isValidChar(ls.charAt(end)))
			{
				end--;
				continue;
			}

			if(ls.charAt(start) == ls.charAt(end))
			{
				start ++;
				end --;
			}
			else
			{
				return false;
			}
		}
		
		if(start >= end)
			return true;
		return false;
	}
	
	/**
	 * 或者直接使用 Character.isLetterOrDigit 方法
	 * @param a
	 * @return
	 */
	private static boolean isValidChar(Character a)
	{
		return  (a >= 'a' &&  a <= 'z') || (a >= '0' && a <= '9');
	}

}
