package leetcode.Arrays.����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main_377 {
    public static int combinationSum4(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrace(nums,target,0,new ArrayList<>(),res);
        return res.size();
    }

    private static void backTrace(int[] nums, int target, int start, ArrayList<Integer> tmpList, List<List<Integer>> res) {
        if(target < 0){
            return;
        }else if(target == 0){
            res.add(new ArrayList<>(tmpList));
        }else{
            for(int i = 0;i<nums.length && target >= nums[i];i++){
                tmpList.add(nums[i]);
                backTrace(nums,target - nums[i],i,tmpList,res);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }
    //dp��̬�滮,dp[i]�������target���ж�����
    //���ޱ������⣬�������ޱ������ⲻ�ܽ����ĿҪ���˳��ͬ��Ϊ��ͬ�����
     public static int combinationSum5(int[] nums, int target) {
         int dp[] = new int[target + 1];
         int res = ZeroMorePackage(nums, nums, dp, nums.length, target);
         return res;
     }
    public static int ZeroMorePackage(int []weight,int []value,int []f,int Num,int total){
        for(int i = 0;i<Num;i++){
            for(int v = weight[i];v<=total;v++){ //ע����++
                f[v] = Math.max(f[v-weight[i]]+value[i],f[v]);
            }
        }
        return f[total];
    }
    //ִ����ʱ :5 ms, ������ Java �ύ�л�����68.54%���û�
    //�ڴ����� :34.3 MB, ������ Java �ύ�л�����39.00%���û�
    public static int combinationSum6(int[] nums, int target) {
        int dp[] = new int[target + 1];
        //��ʼ��
        dp[0] = 1;
        for(int i = 1;i<=target;i++){
            for(int j = 0;j<nums.length;j++){
                if(i - nums[j] >= 0 ){
                    dp[i] += dp[i-nums[j]];
                }
            }
        }
        return dp[target];
    }
    public static void main(String[] args) {
        int nums[] ={1,2,3};
        int target = 4;
        combinationSum5(nums,target);
        combinationSum6(nums,target);
    }
}
