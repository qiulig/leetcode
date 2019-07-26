package jianzhi_offer.LinkLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_56 {

 public static class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
    public static class Solution {
        public static ListNode deleteDuplication(ListNode pHead) {
            ArrayList<Integer> ss = new ArrayList<>();
            ArrayList<Integer> ss2 = new ArrayList<>();
            ListNode res = new ListNode(-1);
            ListNode node = res;
            while(pHead!=null){
                if(!ss.contains(pHead.val)&& !ss2.contains(pHead.val)){
                    ss.add(pHead.val);
                    pHead = pHead.next;
                }else{
                    ss2.add(pHead.val);
                    ss.remove(Integer.valueOf(pHead.val));
                    pHead = pHead.next;
                }
            }
            for(int i = 0;i<ss.size();i++){
                res.next =new ListNode(ss.get(i));
                res = res.next;
            }
            return node.next;
        }

        public static ListNode deleteDuplication2(ListNode pHead) {
            if (pHead == null || pHead.next == null) { // ֻ��0����1����㣬�򷵻�
                return pHead;
            }
            if (pHead.val == pHead.next.val) { // ��ǰ������ظ����
                ListNode pNode = pHead.next;
                while (pNode != null && pNode.val == pHead.val) {
                    // ����ֵ�뵱ǰ�����ͬ��ȫ�����,�ҵ���һ���뵱ǰ��㲻ͬ�Ľ��
                    pNode = pNode.next;
                }
                return deleteDuplication(pNode); // �ӵ�һ���뵱ǰ��㲻ͬ�Ľ�㿪ʼ�ݹ�
            } else { // ��ǰ��㲻���ظ����
                pHead.next = deleteDuplication(pHead.next); // ������ǰ��㣬����һ����㿪ʼ�ݹ�
                return pHead;
            }
        }


        public static void main(String[] args) {
            ListNode node = new ListNode(1);
            node.next = new ListNode(2);
            node.next.next = new ListNode(3);
            node.next.next.next = new ListNode(3);
            node.next.next.next.next = new ListNode(3);
            deleteDuplication2(node);
        }
    }
}
