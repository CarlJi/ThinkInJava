package com.jcj.leetcode;

import java.util.ArrayList;
import java.util.List;

public class L028ImplementStrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(strStr_KMP("mississippi", "issipi"));
		//		String a = "abc";
		//		a.indexOf("d");
	}

	/**
	 * Bruth force method
	 * 
	 * Scenarios i forgot:
	 * 1. "mississippi", "issip"
	 * 2. "mississippi", "issipi"
	 * 
	 * Important:
	 * 1. if needle equals "", need return 0;
	 * 2. Keep in mind: i < haystack.length() && (haystack.length() - i >= needle.length()) 
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr(String haystack, String needle) {
		if(needle.length() < 1) return 0;

		for(int i = 0; i < haystack.length() && (haystack.length() - i >= needle.length()); i ++)
		{
			int j = 0;
			int temp = i;
			for( ;j < needle.length(); j++)
			{
				if (temp< haystack.length() && haystack.charAt(temp) == needle.charAt(j))
				{
					temp++;
				}
				else
				{
					break;
				}
			}

			if(j == needle.length())
				return i;
		}
		return -1;

	}

	/**
	 * Refer: https://leetcode.com/discuss/17991/sharing-my-easy-understand-java-solution
	 * 
	 * Test Scenarios:
	 * 
	 * 
	 * I forgot:
	 * 1. "a", ""
	 * 2. "", ""
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr_2(String haystack, String needle) {
		if (needle=="") return 0;
		int i=0;
		int j=0;
		int k=0;
		while(i<haystack.length() && haystack.length()-i>=needle.length()){
			k=i;
			while(j<needle.length()){
				if(haystack.charAt(k)!=needle.charAt(j)){
					j=0;
					break;
				}
				j++;
				k++;
			}
			if(j==needle.length()) return i;
			i++;
		}
		return -1;
	}

	/**
	 * 
	 * @param haystack
	 * @param needle
	 * @return
	 */
	public static int strStr_KMP(String haystack, String needle)
	{
		if(needle.length() < 1) return 0;

		List<Integer> pt = getPartialMatchTable(needle);

		int m = 0;

		while(m < haystack.length() && (haystack.length() - m >= needle.length()))
		{
			int i = 0;
			for(; i < needle.length(); i++)
			{
				if(haystack.charAt(m+i) != needle.charAt(i))
				{
					if(i != 0)
					{
						m = m + (i -1 - pt.get(i -1));
					}
					break;
				}
			}

			if( i == needle.length())
			{
				return m;
			}
			m++;
		}

		return -1;
	}

	public static List<Integer> getPartialMatchTable(String str)
	{
		List<Integer> partialMatchTable = new ArrayList<Integer>();

		StringBuilder key = new StringBuilder();
		for(int i = 0; i < str.length(); i++)
		{
			key.append(str.charAt(i));
			partialMatchTable.add(calcPartiaMatchTable(key.toString()));
		}

		return partialMatchTable;
	}

	private static int calcPartiaMatchTable(String str)
	{
		if(str == null)
		{
			return -1;
		}
		if(str.length() == 1)
		{
			return 0;
		}

		return getLongestKey(getPrefixStrings(str), getSubffixStrings(str));
	}

	private static List<String> getPrefixStrings(String str)
	{
		List<String> result = new ArrayList<String>();
		StringBuilder prefix = new StringBuilder();
		for(int i = 0; i < str.length() - 1; i++)
		{
			prefix.append(str.charAt(i));

			result.add(prefix.toString());
		}

		return result;
	}

	private static List<String> getSubffixStrings(String str)
	{

		List<String> tempSB = new ArrayList<String>();
		for(int i = 1 ; i < str.length() ; i ++)
		{
			tempSB.add(str.substring(i));
		}

		return tempSB;
	}

	private static int getLongestKey(List<String> strOne, List<String> strTwo)
	{
		for(int i = 0; i < strTwo.size(); i ++)
		{
			if(strTwo.get(i).equals(strOne.get(strOne.size() - 1 - i)))
			{
				return strTwo.get(i).length();
			}
		}


		return 0;
	}
}
