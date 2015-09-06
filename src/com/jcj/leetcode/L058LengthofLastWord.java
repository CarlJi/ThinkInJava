package com.jcj.leetcode;

public class L058LengthofLastWord {
	
	public static void main(String... args)
	{
		String s = "Hello World";
		System.out.println(lengthOfLastWord(s));
	}

    public static int lengthOfLastWord(String s) {
        if(s == null) return 0;
        String[] words = s.split("\\s+");
        if(words.length < 1) return 0;
        return words[words.length - 1].length();
    }
    
    /**
     * Refer: https://leetcode.com/discuss/32547/my-accepted-java-solution
     * 
     * Not use split method
     * 
     * @param s
     * @return
     */
    public static int lengthOfLastWord_2(String s)
    {
    	int length = s.length() -1;
    	int last = length;
    	while(last >= 0 && s.charAt(last) == ' ')
    	{
    		last--;
    	}
    	int res = 0;
    	while(last >= 0 && s.charAt(last) != ' ')
    	{
    		 res ++;
    		
    		 last--;
    	}
    	
    	return res;
    }
}
