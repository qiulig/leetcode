package jianzhi_offer.Stack;

import java.util.Stack;

/**
 *����ջ�����ݽṹ�����ڸ�������ʵ��һ���ܹ��õ�ջ��������СԪ�ص�min������ʱ�临�Ӷ�ӦΪO��1������
 */

/**
 * ����˼·�����ø���ջ���洢����ջ����Сֵ������ջ�ͳ�ջ��ʱ������ջ����Сֵջ���бȽϡ�
 ��ջʱ������ֵ����Сֵջ��ջ����С���򽫸�ֵͬʱpush����Сֵջ��
 ��ջʱ��������ջ��ջ������Сֵջջ��һ�£���ͬʱ��ջ��
 ���򣬽�������ջpop��ͨ����һ��������Сֵջ��ջ������Զ������ջԪ���е�����ֵ��
 */
public class Main_20 {

    public class Solution {

        Stack<Integer> data_stack =new Stack<>();
        Stack<Integer> min_stack = new Stack<>();
        public void push(int node) {
            if(min_stack.isEmpty()||min_stack.peek()>=node){
                min_stack.push(node);
            }else {
                min_stack.push(min_stack.peek());
            }
            data_stack.push(node);
        }
        //��ջ
        public void pop() {
            if(data_stack.empty()||min_stack.empty())
            {
                return;
            }
            data_stack.pop();
            min_stack.pop();
        }

        public int top() {
            if(!data_stack.isEmpty())
            {
                return data_stack.peek();
            }
            return 0;
        }

        public int min() {
            if(!min_stack.empty())
            {
                return min_stack.peek();
            }
            return 0;
        }
    }
}
