package leetcode.Arrays.回溯;

import java.util.ArrayList;
import java.util.List;
//执行用时 :41 ms, 在所有 Java 提交中击败了5.01%的用户
//内存消耗 :44.4 MB, 在所有 Java 提交中击败了5.03%的用户
public class Main_46 {
    public static void main(String[] args) {
        int [] arr = {1,2,1};
        permute(arr);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(nums,0,new ArrayList<>(),res);
        return res;
    }

    private static void backTrace(int[] nums, int start,ArrayList<Integer> tempList, List<List<Integer>> res) {
        //start为边界值
        if(start == nums.length){
            if(!res.contains(tempList)){
                res.add(new ArrayList<>(tempList));
            }
        }
        for(int i = start;i<nums.length;i++){
            swap(nums,start,i);
            tempList.add(nums[start]);
            backTrace(nums,start+1,tempList,res);
            tempList.remove(tempList.size()-1);
            swap(nums,start,i);
        }
    }

    private static void swap(int[] nums, int start, int i) {
        int temp = nums[start];
        nums[start] = nums[i];
        nums[i] = temp;
    }
}
