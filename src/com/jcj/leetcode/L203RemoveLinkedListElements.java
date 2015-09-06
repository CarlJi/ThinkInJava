package com.jcj.leetcode;

public class L203RemoveLinkedListElements {

	/**
	 * 
	 * I forgot !!!!:
	 * 1. [1], 1
	 * 
	 * 
	 * @param head
	 * @param val
	 * @return
	 */
	public ListNode removeElements(ListNode head, int val) {
		ListNode pre = null;
		ListNode cur = head;
		while(cur != null)
		{
			if(cur.val == val)
			{
				if(pre == null)
				{
					head=head.next;
				}
				else
				{
					pre.next = cur.next;
				}
				cur = cur.next;
			}
			else
			{
				pre = cur;
				cur = cur.next;
			}
		}

		return head;
	}

}
