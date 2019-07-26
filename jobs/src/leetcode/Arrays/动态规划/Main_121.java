package leetcode.Arrays.��̬�滮;

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
    //�������������
    public static int maxProfit2(int[] prices) {
        //dp[i][0]�����i+1��û�гֹ�Ʊ��
        //dp[i][1]�����i+1����й�Ʊ
        int dp[][] = new int[prices.length][2];
        //��һ��û�гֹɣ���ʱ���൱��û�����룬��Ϊ0
        dp[0][0] = 0;
        //��һ��ֹɣ��൱�����룬��ʱ��Ϊ-pricrs[0]
        dp[0][1] = -prices[0];
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 1;i<dp.length;i++){
            //û�гֹ� =max(����û�гֹɽ���ά����״ , ����ֹɣ�����������
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //�ֹ� = max(����ֹɽ���ά����״��������û�гֹɻ��ֹ߳ɶ��У���������))
            dp[i][1] = Math.max(dp[i-1][1], -1 * prices[i]);
        }
        //�������϶�������û�гֹ�ʱ������
        return dp[dp.length-1][0];
    }
    //��һ��������ֻ������û�й�Ʊ��ʱ���������
    public static int maxProfit3(int[] prices) {
        //dp[i][0]�����i+1��û�гֹ�Ʊ��
        //dp[i][1]�����i+1����й�Ʊ
        int dp[][] = new int[prices.length][2];
        //��һ��û�гֹɣ���ʱ���൱��û�����룬��Ϊ0
        dp[0][0] = 0;
        //��һ��ֹɣ��൱�����룬��ʱ��Ϊ-pricrs[0]
        dp[0][1] = -prices[0];
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 1;i<dp.length;i++){
            //û�гֹ� =max(����û�гֹɽ���ά����״ , ����ֹɣ�����������
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //�ֹ� = max(����ֹɽ���ά����״��������û�гֹɣ���������))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i]);
        }
        //�������϶�������û�гֹ�ʱ������
        return dp[dp.length-1][0];
    }
    //�ȴ�һ����ܽ��ף�ֻ������������
    public static int maxProfit4(int[] prices) {
        //dp[i][0]�����i+1��û�гֹ�Ʊ��
        //dp[i][1]�����i+1����й�Ʊ
        int dp[][] = new int[prices.length][2];
        //��һ��û�гֹɣ���ʱ���൱��û�����룬��Ϊ0
        dp[0][0] = 0;
        //��2��û�гֹɣ���ʱ��max(��һ��û�ֹɣ���һ��ֹɵڶ�������)
        dp[1][0] =Math.max(0,prices[1]-prices[0]);
        //��һ��ֹɣ��൱�����룬��ʱ��Ϊ-pricrs[0]
        dp[0][1] = -prices[0];
        //��2��ֹɣ���ʱ��max(��һ��ֹɣ���һ��û�ֹɵڶ�������)
        dp[1][1] = Math.max(-prices[0],-prices[1]);
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 2;i<dp.length;i++){
            //û�гֹ� =max(����û�гֹɽ���ά����״ , ����ֹɣ�����������
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //�ֹ� = max(����ֹɽ���ά����״����ǰ��û�гֹɣ���������))
           ///*****��i��Ҫ���ʱ��Ҫ��ǰ���״̬�����ж�*****
            dp[i][1] = Math.max(dp[i-2][1], -1 * prices[i]);
        }
        //�������϶�������û�гֹ�ʱ������
        return dp[dp.length-1][0];
    }
    //�����������룬ÿ������������Ҫ������
    public static int maxProfit5(int[] prices,int fee) {
        //dp[i][0]�����i+1��û�гֹ�Ʊ��
        //dp[i][1]�����i+1����й�Ʊ
        int dp[][] = new int[prices.length][2];
        //��һ��û�гֹɣ���ʱ���൱��û�����룬��Ϊ0
        dp[0][0] = 0;
        //��һ��ֹɣ��൱�����룬��ʱ��Ϊ-pricrs[0]
        dp[0][1] = -prices[0];
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 1;i<dp.length;i++){
            //û�гֹ� =max(����û�гֹɽ���ά����״ , ����ֹɣ�����������
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //�ֹ� = max(����ֹɽ���ά����״��������û�гֹɻ��ֹ߳ɶ��У���������))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        //�������϶�������û�гֹ�ʱ������
        return dp[dp.length-1][0];
    }
    //
    public static int maxProfit6(int[] prices,int fee) {
        //dp[i][0]�����i+1��û�гֹ�Ʊ��
        //dp[i][1]�����i+1����й�Ʊ
        int dp[][] = new int[prices.length][2];
        //��һ��û�гֹɣ���ʱ���൱��û�����룬��Ϊ0
        dp[0][0] = 0;
        //��һ��ֹɣ��൱�����룬��ʱ��Ϊ-pricrs[0]
        dp[0][1] = -prices[0];
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 1;i<dp.length;i++){
            //û�гֹ� =max(����û�гֹɽ���ά����״ , ����ֹɣ�����������
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] + prices[i]);
            //�ֹ� = max(����ֹɽ���ά����״��������û�гֹɻ��ֹ߳ɶ��У���������))
            dp[i][1] = Math.max(dp[i-1][1], dp[i-1][0] - prices[i] - fee);
        }
        //�������϶�������û�гֹ�ʱ������
        return dp[dp.length-1][0];
    }
    //�ڹ��еĽ������У��������ɽ�����������(��������Ĵ�����С�ڵ���2)��
    // �����Ǳ���һ�ʳɽ��������һ��(����-��-��-����˳�����)������һ���еĹ�Ʊ�仯���У�
    // ��дһ���������һ����Ի�õ�������档
