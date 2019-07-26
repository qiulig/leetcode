package leetcode.Strings;

import java.util.ArrayList;
import java.util.List;

/**
 * ����һ������������ 2-9 ���ַ����������������ܱ�ʾ����ĸ��ϡ�
   �������ֵ���ĸ��ӳ�����£���绰������ͬ����ע�� 1 ����Ӧ�κ���ĸ��

 */
public class Main_17 {
    public static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits.length()==0){
            return list;
        }
        backtracking(list,"",digits,0);
        return list;
    }
    private static void backtracking( List<String> list, String s, String digits, int flag){
        String[] strings = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if (flag >= digits.length()){
            list.add(s);
            return;
        }
        String chars = strings[digits.charAt(flag) - '0'];
        for (int i = 0; i < chars.length(); i++) {   //����һ�����ֶ�Ӧ��������ĸ
            backtracking(list,s + chars.charAt(i),digits,flag+1);
        }
    }

    public static void main(String[] args) {
       List<String> s = letterCombinations("23");
       for(String ss:s){
           System.out.print(ss+" ");
       }
    }
}
