package jianzhi_offer.LinkLists;

/**
 * �������������ҳ����ǵĵ�һ��������㡣
 */
public class Main_35 {

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public class Solution {
        public ListNode FindFirstCommonNode(ListNode head1, ListNode head2) {
            if (head1 == null || head2 == null) {
                return null;
            }
            ListNode cur1 = head1;
            ListNode cur2 = head2;
            int n = 0;
            //�õ���ֵ����head1.length-head2.length��
            while (cur1.next != null) {
                n++;
                cur1 = cur1.next;
            }
            while (cur2.next != null) {
                n--;
                cur2 = cur2.next;
            }
            //�ཻΪY�������һ�����Ӧ����ͬ
            if (cur1 != cur2) {
                return null;
            }
            cur1 = n > 0 ? head1 : head2;
            cur2 = cur1 == head1 ? head2 : head1;
            n = Math.abs(n);//��ֵ��
            //�߲�ֵ��
            while (n != 0) {
                n--;
                cur1 = cur1.next;
            }
            //���ʱ��Ϊ�ཻ��
            while (cur1 != cur2) {
                cur1 = cur1.next;
                cur2 = cur2.next;
            }
            return cur1;
        }
    }
}
