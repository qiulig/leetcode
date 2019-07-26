package jianzhi_offer.LinkLists;

import java.awt.print.Pageable;

public class Main_55 {
    public class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                fast=pHead;
            }
            while (fast!=slow){
                fast = fast.next;
                slow = slow.next;
            }
            return fast;
        }
        return null;
    }
}
