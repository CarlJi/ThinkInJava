package com.jcj.leetcode;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abcb";
		System.out.println(lengthOfLongestSubstring_2(s));
	}
	
	/**
	 * My first implementation
	 * @param s
	 * @return
	 */
    public static int lengthOfLongestSubstring_1(String s) {
        HashMap<Character, Integer> charsMap = new HashMap<Character, Integer>();
        int max = 0;
        for(int i = 0; i < s.length(); i ++)
        {
        	char tempChar = s.charAt(i);
        	if(charsMap.containsKey(tempChar))
        	{
        		max = Math.max(max, charsMap.keySet().size());
        		i = charsMap.get(tempChar);
        		charsMap.clear();
        	}
        	else
        	{
        		charsMap.put(tempChar, i);
        	}
        }
        
        return max;
    }
    
    /**
     * Base: http://articles.leetcode.com/2011/05/longest-substring-without-repeating-characters.html
     * 
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring_2(String s)
    {
    	int start = 0;
    	int max = 0;
    	boolean[] bools = new boolean[256];
    	int i = 0;
    	for(; i < s.length(); i++)
    	{
    		int temp = (int)(s.charAt(i));
    		if(bools[temp])
    		{
    			max = Math.max(max, i - start);
    			while(s.charAt(i)!= s.charAt(start))
    			{
    				bools[s.charAt(start)] = false;
    				start++;
    			}
    			start++;
    		}
    		else
    		{
    			bools[temp] = true;
    		}
    	}
    	
    	return Math.max(max, i - start);
    }

}