//�������������
    public static int maxProfit7(int[] prices , int k) {
        //dp[i][k][0]�����(i+1)�콻�״���Ϊk,û�ֹ�
        int dp[][][] = new int[prices.length][k + 1][2];
        //��ʼ��
        dp[0][1][0] = 0;  //��һ�죬���״���Ϊ1��û�ֹ�
        dp[0][1][1] = -prices[0];  //��һ�죬���״���Ϊ1��������Ϊ0���ֹ�
        dp[0][2][0] = 0;   //��һ��,�������������ܴﵽ2��û�ֹ�
        dp[0][2][1] = -prices[0];  //��һ�죬���״���Ϊ2���ֹ�

        for(int i = 1;i<prices.length;i++) {
//            for (int j = 2; j >= 1; j--) {
//                dp[i][j][0] = Math.max(dp[i - 1][j][0], dp[i - 1][j][1] + prices[i]);
//                dp[i][j][1] = Math.max(dp[i - 1][j][1], dp[i - 1][j - 1][0] - prices[i]);
//            }
            //��(i+1)�콻����Ϊ2��û�ֹ� = max(ǰһ�콻����Ϊ2û�ֹ�ά�֣�ǰһ�콻����Ϊ1�ֹɽ�������)
            dp[i][2][0] = Math.max(dp[i-1][2][0],dp[i-1][2][1] + prices[i]);
            //��(i+1)�콻����Ϊ2���ֹ� = ǰһ�콻����Ϊ2�ֹ�ά�֣�ǰһ�콻����Ϊ1û�ֹɽ�������
            dp[i][2][1] = Math.max(dp[i-1][2][1],dp[i-1][1][0] - prices[i]);
            //��(i+1)�콻����Ϊ1��û�ֹ� = max(ǰһ�콻����Ϊ1û�ֹ�ά�֣�ǰһ�콻����Ϊ0�ֹɽ�������)
            dp[i][1][0] = Math.max(dp[i-1][1][0],dp[i-1][1][1] + prices[i]);
            //��(i+1)�콻����Ϊ1���ֹ� = max(ǰһ�콻����Ϊ1�ֹ�ά�֣�(û���ף���������))
            dp[i][1][1] = Math.max(dp[i-1][1][1],-1 * prices[i]);
//        }
        }
        //�����һ���ܵõ����������
        return dp[prices.length-1][2][0];
    }
    public static int maxProfit8(int[] prices,int k) {
        if(prices.length == 0)
            return 0;
        int dp[][][] = new int[prices.length][k+1][2];
        //��ʼ��
        dp[0][1][0] = 0;  //��һ�죬���״���Ϊ1��û�ֹ�
        dp[0][1][1] = -prices[0];  //��һ�죬���״���Ϊ1��������Ϊ0���ֹ�
        if(k >= 2) {
            dp[0][2][0] = 0;   //��һ��,������������������û����
            dp[0][2][1] = -prices[0];  //��һ�죬���״���Ϊ2��������������
        }
        //���(i+1)��ֹɻ��߲��ֹɵ��������
        for(int i = 1;i<dp.length;i++){
            for(int j = k;j >= 1;j --) {
                dp[i][j][0] = Math.max(dp[i-1][j][0], dp[i-1][j][1] + prices[i]);
                dp[i][j][1] = Math.max(dp[i-1][j][1], dp[i-1][j-1][0] - prices[i]);
            }
        }
        //�������϶�������û�гֹ�ʱ������
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
