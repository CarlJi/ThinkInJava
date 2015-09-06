package com.jcj.string;

import java.util.HashMap;
import java.util.HashSet;

public class FindFirstCharWithoutDuplucates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Test Cases:
	 * 1. null
	 * 2. one single char
	 * 3. a,a
	 * 4. a,b,a
	 * 5. large str
	 * 6. multi-thread
	 * 
	 * 
	 * @param str
	 * @return
	 */
	public static Character findFirstCharWithoutDuplicates(String str)
	{
		if (str == null ) return null;
		
		
		if(str.length() == 1) return str.charAt(0);
		
		HashMap<Character, Integer> chars = new HashMap<Character, Integer>();
		
		for(int i =0; i<str.length();i++)
		{
			if(chars.containsKey(str.charAt(i)))
			{
				chars.put(str.charAt(i), chars.get(str.charAt(i)) + 1);
			}
			
			chars.put(str.charAt(i), 0);
		}
		
		for(int i =0; i < str.length(); i++)
		{
			if(chars.get(str.charAt(i)) == 0)
			{
				return str.charAt(i);
			}
		}
		
		return null;
				
	}
}
