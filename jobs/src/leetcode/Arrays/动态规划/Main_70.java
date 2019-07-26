package leetcode.Arrays.¶¯Ì¬¹æ»®;

public class Main_70 {
        public static int climbStairs(int n) {
            if(n <= 2)
                return n ;
            int one = 1;
            int two = 2;
            int res = 0;
            for(int i = 3;i <=n ;i++){
                res = one + two;
                one = two;
                two = res;
            }
            return res;
        }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
}
