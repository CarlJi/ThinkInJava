package com.jcj.jzoffer;

import java.util.Stack;

public class L028Combination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		combination("abcd");
	}

	/**
	 * http://blog.csdn.net/beiyeqingteng/article/details/7051942
	 * 
	 * @param str
	 */
	public static void combination(String str)
	{
		if(str == null) return;

		Stack<Character> stacks = new Stack<Character>();

		for(int i =1; i<=str.length(); i++)
		{
			combination(str, 0, i, stacks);
		}
	}

	public static void combination(String str, int start, int number, Stack<Character> stack)
	{
		if(number == 0)
		{
			System.out.println(stack.toString());
			return;
		}

		if(start == str.length())
		{
			return;
		}

		stack.push(str.charAt(start));
		combination(str, start+1, number -1, stack);
		stack.pop();
		combination(str, start+1, number, stack);
	}

}
