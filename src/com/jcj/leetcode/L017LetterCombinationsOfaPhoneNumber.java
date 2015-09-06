package com.jcj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.carl.util.Util;

public class L017LetterCombinationsOfaPhoneNumber {

	public static void main(String[] args) {

		//List<String> results = letterCombinations("");
		
		Util.printList(letterCombinations_2("123"));

	}

	/**
	 * TestCases:
	 * 1. ""
	 * 2. each single number like 1,2,3,...
	 * 2. "123"
	 * 3. "1122234343247890"
	 * 
	 * Refer: https://github.com/rffffffff007/leetcode/blob/master/Letter%20Combinations%20of%20a%20Phone%20Number.java
	 * 
	 * @param digits
	 * @return
	 */
	public static List<String> letterCombinations(String digits) {
		List<String> results = new ArrayList<String>();
		char[] cc = new char[digits.length()];
		appendChars(results, cc, 0, digits);
		return results;
	}

	private static void appendChars(List<String> results, char[] cc, int i, String digits)
	{
		if(i == digits.length())
		{
			results.add(new String(cc));
			return;
		}

		String value = letterMaps.get(digits.charAt(i));
		if(value.equals(""))
		{
			appendChars(results, cc, i+1, digits);
		}
		else
		{
			for(int j = 0; j < value.length(); j++)
			{
				cc[i]=value.charAt(j);
				appendChars(results, cc, i+1, digits);
			}
		}
	}

	static final Map<Character, String> letterMaps = new HashMap<Character, String>();
	static{
		letterMaps.put('1', "");
		letterMaps.put('2', "abc");
		letterMaps.put('3', "def");
		letterMaps.put('4', "ghi");
		letterMaps.put('5', "jkl");
		letterMaps.put('6', "mno");
		letterMaps.put('7', "pqrs");
		letterMaps.put('8', "tuv");
		letterMaps.put('9', "wxyz");
		letterMaps.put('0', "");
	}



	/**
	 * Refer: https://leetcode.com/discuss/24431/my-java-solution-with-fifo-queue
	 *  
	 * @param digits
	 * @return
	 */
	public static List<String> letterCombinations_2(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		ans.add("");
		for(int i =0; i<digits.length();i++){
			int x = Character.getNumericValue(digits.charAt(i));
			while(ans.peek().length()==i){
				String t = ans.remove();
				for(char s : mapping[x].toCharArray())
					ans.add(t+s);
			}
		}
		return ans;
	}

}
