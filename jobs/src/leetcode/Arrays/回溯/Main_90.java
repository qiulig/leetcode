package leetcode.Arrays.����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//ִ����ʱ :3 ms, ������ Java �ύ�л�����87.52%���û�
//�ڴ����� :38.5 MB, ������ Java �ύ�л�����47.42%���û�
public class Main_90 {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        backTrace(nums,0,new ArrayList<>(),res);
        return res;
    }
    private static void backTrace(int[] nums, int start, ArrayList<Integer> tmplist, List<List<Integer>> res) {
        res.add(new ArrayList<>(tmplist));
        for(int i = start;i<nums.length;i++){
            //����һ���������������
            if(i > start && nums[i] == nums[i-1] ){
                continue;
            }else{
                tmplist.add(nums[i]);
                backTrace(nums,i+1,tmplist,res);
                tmplist.remove(tmplist.size()-1);
            }

        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,2};
        subsetsWithDup(nums);
    }


}
