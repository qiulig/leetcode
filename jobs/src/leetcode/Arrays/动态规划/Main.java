package leetcode.Arrays.��̬�滮;

import java.util.Arrays;

public class Main {
    //��һ�������� n, �������ٶ��ٸ���ȫƽ����(����1, 4, 9...)�ĺ͵���n��
    public int numSquares(int n) {
        //dp[i] ��ʾ�Ӻ�Ϊ i ��������ȫƽ�����ĸ���.
        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        for(int i = 0;i * i <= n;i++){
            dp[i * i] = 1;
        }
        for(int i = 0;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(i>=j *j)
                    dp[i] = Math.min(dp[i],dp[i - j * j] +1);
            }
        }
        return dp[n];
    }
    //�����ַ��� s, ��Ҫ�����ָ��һЩ�Ӵ�, ʹ��ÿ���Ӵ����ǻ��Ĵ�.
    //������Ҫ�ָ��?
    private static boolean[][] getIsPalindrome(String s) {
       boolean isPalindrome[][] = new boolean[s.length()][s.length()];
       for(int i = 0;i<s.length();i++){
           isPalindrome[i][i] = true;
       }
       for(int i = 0;i<s.length()-1;i++){
           isPalindrome[i][i+1] = s.charAt(i)==s.charAt(i+1);
       }

       for(int i = 2;i<s.length();i++){
           for(int start = 0;start + i <s.length();start++){
               isPalindrome[start][start + i] = isPalindrome[start +1][start + i - 1] && s.charAt(start)==s.charAt(start + 2);
           }
       }
       return isPalindrome;
    }
    // dp[i] ��ʾԭ����ǰ i ���ַ����ٷָ���ٴο���ʹ�õ��Ķ��ǻ����Ӵ�.
    public static int minCut(String s) {
        if(s==null || s.length() == 0){
            return 0;
        }
        boolean [][]isPalindrome = getIsPalindrome(s);

        int dp[] = new int[s.length()+1];
        dp[0] = 0;
        for(int i = 1;i<s.length();i++){
            dp[i] = Integer.MAX_VALUE;
            for(int j = 0;j<i;j++){
                if(isPalindrome[j][i-1]){
                    dp[i] = Math.min(dp[i],dp[j] + 1);
                }
            }
        }
        return dp[s.length()] -1;
    }

    public static void main(String[] args) {
        minCut("aab");
    }
}
