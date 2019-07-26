package leetcode.Arrays.����;

import java.util.ArrayList;
import java.util.List;
//ִ����ʱ :2 ms, ������ Java �ύ�л�����87.86%���û�
//�ڴ����� :37 MB, ������ Java �ύ�л�����44.12%���û�
public class Main_78 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(nums,0,new ArrayList<>(),res);
        return res;
    }

    private static void backTrace(int[] nums, int start, ArrayList<Integer> tmplist, List<List<Integer>> res) {
        res.add(new ArrayList<>(tmplist));
        for(int i = start;i<nums.length;i++){
            tmplist.add(nums[i]);
            backTrace(nums,i+1,tmplist,res);
            tmplist.remove(tmplist.size()-1);
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3};
        subsets(nums);
    }


}

