package jianzhi_offer.LinkLists;

import java.util.Stack;

/**
 * ����ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 */
public class Main_5 {
    public static class Solution {
        static Stack<Integer> stack1 = new Stack<Integer>();
        static Stack<Integer> stack2 = new Stack<Integer>();

        public static void push(int node) {
            while (!stack2.empty()) {
                stack1.push(stack2.pop());
            }
            stack1.push(node);
        }

        public static int pop() {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }

        public static void main(String[] args) {
            //���
            push(1);
            push(2);
            push(3);
            pop();
            push(4);
        }
    }
}
