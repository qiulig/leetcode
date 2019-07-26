package ������;

import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        System.out.println(solution(N));
    }
    public static long solution(int num) {
        if (num == 0)
            return 1;
        else if (num == 1)
            return 2;
        else {
            long dp[] = new long[num];
            dp[0] = 2;  //ֻ��һ��ʳ�����ѡ�� �� ���߲���2�ַ���
            dp[1] = 3;  //��2��ʳ�ѡ�� ���� ���Ե�һ��ʳ��Եڶ���ʳ�
            for (int i = 2; i < num; i++) {
                dp[i] = dp[i - 2] + dp[i - 1];
            }
            return dp[num - 1];
        }
    }
}
