package com.jcj.leetcode;

public class L206ReverseLinkedList {

	public ListNode reverseList(ListNode head) {
		ListNode previous = head.next;
		ListNode current = null;
		if(head.next != null) 
			current = head.next.next;
		previous.next = null;
		while(current != null)
		{
			ListNode behind = current.next;
			current.next = previous;
			previous = current;
			current = behind;
		}

		return previous;
	}
	
	/**
	 * Refer: https://leetcode.com/discuss/34474/in-place-iterative-and-recursive-java-solution
	 * 
	 * Use only two nodes!!
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList_2(ListNode head)
	{
		ListNode previous= null;
		while(head!=null)
		{
			ListNode temp = head.next;
			head.next = previous;
			previous = head;
			head = temp;
		}
		
		return previous;
		
	}

}
