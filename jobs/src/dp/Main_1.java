package dp;
public class Main_1 {
    public static void main(String[] args) {
        int arr[] = {5,10,25,1};
        int aim = 1000;
        System.out.println(coin(arr,aim));
    }
    public static int coin(int arr[],int aim){
        int dp[][] = new int [arr.length][aim+1];
        //��ʼ����һ�У���һ�б�ʾaim  = 0 ʱ�������ж����ַ���
        for(int i = 0;i<arr.length;i++){
            dp[i][0] = 1;
        }
        //��ʼ����һ��
        for(int i = 1;i<aim;i++){
            if(aim % arr[0] == 0 )
                dp[0][i] = 1;
        }
        //��̬�滮
        for(int i = 1;i<dp.length;i++){  //�д������Ǯ������
            for(int j = 0;j<dp[0].length;j++){   //�д������aim
                //ʹ�û���a[0..i]������£����Ǯ��Ϊj������
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
