package jianzhi_offer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Main_32 {
    public static void main(String[] args) {
        int numbers []= {3334,3,3333332};
        PrintMinNumber(numbers);
    }
    public static String PrintMinNumber(int [] numbers) {
        if(numbers.length<=0||numbers == null)
            return "";
        Arrays.sort(numbers);
        //求位数
        int count = 0;
        int Max_ = numbers[numbers.length-1];
        while(Max_>0) {
            count++;
            Max_ = Max_/10;
        }
        String str[] = new String[numbers.length];

        for(int i = 0;i<numbers.length;i++){
            str[i] = ""+numbers[i];
        }
        //补位
        for(int i = 0;i<numbers.length;i++){
            String tmp ="" +str[i].charAt(str[i].length()-1);
            int len =str[i].length();
            for(int j = 0;j<count-len;j++)
            {
                str[i] = str[i]+tmp;
            }
        }
        //排序
       ArrayList<Integer> ss= new ArrayList<>();
        String strcopy[] = str.clone();  //copy的索引对应numbers的索引
         Arrays.sort(str);  //
        for(int i = 0;i<numbers.length;i++){
            for(int j = 0;j<numbers.length;j++){
                if(str[i].equals(strcopy[j])){
                    ss.add(j);
                }
            }
        }
        String res = "";
        for(int i = 0;i<numbers.length;i++){
            res = res +numbers[ss.get(i)];
        }
        return res;
    }


}
