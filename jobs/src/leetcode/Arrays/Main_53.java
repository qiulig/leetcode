package leetcode.Arrays;

/**
 * ��������
 */
public class Main_53 {
    public static int maxSubArray(int[] nums) {
        if(nums.length == 0||nums == null){
            return 0;
        }
        //��ʼ��
        int[] ans = new int[nums.length];
        ans[0] = nums[0];
        int res = ans[0];
        //��������Ե�n����Ϊ�����������������
        for(int i = 1;i<nums.length;i++){
            ans[i] = Math.max(ans[i-1]+nums[i],nums[i]);
            //�������
            res = Math.max(res,ans[i]);
        }
        return res;
    }
    public  static int maxSubArray2(int[] nums) {
        if(nums.length == 0||nums == null){
            return 0;
        }
        int ans = Integer.MIN_VALUE;
        int cur = 0;
        for(int i = 0;i<nums.length;i++){
            cur = cur + nums[i];
            ans = Math.max(cur,ans);
            cur = cur < 0 ? 0 : cur;
        }
        return ans;
    }

    public static void main(String[] args) {
        int []arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
        System.out.println(maxSubArray2(arr));
    }
}
