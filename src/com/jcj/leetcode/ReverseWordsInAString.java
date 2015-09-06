package com.jcj.leetcode;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String src = "a   b ";

		System.out.println(reverseWords_2(src));

	}

	public static String reverseWords(String source)
	{
		String[] wordsArray = source.split("\\s+");	
		String result= wordsArray[0];

		for(int i = 1; i < wordsArray.length; i++)
		{
			result = wordsArray[i] + " "+ result;
		}

		return result;
	}
	
	public static String reverseWords_2(String s)
	{
		String[] wordsArray = s.trim().split("\\s+");	
		StringBuilder result = new StringBuilder();
		
		for(int i = wordsArray.length - 1; i >= 0 ; i--)
		{
		    if(i == 0)
		    {
		      result.append(wordsArray[i]);
		    }
		    else
		    {
			  result.append(wordsArray[i] + " ");
		    }
		}
		
		return result.toString();
	}

}
