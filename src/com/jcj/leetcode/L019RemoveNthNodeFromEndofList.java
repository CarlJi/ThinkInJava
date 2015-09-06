package com.jcj.leetcode;


public class L019RemoveNthNodeFromEndofList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 */
	public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode fast = head;
       ListNode slow = head;
       
       while(fast != null)
       {
    	   fast = fast.next;
    	   if(n-- < 0 )
    	   {
    		   slow = slow.next;
    	   }
       }
       
       if(n == 0)
       {
    	   head=head.next;
       }
       else if (n >0)
       {
    	   return null;
       }
       else
       {
    	   slow.next = slow.next.next;
       }
       
       return head;
	}
	
	/**
	 * Refer: https://leetcode.com/discuss/1656/is-there-a-solution-with-one-pass-and-o-1-space
	 * 
	 * Test case:
	 * 
	 * length = n
	 * length > n
	 * 
	 * I forget the following scenarios:
	 *  [1,2] - 1
	 *  [1] - 1
	 *  
	 * @param head
	 * @param n
	 * @return
	 */
	public ListNode removeNthFromEnd_2(ListNode head, int n) {
	       ListNode fast = head;
	       ListNode slow = head;
	      
	       for(int i = 0; i < n; i++)
	       {
	    	   fast = fast.next;
	       }
	       
	       if(fast == null)
	       {
	    	   return slow.next;
	       }
	       
	       while(fast !=null)
	       {
	    	   fast= fast.next;
	    	   slow=slow.next;
	       }
	       
	       slow.next = slow.next.next;
	       
	       return head;
	       
		}

}
