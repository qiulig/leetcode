package leetcode.Strings;

import java.util.ArrayList;
import java.util.List;
public class Main_3 {
        public static int lengthOfLongestSubstring(String s) {
            int MaxLength = 0;
            List<Character> list = new ArrayList();
            for(int i = 0;i<s.length();i++){
                if(!list.contains(s.charAt(i))){
                    list.add(s.charAt(i));
                    MaxLength = Math.max(MaxLength,list.size());
                }else{
                    list.add(s.charAt(i));
                    int index = list.indexOf(s.charAt(i));
                    while(index>=0){
                        list.remove(index--);
                    }
                }
            }
            return MaxLength;
        }

    public static void main(String[] args) {

            System.out.println(lengthOfLongestSubstring("xabcad" ));
    }
}
