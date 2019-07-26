package leetcode.Arrays.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//执行用时 :3 ms, 在所有 Java 提交中击败了87.52%的用户
//内存消耗 :38.5 MB, 在所有 Java 提交中击败了47.42%的用户
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
            //和上一个数字相等则跳过
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
