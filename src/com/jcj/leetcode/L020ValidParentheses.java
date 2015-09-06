package com.jcj.leetcode;

import java.util.Stack;

public class L020ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String result = ")}{({))[{{[}";
		System.out.println(isValid(result));
	}

	/**
	 * Test Cases:
	 * 1. "" or null
	 * 2. s.length() == odd number
	 * 3. []
	 * 4. [}
	 * 5. {[]}
	 * 6. {}[]
	 * 7. [(])[
	 * 8. ([{}])
	 * 9. ({)}[]
	 * 
	 * I forgot the following scenarios:
	 * ")}{({))[{{[}"
	 * 
	 * @param s
	 * @return
	 */
	public static boolean isValid(String s) {
		if(s==null || s=="" || (s.length()%2 != 0))
			return false;

		Stack<Character> cp = new Stack<Character>();
		for(int i = 0 ; i < s.length(); i++)
		{
			switch(s.charAt(i))
			{
			case '}':
				if(!cp.isEmpty() && cp.peek() == '{')
					cp.pop();
				else
					return false;
				break;
			case ')':
				if(!cp.isEmpty()&& cp.peek() == '(')
					cp.pop();
				else
					return false;
				break;

			case ']':
				if(!cp.isEmpty() && cp.peek() == '[')
					cp.pop();
				else
					return false;
				break;
			default:
				cp.push(s.charAt(i));
			}
		}

		if(cp.isEmpty())
			return true;
		return false;
	}

}
