package jianzhi_offer.LinkLists;

/**
 * �����е�����K�����
 */
public class Main_14 {

public static  class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public static class Solution {
        public static ListNode FindKthToTail(ListNode head,int k) {
            ListNode root = head;
            int count = 0;
            while(root!=null){
                count ++;
                root = root.next;
            }
            if(count<k){
                return null;
            }
            //������K���������ڣ�count-k+1����
            for(int i = 1;i<(count-k+1);i++){
                head = head.next;
            }
            head.next = null;
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(4);
        head.next = l1;
        l1.next = l2;
        l2.next = l3;
        ListNode res = Solution.FindKthToTail(head,3);
        System.out.println(res.val);
    }
}
