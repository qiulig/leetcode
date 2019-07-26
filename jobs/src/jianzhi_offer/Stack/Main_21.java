package jianzhi_offer.Stack;

import java.util.Stack;

/**
 * ���������������У���һ�����б�ʾջ��ѹ��˳��
 * ���жϵڶ��������Ƿ����Ϊ��ջ�ĵ���˳��
 * ����ѹ��ջ���������־�����ȡ���������1,2,3,4,5��ĳջ��ѹ��˳��
 * ����4,5,3,2,1�Ǹ�ѹջ���ж�Ӧ��һ���������У�
 * ��4,3,5,1,2�Ͳ������Ǹ�ѹջ���еĵ������С���
 * ע�⣺���������еĳ�������ȵģ�
 */
public class Main_21 {
        public boolean IsPopOrder(int [] pushA,int [] popA) {
            Stack<Integer> a = new Stack();
            int index = 0;
            for(int i = 0;i<pushA.length;i++){
                a.push(pushA[i]);
                if(pushA[i] == popA[index]){
                    if(index++ == popA.length-1){
                        return true;
                    }
                    a.pop();
                }
            }
            while (!a.isEmpty()){
                if(a.pop()!=popA[index++]){
                    return false;
                }
            }
            return true;
        }

}
