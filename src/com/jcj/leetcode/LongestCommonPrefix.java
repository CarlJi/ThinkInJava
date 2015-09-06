package com.jcj.leetcode;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * General Solution
	 * 
	 * Test Cases
	 * 1. []
	 * 2. null
	 * 3. ["", "ab"]
	 * 4. ["abc", "abcd", "ab"]
	 * 5. Normal
	 * 
	 * @param strs
	 * @return
	 */
	public static String longestCommonPrefix(String[] strs) {
        if(strs.length < 1 || strs[0].length() < 1) return "";

		String firstStr = strs[0];

		for(int i =0; i < firstStr.length(); i++)
		{
			char temp = firstStr.charAt(i);
			for (int j = 1; j < strs.length; j++ )
			{
				if(i>=strs[j].length() || (i < strs[j].length() && temp != strs[j].charAt(i)))
				{
					return firstStr.substring(0, i);
				}
			}
		}
		return firstStr;
	}
}
