package suanfa;
//��һ��
//��n�������ų�һ�У�ÿ������������һ������a[i]����ʾ�����������a[i]�����ӣ�
//С��վ����ߵ�һ�����ӣ������ܷ񵽴����ұߵĺ��ӣ�
//        ����˵��[1, 2, 3, 0, 4] ���Ե����5�����ӣ�
//        [3, 2, 1, 0, 4] �޷������5�����ӣ�
//����˼·�������ܵ���������������Ƿ��ܵ��
//ͬleetcode-55.��Ծ��Ϸ
public class Main_tanxin_tiaoyitiao {
    public static void main(String[] args) {
        int []arr = {1,2,3,0,4};
        int []arrs = {3,2,1,0,4};
        System.out.println(solution(arr));
    }
    //̰���㷨
    private static boolean solution(int[] arr) {
        int lastPos = arr.length -1;
        for(int i = arr.length-1;i>0;i--){
            if(i + arr[i] >=lastPos)
                lastPos = i;
        }
        return lastPos == 0;
    }
    //��̬�滮
    private static boolean canJump(int[] arr) {
        if(arr == null)
            return false;
        boolean[]dp = new boolean[arr.length];
        dp[0] = true;
        for(int i = 1;i<arr.length;i++){
            for(int j = 0;j<i;j++){
                //���֮ǰ��j�ڵ�ɴ���ҴӴ˽ڵ��������i
                if(dp[j] == true && arr[j] + j >=i){
                    dp[i] = true;
                }
            }
        }
        return dp[arr.length-1] ==true;
    }
}
