package leetcode.Arrays.��̬�滮;

import java.util.Arrays;

public class Main_322 {
    public static void main(String[] args) {
        int arr[] = {2};
        System.out.println(coinChange(arr,3));
    }
    public static int coinChange(int[] coins, int amount) {
        //dp[i]��ʾǮ��Ϊiʱ��СӲ����
       int dp[] = new int[amount + 1];
       //��ʼ��Ǯ��Ϊiʱ��Ӳ����
        Arrays.fill(dp,amount +1);
        //Ǯ��Ϊ0ʱ����СӲ����ҲΪ0
        for(int i = 0;i<=amount;i++){
            for(int j = 0;j<coins.length;j++){
                if(i >= coins[j]){
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]> amount ? -1:dp[amount];
    }

}
