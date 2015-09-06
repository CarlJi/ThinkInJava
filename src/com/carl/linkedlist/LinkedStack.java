package com.carl.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.carl.util.Util;

public class LinkedStack<T> {
	
	public static void main(String[] args)
	{
		List<String> strs = new ArrayList<String>();
		strs.add("abc");
		strs.add("a");
		strs.add("bcd");
		strs.add("ac");
		strs.add("bc");
		
		Collections.sort(strs);
		
		Util.printList(strs);
		
	}

}
