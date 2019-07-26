package jianzhi_offer.Strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * ����һ���ַ���,���ֵ����ӡ�����ַ������ַ����������С�
 * ���������ַ���abc,���ӡ�����ַ�a,b,c�������г����������ַ���abc,acb,bac,bca,cab��cba��
 */
public class Main_27 {
    public static class Solution {


        public static void main(String[] args) {
        String arr = "aa";
        Solution t = new Solution();
        ArrayList<String> list = new ArrayList<String>();
        list=t.Permutation(arr);
        for(int i = 0 ; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
        public static ArrayList<String> Permutation(String str) {
            ArrayList<String> res = new ArrayList<String>(); //�����������
            if(str==null||str.length()==0){
                return res;
            }
            char[] chars = str.toCharArray();

            res=Permu(chars,0,res);

            return res ;
        }

        public static ArrayList<String> Permu(char[] str, int start, ArrayList<String> list) {
            if (str == null) {
                return null;
            }
            if (start == str.length - 1) {
                //ȥ���ظ����ַ���
                if (list.contains(String.valueOf(str))) {
                    return null;
                }
                else{list.add(String.valueOf(str));}
            } else {

                for (int j = start; j < str.length; j++) {
                    swap(str,j,start);
                    Permu(str, start+ 1, list);
                    swap(str,j,start);
                }
            }
            Collections.sort(list);
            return list;
        }
        public static void swap(char[] chars,int a,int b){
            if(a==b){//��Ϊ�����ԭλ����ԭλ�ý�����ֱ�ӿռ���

            }else{
                char temp = chars[a];
                chars[a]=chars[b];
                chars[b]=temp;
            }
        }

    }
}
