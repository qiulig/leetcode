package leetcode.Arrays.动态规划;

public class Main_121 {
    public static void main(String[] args) {
        int[] arr = {10,22,5,75,65,80};
        System.out.println(maxProfit7(arr,2));
    }
    public static int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 1;i<prices.length;i++){
            if(minPrice>prices[i]){
                minPrice = prices[i];
            }else if(maxProfit<prices[i] - minPrice){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
    //不限制买入情况
    public static int maxProfit2(int[] prices) {
        //dp[i][0]代表第i+1天没有持股票，
        //dp[i][1]代表第i+1天持有股票
        int dp[][] = new int[prices.length][2];
        //第一天没有持股，这时候相当于没有买入，故为0
        dp[0][0] = 0;
        //第一天持股，相当于买入，这时候为-pricrs[0]
        dp[0][1] = -prices[0];
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 1;i<dp.length;i++){
            //没有持股 =max(昨天没有持股今天维持现状 , 昨天持股，今天卖出）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //持股 = max(昨天持股今天维持现状，（昨天没有持股或者持股都行，今天买入))
            dp[i][1] = Math.max(dp[i-1][1], -1 * prices[i]);
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][0];
    }
    //加一个条件，只有手上没有股票的时候才能买入
    public static int maxProfit3(int[] prices) {
        //dp[i][0]代表第i+1天没有持股票，
        //dp[i][1]代表第i+1天持有股票
        int dp[][] = new int[prices.length][2];
        //第一天没有持股，这时候相当于没有买入，故为0
        dp[0][0] = 0;
        //第一天持股，相当于买入，这时候为-pricrs[0]
        dp[0][1] = -prices[0];
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 1;i<dp.length;i++){
            //没有持股 =max(昨天没有持股今天维持现状 , 昨天持股，今天卖出）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //持股 = max(昨天持股今天维持现状，（昨天没有持股，今天买入))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][0];
    }
    //等待一天才能交易，只能卖出再买入
    public static int maxProfit4(int[] prices) {
        //dp[i][0]代表第i+1天没有持股票，
        //dp[i][1]代表第i+1天持有股票
        int dp[][] = new int[prices.length][2];
        //第一天没有持股，这时候相当于没有买入，故为0
        dp[0][0] = 0;
        //第2天没有持股，这时候max(第一天没持股，第一天持股第二天卖出)
        dp[1][0] =Math.max(0,prices[1]-prices[0]);
        //第一天持股，相当于买入，这时候为-pricrs[0]
        dp[0][1] = -prices[0];
        //第2天持股，这时候max(第一天持股，第一天没持股第二天买入)
        dp[1][1] = Math.max(-prices[0],-prices[1]);
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 2;i<dp.length;i++){
            //没有持股 =max(昨天没有持股今天维持现状 , 昨天持股，今天卖出）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //持股 = max(昨天持股今天维持现状，（前天没有持股，今天买入))
           ///*****第i天要买的时候，要从前天的状态进行判断*****
            dp[i][1] = Math.max(dp[i-2][1], -1 * prices[i]);
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][0];
    }
    //卖出才能买入，每次卖出交易需要手续费
    public static int maxProfit5(int[] prices,int fee) {
        //dp[i][0]代表第i+1天没有持股票，
        //dp[i][1]代表第i+1天持有股票
        int dp[][] = new int[prices.length][2];
        //第一天没有持股，这时候相当于没有买入，故为0
        dp[0][0] = 0;
        //第一天持股，相当于买入，这时候为-pricrs[0]
        dp[0][1] = -prices[0];
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 1;i<dp.length;i++){
            //没有持股 =max(昨天没有持股今天维持现状 , 昨天持股，今天卖出）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //持股 = max(昨天持股今天维持现状，（昨天没有持股或者持股都行，今天买入))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][0];
    }
    //
    public static int maxProfit6(int[] prices,int fee) {
        //dp[i][0]代表第i+1天没有持股票，
        //dp[i][1]代表第i+1天持有股票
        int dp[][] = new int[prices.length][2];
        //第一天没有持股，这时候相当于没有买入，故为0
        dp[0][0] = 0;
        //第一天持股，相当于买入，这时候为-pricrs[0]
        dp[0][1] = -prices[0];
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 1;i<dp.length;i++){
            //没有持股 =max(昨天没有持股今天维持现状 , 昨天持股，今天卖出）
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //持股 = max(昨天持股今天维持现状，（昨天没有持股或者持股都行，今天买入))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][0];
    }
    //在股市的交易日中，假设最多可进行两次买卖(即买和卖的次数均小于等于2)，
    // 规则是必须一笔成交后进行另一笔(即买-卖-买-卖的顺序进行)。给出一天中的股票变化序列，
    // 请写一个程序计算一天可以获得的最大收益。
