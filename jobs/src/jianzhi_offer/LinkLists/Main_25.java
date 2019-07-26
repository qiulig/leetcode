package jianzhi_offer.LinkLists;

/**
 *����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩��
 * ���ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 */
public class Main_25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }

    public class Solution {
        public RandomListNode Clone(RandomListNode pHead)
        {
            if(pHead==null)
                return null;
            RandomListNode head = new RandomListNode(pHead.label);
            RandomListNode ans = head;
            if(pHead.random != null)
            {
                head.random = new RandomListNode(pHead.random.label);
            }
            while (pHead.next!=null){
                pHead = pHead.next;
                head.next = new RandomListNode(pHead.label);
                if(pHead.random!=null){
                    head.next.random = new RandomListNode(pHead.random.label);
                }
                head = head.next;
            }
            return ans;
        }
    }
}
