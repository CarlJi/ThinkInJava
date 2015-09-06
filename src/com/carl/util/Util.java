package com.carl.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.jcj.leetcode.ListNode;

public class Util {

	private Util(){}
	
	public static int[] getRandomArray(int max, int length)
	{
		int[] res = new int[length];
		for(int i = 0; i<length; i++)
		{
			res[i] = new Random().nextInt(max);
		}
		
		return res;
	}
	
	public static List<Integer> getRandomList(int count)
	{
		List<Integer> ls = new ArrayList<Integer>();
		for(int i = 0; i < count; i++)
		{
			ls.add((new Random().nextInt(10000)));
		}
		return ls;
	}
	
	public static <T> void printList(List<T> ls)
	{
		for(int i = 0; i < ls.size(); i++)
		{
			System.out.println("" + ls.get(i));
		}
	}
	
	public static  void printArray(int[] ls)
	{
		for(int i = 0; i < ls.length; i++)
		{
			System.out.println("" + ls[i]);
		}
	}
	
	public static void printRunTime()
	{}
	
	public static void printListNode(ListNode ln)
	{
		while(ln!=null)
		{
			System.out.println(ln.val);
			ln = ln.next;
		}
	}
	
	public static void generateTree()
	{
		
	}
	

}
