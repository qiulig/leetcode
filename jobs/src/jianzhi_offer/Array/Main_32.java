package jianzhi_offer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * ����һ�����������飬����������������ƴ�������ų�һ������
 * ��ӡ��ƴ�ӳ���������������С��һ����������������{3��32��321}��
 * ���ӡ���������������ųɵ���С����Ϊ321323��
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
        //��λ��
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
        //��λ
        for(int i = 0;i<numbers.length;i++){
            String tmp ="" +str[i].charAt(str[i].length()-1);
            int len =str[i].length();
            for(int j = 0;j<count-len;j++)
            {
                str[i] = str[i]+tmp;
            }
        }
        //����
       ArrayList<Integer> ss= new ArrayList<>();
        String strcopy[] = str.clone();  //copy��������Ӧnumbers������
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
