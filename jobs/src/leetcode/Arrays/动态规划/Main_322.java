package leetcode.Arrays.动态规划;

import java.util.Arrays;

public class Main_322 {
    public static void main(String[] args) {
        int arr[] = {2};
        System.out.println(coinChange(arr,3));
    }
    public static int coinChange(int[] coins, int amount) {
        //dp[i]表示钱数为i时最小硬币数
       int dp[] = new int[amount + 1];
       //初始化钱数为i时的硬币数
        Arrays.fill(dp,amount +1);
        //钱数为0时的最小硬币数也为0
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
