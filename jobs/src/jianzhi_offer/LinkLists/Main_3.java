package jianzhi_offer.LinkLists;

import java.util.ArrayList;
import java.util.Stack;
/**
 * ����һ������������ֵ��β��ͷ��˳�򷵻�һ��ArrayList��
 */
public class Main_3 {
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static class Solution {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack = new Stack<>();
            while (listNode != null) {
                stack.push(listNode.val);
                listNode = listNode.next;
            }

            ArrayList<Integer> list = new ArrayList<>();
            while (!stack.isEmpty()) {
                list.add(stack.pop());
            }
            return list;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        l1.next = l2;
        l2.next = l3;
        ArrayList<Integer> res = Solution.printListFromTailToHead(l1);
        for (int i = 0; i < res.size(); i++) {
            System.out.print(res.get(i) + " ");
        }
    }
}