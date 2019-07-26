package vivo.L2019;
//����λ����ż��λ����
public class Main_2 {
    static class  ListNode {
        int val;
        ListNode next ;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args) {
        ListNode hc = new ListNode(0);
        hc.next = new ListNode(1);
        hc.next.next = new ListNode(2);
        hc.next.next.next = new ListNode(3);
        hc.next.next.next.next = new ListNode(4);
        hc.next.next.next.next.next = new ListNode(5);
        hc.next.next.next.next.next.next = new ListNode(6);
        hc.next.next.next.next.next.next.next = new ListNode(7);

        solution(hc);
    }

    private static void solution(ListNode temp) {
        //���������������
        ListNode head = new ListNode(-1);
        ListNode odd = head;
        //ż������Ҫ���������
        ListNode tail = new ListNode(-1);
        ListNode even = tail;
        int i = 0;
        while (temp != null){
            //����λhead
            if(i % 2 !=0){
                head.next = temp;
                temp  = temp.next;
                head = head.next;
            }else{ //ż��λ����
                tail.next = temp;
                temp = temp.next;
                tail = tail.next;
            }
            i++;
        }
        //�����ô˵��
        //������0--1--2--3
        //���������ʱ��Ϊ  odd : -1 -- 0 -- 2 -- 3   even �� -1 -- 1 -- 3 ������Ҫ�ض�
        //���� tail ���� head ���������������һ��ֵ����һ���ǲ���Ҫ�ġ�
        tail.next =null;
        head.next = null;
        //����ת
        ListNode evenRes = reverseList(even.next);
        System.out.print("����λ������Ϊ��");
        printRes(odd.next);
        System.out.println();
        System.out.print("ż��λ������Ϊ��");
        printRes(evenRes);
    }

    private static void printRes(ListNode node) {
        while (node!=null){
            System.out.print(node.val+" ");
            node = node.next;
        }
    }

    private static ListNode reverseList(ListNode node) {
        ListNode pre = null;
        ListNode cur = node;
        while (cur!=null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }


}
