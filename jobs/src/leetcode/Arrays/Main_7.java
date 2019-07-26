package leetcode.Arrays;

public class Main_7 {
    public static int reverse(int x) {
        int res = 0;
        while (x!=0){
            int pop = x%10;
            x = x/10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                res = 0;
                break;
            } else if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < Integer.MIN_VALUE % 10)) {
                res = 0;
                break;
            }
            res = res*10 +pop;//得到最后一位

        }
        return res;
    }
        public static void main(String[] args) {
            System.out.println(reverse(-1234));
        }
}
