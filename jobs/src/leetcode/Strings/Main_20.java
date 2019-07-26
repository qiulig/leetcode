package leetcode.Strings;

import java.util.Stack;

/**
 *   ����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ������ж��ַ����Ƿ���Ч��
     ��Ч�ַ��������㣺
     �����ű�������ͬ���͵������űպϡ�
     �����ű�������ȷ��˳��պϡ�
     ע����ַ����ɱ���Ϊ����Ч�ַ�����
 */
public class Main_20 {
        public static boolean isValid(String str) {
            Stack<Character> stack = new Stack();
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == '('){
                    stack.push(')');
                } else if(str.charAt(i) == '{'){
                    stack.push('}');
                } else if(str.charAt(i) == '['){
                    stack.push(']');
                }else if(stack.isEmpty()||stack.pop()!=str.charAt(i)){
                    return false;
                }
            }
            return stack.isEmpty();
        }

    public static void main(String[] args) {
        System.out.println(isValid("()[]([)]"));
    }
}
