package jianzhi_offer.Array;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * ��һ���ַ���(0<=�ַ�������<=10000��ȫ������ĸ���)���ҵ���һ��ֻ����һ�ε��ַ�,����������λ��, ���û���򷵻� -1����Ҫ���ִ�Сд��.
 */
public class Main_34 {
    public static int FirstNotRepeatingChar(String str) {
        if (str.length() == 0 || str == null)
            return -1;
        ArrayList<Character> list1 = new ArrayList<Character>();//list1���str�г���1�ε��ַ�
        ArrayList<Character> list2 = new ArrayList<Character>();//list2���str�г��ֶ�ε��ַ�
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //����list���涼û������ַ�
            if (!list1.contains(ch) && !list2.contains(ch)) {
                //���ַ��ŵ�list1��
                list1.add(Character.valueOf(ch));

            } else {
                //��list1֮ǰ�����ɾ������ʱ��������ͬ�ַ���ɾ����ͬ�ַ���
                list1.remove(Character.valueOf(ch));
                //��str�к��е���ͬ�ַ�����list2
                list2.add(Character.valueOf(ch));
            }
        }
        if (list1.size() < 0) {
            return -1;
        }
        return str.indexOf(list1.get(0));

    }

    public static void main(String[] args) {
        String str = "abdbcsrfncd";
        FirstNotRepeatingChar(str);
    }


}
