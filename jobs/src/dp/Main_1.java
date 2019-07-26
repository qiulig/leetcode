package dp;
public class Main_1 {
    public static void main(String[] args) {
        int arr[] = {5,10,25,1};
        int aim = 1000;
        System.out.println(coin(arr,aim));
    }
    public static int coin(int arr[],int aim){
        int dp[][] = new int [arr.length][aim+1];
        //初始化第一列，第一列表示aim  = 0 时，可以有多少种方法
        for(int i = 0;i<arr.length;i++){
            dp[i][0] = 1;
        }
        //初始化第一行
        for(int i = 1;i<aim;i++){
            if(aim % arr[0] == 0 )
                dp[0][i] = 1;
        }
        //动态规划
        for(int i = 1;i<dp.length;i++){  //行代表的是钱的种类
            for(int j = 0;j<dp[0].length;j++){   //列代表的是aim
                //使用货币a[0..i]的情况下，组成钱数为j的种数
                if(j > arr[i] )
                {
                    dp[i][j] = dp[i-1][j] + dp[i][j-arr[i]];
                }else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
}
