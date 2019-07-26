package zijie;
/**
 * ��Ŀ����
 *      N����Χ��Ȧ˳���ţ���1�ſ�ʼ��1��2��3˳��������3���˳�Ȧ�⣬��������ٴ�1��2��3��ʼ��������3�������˳�Ȧ�⣬
 *      �������ơ��밴�˳�˳�����ÿ���˳��˵�ԭ��š�Ҫ��ʹ�û���������
 *��������:
 *      �����һ��Ϊ������ʾ��һ��������ݣ�������m��ÿ��һ������N, N������50
 *�������:
 *      ���m�У�ÿ�б�ʾ��Ŀ�����ÿո����
 * ʾ��1
 *      ����
 *         1
 *         4
 *      ���
 *         3  2  4  1
 */
import java.util.LinkedList;
import java.util.Scanner;
public class Main_3 {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    //Լɪ�򻷣�����ʵ��
    public static void solution(int total,int keyNumber){
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < total; i++) {
            list.add(i+1);
        }
        int index = 0;
        while (list.size() > 1) {
            //����
            for (int i = 1; i < keyNumber; i++) {
                if (index == list.size() - 1) {
                    index = 0;
                } else {
                    index++;
                }
            }
            System.out.print(list.remove(index)+" ");
        }
        System.out.println( list.get(0) );
    }
    //ѭ������Ľ���
    public static ListNode createNodes(int total){
        ListNode head = null;
        //����ÿ��ָ��ڵ�
        ListNode [] nodes = new ListNode[total];
        for(int i = 0;i<total;i++){
            //ÿ���ڵ�ı����
            nodes[i] = new ListNode(i+1);
            if(i == 0){
                //ͷ�ڵ�Ϊ��� 1
                head = nodes[i];
            }else{
                //��һ���ڵ�ı����ָ����һ���˵ı��
                nodes[i-1].next = nodes[i];
            }
        }
        //���һ���ڵ�ָ��ͷ�ڵ㣬���ѭ������
        nodes[total-1].next = head;
        return head;
    }
    public static void solution(int total){
        int n = total;
        int m = 3;
        m %= n;
        ListNode head = createNodes(total);
        //ѭ������������������ʣ��һ��������������ָ
        while (head.next !=head){
            //����
            for(int i = 1;i<m-1;i++){
                head = head.next;
            }
            //�ҵ�����Ϊ3���Ǹ���
            ListNode temp = head.next;
            System.out.print(temp.val+" ");
            //������Ϊ3���Ǹ��Ƴ�ѭ���б�
            head.next = temp.next;
            head = head.next;
        }
        System.out.println(head.val);
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int nums = sr.nextInt();
        int m = sr.nextInt();
        for(int i = 0;i<nums;i++){
//            solution(m,3);
            solution(m);
        }
    }
}
