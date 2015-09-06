package com.jcj.leetcode;

public class L160IntersectionofTwoLinkedLists {

	/**
	 * 
	 * Test Cases:
	 * 1. 1, 1
	 * 2, 1, 2
	 * 3, 1->2->3, 2>3
	 * 4, 2->3, 1->2->3
	 * 
	 * 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		int i = getLength(headA);
		int j = getLength(headB);

		ListNode cA = headA;
		ListNode cB = headB;

		while(i > j && cA !=null)
		{
			i--;
			cA = cA.next;
		}

		while(i < j && cB !=null)
		{
			j--;
			cB = cB.next;
		}

		while(cA != null && cB != null)
		{
			if (cA == cB)
			{
				return cA;
			}
			else
			{
				cA = cA.next;
				cB = cB.next;
			}
		}

		return null;

	}

	private int getLength(ListNode head)
	{
		int i = 0;
		while(head!=null)
		{
			i++;
			head = head.next;
		}

		return i;
	}

	/**
	 * Refer: https://leetcode.com/discuss/24274/my-accepted-java-solution-with-o-n-time-and-o-1-space
	 * 
	 * No need extra method
	 * 
	 * I forgot !!!:
	 * 
	 * 1, [1], []
	 * 
	 * 
	 * @param headA
	 * @param headB
	 * @return
	 */
	public ListNode getIntersectionofTwoLinkedLists(ListNode headA, ListNode headB)
	{
		if(headA == null || headB == null)
		{
			return null;
		}
		ListNode pA = headA;
		ListNode pB = headB;
		ListNode eA = null, eB=null;
		while (pA != pB)
		{
			if(eA != null && eB != null && eA != eB)
			{
				return null;
			}
			if(pA.next != null)
			{
				pA = pA.next;
			}
			else
			{
				eA = pA;
				pA = headB;
			}

			if(pB.next != null)
			{
				pB = pB.next;
			}
			else
			{
				eB = pB;
				pB = headA;
			}
		}
		return pA;
	}

}
