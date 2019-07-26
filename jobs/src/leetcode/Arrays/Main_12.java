package leetcode.Arrays;

/**
 * ����ת��������
 */
public class Main_12 {
    public static String intToRoman(int num) {
        int   arr [] = {1000, 900, 500, 400,100,  90, 50,  40, 10,   9,  5,   4, 1 };
        String str[] = { "M","CM", "D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int i = 0;
        StringBuilder res = new StringBuilder("");
        //һ���������������С���ڴ���ұ�
        while(num!=0&& i<arr.length){
            if(num>=arr[i]){
                num  = num-arr[i];
                res.append(str[i]);
            }else{
                i++;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(4));
    }
}
