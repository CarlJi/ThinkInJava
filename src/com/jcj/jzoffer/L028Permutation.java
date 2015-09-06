package com.jcj.jzoffer;

public class L028Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		permutation("abc");
	}
	
	/**
	 * https://github.com/julycoding/The-Art-Of-Programming-By-July/blob/master/ebook/zh/01.06.md
	 * 
	 * O(n!)
	 * @param str
	 */
	public static void permutation(String str)
	{
		if(str == null) return;
		
		char[] chars = str.toCharArray();
        permutation(chars, 0);
	}
	
	public static void permutation(char[] chars, int start)
	{
		if(start == chars.length)
		{
			System.out.println(chars);
		}
		else
		{
			for(int i = start; i < chars.length; i++)
			{
				swap(chars, i, start);
				permutation(chars, start+1);
				swap(chars, i, start);
			}
		}
		
	}
	
	public static void swap(char[] chars, int s, int t)
	{
		char temp = chars[s];
		chars[s] = chars[t];
		chars[t] = temp;
	}

}