//不限制买入情况
    public static int maxProfit7(int[] prices , int k) {
        //dp[i][k][0]代表第(i+1)天交易次数为k,没持股
        int dp[][][] = new int[prices.length][k + 1][2];
        //初始化
        dp[0][1][0] = 0;  //第一天，交易次数为1，没持股
        dp[0][1][1] = -prices[0];  //第一天，买交易次数为1，卖次数为0，持股
        dp[0][2][0] = 0;   //第一天,买卖次数都不能达到2，没持股
        dp[0][2][1] = -prices[0];  //第一天，交易次数为2，持股

        for(int i = 1;i<prices.length;i++) {
//            for (int j = 2; j >= 1; j--) {
//                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
//                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
//            }
            //第(i+1)天交易数为2，没持股 = max(前一天交易数为2没持股维持，前一天交易数为1持股今天卖出)
            dp[i][2][0] = Math.max(dp[i-1][2][0],dp[i-1][2][1] + prices[i]);
            //第(i+1)天交易数为2，持股 = 前一天交易数为2持股维持，前一天交易数为1没持股今天买入
            dp[i][2][1] = Math.max(dp[i-1][2][1],dp[i-1][1][0] - prices[i]);
            //第(i+1)天交易数为1，没持股 = max(前一天交易数为1没持股维持，前一天交易数为0持股今天卖出)
            dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][1][1] + prices[i]);
            //第(i+1)天交易数为1，持股 = max(前一天交易数为1持股维持，(没交易，今天买入))
            dp[i][1][1] = Math.max(dp[i-1][1][1],-1 * prices[i]);
//        }
        }
        //求最后一天能得到的最大收益
        return dp[prices.length-1][2][0];
    }
    public static int maxProfit8(int[] prices,int k) {
        if(prices.length == 0)
            return 0;
        int dp[][][] = new int[prices.length][k+1][2];
        //初始化
        dp[0][1][0] = 0;  //第一天，交易次数为1，没持股
        dp[0][1][1] = -prices[0];  //第一天，买交易次数为1，卖次数为0，持股
        if(k >= 2) {
            dp[0][2][0] = 0;   //第一天,买入卖出买入卖出，没收益
            dp[0][2][1] = -prices[0];  //第一天，交易次数为2，买入卖出买入
        }
        //求第(i+1)天持股或者不持股的最大收益
        for(int i = 1;i<dp.length;i++){
            for(int j = k;j >= 1;j --) {
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        //最大利益肯定是那天没有持股时的利益
        return dp[dp.length-1][k][0];
    }
    public static int maxProfit_k_any(int max_k, int[] prices) {
        int n = prices.length;
        if (max_k > n / 2)
            return maxProfit_k_inf(prices);

        int[][][] dp = new int[n][max_k + 1][2];
        for (int i = 0; i < n; i++)
            for (int k = max_k; k >= 1; k--) {
                if (i - 1 == -1) {
                    for(int m = 1;m<max_k;m++){
                        dp[i][m][0] = 0;
                        dp[i][m][1] = -prices[0];
                    }
                }
                dp[i][k][0] = Math.max(dp[i-1][k][0], dp[i-1][k][1] + prices[i]);
                dp[i][k][1] = Math.max(dp[i-1][k][1], dp[i-1][k-1][0] - prices[i]);
            }
        return dp[n - 1][max_k][0];
    }
    public static int maxProfit_k_inf(int[] prices) {
        int n = prices.length;
        int dp_i_0 = 0, dp_i_1 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int temp = dp_i_0;
            dp_i_0 = Math.max(dp_i_0, dp_i_1 + prices[i]);
            dp_i_1 = Math.max(dp_i_1, temp - prices[i]);
        }
        return dp_i_0;
    }
}
