package com.jcj.leetcode;

import com.carl.util.Util;

public class L024SwapNodesinPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		l1.next = l2;
		
		Util.printListNode(swapPairs(l1));
		
	}
	
	/**
	 * Requirements:
	 * 1. Only use constant space
	 * 2. Not modify the value in the list, only node itself can be chagned
	 * 
	 * 
	 * Test Cases:
	 * 1. odd number?
	 * 2. length < 2
	 * 3. null
	 * 4.
	 * 
	 * Case i forgot:(Very important)
	 * 1. [1,2]
	 * 2. [1,2,3,4]
	 * 
	 * Refer:https://leetcode.com/discuss/34343/java-constant-space-and-linear-time-solution
	 * 
	 * @param head
	 * @return
	 */
    public static ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode first = dummy;
        dummy.next = head;
        while(head != null && head.next != null)
        {
        	ListNode temp = head.next.next;
        	dummy.next = head.next;
        	dummy = dummy.next;
        	dummy.next = head;
        	dummy= dummy.next;
        	head.next = temp;
        	head = temp;
        	
        }
        
        return first.next;
    }

}
