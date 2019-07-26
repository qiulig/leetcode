package leetcode.Arrays.动态规划;
//执行用时 :7 ms, 在所有 Java 提交中击败了52.45%的用户
//内存消耗 :34.9 MB, 在所有 Java 提交中击败了64.83%的用户
public class Main_518 {
    public static void main(String[] args) {
        int coins [] = {1,2,5};
        System.out.println(change(5,coins));
    }
    public static int change(int amount, int[] coins) {
        //用dp[i]记录金额j可以有多少种硬币组合
       int dp[] = new int[amount +1];
       //初始化第一个，代表金额为1时的组合数即0+0+0+0...这1种组合
        dp[0] = 1;
        for(int i = 0;i<coins.length;i++){
            for(int j = 0;j<=amount;j++){ //依次更新钱数为0--amount的组合数
                if(j >= coins[i]){ //如果当前的钱比钱的面额大
                    dp[j] += dp[j-coins[i]];  //当前的组合数 =之前的组合数 + dp[j-coins[i]]的组合数
                }
            }
        }
        return dp[amount];
    }
}
