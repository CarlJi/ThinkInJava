package com.carl.linkedlist;

import com.jcj.leetcode.ListNode;

public class JudgeListContainsCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
        
	}
	
	/**
	 * Test Cases:
	 * 1. null
	 * 2. single node
	 * 3. Contains circle
	 * 4. Not contains circle
	 * 
	 * 
	 * @param head
	 * @return
	 */
	public static boolean hasCircle(ListNode head)
	{
		if(head == null) return false;
		
		ListNode fast = head;
		ListNode slow = head;
		
		while (fast.next != null && fast.next.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow)
			{
				return true;
			}
			
		}
		
		return false;
	}

	
	
}
