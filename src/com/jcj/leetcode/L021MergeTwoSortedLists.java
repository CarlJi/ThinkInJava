package com.jcj.leetcode;

public class L021MergeTwoSortedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Test case:
	 * 1. [[1,3,5][2,4,6]]
	 * 2. [[1,4,5,6] [2,3,7,8]]
	 * 3. [1,1,4,5,6] [2,2,2,3,]
	 * 
	 * 
	 * Note: The most important is involve one fake node
	 * 
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode dummy = new ListNode(0);
		ListNode head = dummy;
		
		while(l1!= null && l2 != null)
		{
			if(l1.val > l2.val)
			{
				dummy.next = l2;
				l2=l2.next;
			}
			else
			{
				dummy.next = l1;
				l1= l1.next;
			}
			dummy = dummy.next;
		}
		
		if(l1!=null)
		{
			dummy.next = l1;
		}
		
		if(l2!=null)
		{
			dummy.next = l2;
		}
		
		return head.next;
	}

}
