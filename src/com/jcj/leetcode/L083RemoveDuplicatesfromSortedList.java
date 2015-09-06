package com.jcj.leetcode;

public class L083RemoveDuplicatesfromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        while(current!=null)
        {
            if(previous!=null && current.val == previous.val)
            {
                previous.next= current.next;
                current = current.next;
            }
            else
            {
                previous = current;
                current = current.next;
            }
        }
        
        return head;
    }
}
