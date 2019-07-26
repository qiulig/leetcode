package leetcode.Arrays;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 罗马转数字
 */
public class Main_13 {
    public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-1;i>0;i--){
            //罗马数字中大的数字在小的数字的右边，用减法
            if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                res -=map.get(s.charAt(i-1));
            }else{
                //罗马数字中小的数字在大的数字的右边，用加法
                res +=map.get(s.charAt(i-1));
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
