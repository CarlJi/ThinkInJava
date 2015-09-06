package com.jcj.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.carl.util.Util;

public class L022GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Util.printList(generateParentheis(10));
	}
	
	/**
	 * Refer:https://leetcode.com/discuss/37625/java-recursive-solution
	 * 
	 * Test Case:
	 * 1. n < 1
	 * 2. n =1;
	 * 3. n =2
	 * 4. n =3
	 * 5. n = 10
	 * 
	 * 
	 * @param n
	 * @return
	 */
	public static List<String> generateParentheis(int n)
	{
		List<String> results = new ArrayList<String>();
		
		if(n < 1) return results;
		
		if(n == 1)
		{
		   results.add("()");
		   return results;
		}
		
		List<String> previous = generateParentheis(n-1);
		Set<String> newParentheis = new HashSet<String>();
		for(int i =0; i < previous.size(); i++)
		{
			String temp = previous.get(i);
			for(int j=0; j < temp.length(); j ++)
			{
				newParentheis.add(temp.substring(0,j) + "()" + temp.substring(j));
			}
			newParentheis.add(temp+"()");
		}
		
		results.addAll(newParentheis);
		return results;
	}

}
