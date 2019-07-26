package leetcode.Arrays;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main_55 {
    //��ʱ
    public static boolean canJump(int[] nums) {
        if(nums.length==0||nums==null)
            return false;
        if(nums.length==1){
            return true;
        }
       int [] arr = new int[nums.length];
       arr[nums.length-1] = 1;
       if(nums[arr.length-2]>=1){
           arr[nums.length-2] = 1;
       }
       //�ӵ�����������ʼ����
       for(int i = nums.length-3;i>=0;i--){
           //copyofRange(arr,from,to):����from,������to
           int []arrr=  Arrays.copyOfRange(arr,(i+1)>(nums.length-1) ? (nums.length-1):(i+1),
                                                (i+nums[i]+1) > nums.length ? nums.length : (i+nums[i]+1));
           List<Integer> list =  Arrays.stream(arrr).boxed().collect(Collectors.toList());
           if(list.contains(1)){
               arr[i] = 1;
           }
       }
       return arr[0] == 1;
    }
    public static boolean canJump3(int[] nums) {
       if(nums==null)
           return false;
       boolean []dp = new boolean[nums.length];
       dp[0] = true;
       for(int i = 1;i<nums.length;i++){
           for(int j = 0;j<i;j++){
               //���֮ǰj�ڵ�ɴ���ҴӴ˽ڵ��������i
               if(dp[j] && nums[j]+j>=i){
                   dp[i] = true;
                   break;
               }
           }
       }
       return dp[nums.length-1];
    }
    public static boolean canJump2(int[] nums) {
        int lastPos = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= lastPos) {
                lastPos = i;
            }
        }
        return lastPos == 0;
    }
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,4};
        System.out.println(canJump2(arr));
//        int [] ar= {1,2,3};
//        List<Integer> list =  Arrays.stream(ar).boxed().collect(Collectors.toList());
//        System.out.println(list.contains(4));

    }
}
