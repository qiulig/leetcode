package jianzhi_offer.Array;

/**
 * ��Ҷ�֪��쳲��������У�����Ҫ������һ������n���������쳲��������еĵ�n���0��ʼ����0��Ϊ0����
 n<=39
 */
public class Main_7 {
    public static class Solution {
        public static int Fibonacci(int n) {
            if (n==0)
                return 0;
            if(n==1||n==2)
                return 1;
            int one_ = 1;
            int two_ =1;
            int fin = 0;
            for(int i = 3;i<=n;i++){
                fin = one_+two_;
                one_ = two_;
                two_ = fin;
            }
            return fin;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.Fibonacci(3));
    }
}
