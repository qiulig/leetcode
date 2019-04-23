package LinkLists;

import sun.awt.EventQueueItem;


public class Main_2 {
        //leetcode第二题：两数相加

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
        public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode ress = new ListNode(0);
            ListNode res = ress;
            int flag = 0;
            while(l1!=null ||l2!=null){
                int x = l1!=null ?l1.val:0;
                int y = l2!=null?l2.val:0;
                int value = x+y+flag;
                flag = value/10;
                res.next = new ListNode(value%10);
                res = res.next;   //
                if(l1!=null)
                    l1 = l1.next;
                if(l2!=null)
                    l2 = l2.next;
            }
            if(flag>0)
                res.next = new ListNode(flag);
            return ress.next;

        }

        public static void main(String[] args) {
            ListNode l1 = new ListNode(2);
            ListNode a = new ListNode(4);
            ListNode a1 = new ListNode(3);
            l1.next = a;
            a.next = a1;
            System.out.println();
            ListNode l2 = new ListNode(5);
            ListNode b = new ListNode(6);
            ListNode b1 = new ListNode(4);
            l2.next = b;
            b.next = b1;
            ListNode s = addTwoNumbers(l1,l2);
        }

}
