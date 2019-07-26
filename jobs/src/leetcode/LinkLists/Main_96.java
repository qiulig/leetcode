package leetcode.LinkLists;

public class Main_96 {
    public static int numTrees(int n) {
        //n���ڵ���ڶ������ĸ���
        long []dp = new long[n+1];
        //��iΪ���ڵ�Ķ���������
        dp[0] = 1; //��0Ϊ���ڵ��
        dp[1] = 1;
        for(int i = 1;i<=n;i++){
            dp[i] = dp[i-1]*(4*i-2)/(i+1);
        }
        return (int) dp[n];
    }

    public static void main(String[] args) {
        System.out.println(numTrees(19));
    }
}
