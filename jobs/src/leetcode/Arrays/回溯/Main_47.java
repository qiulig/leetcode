package leetcode.Arrays.回溯;

import java.util.*;

//执行用时 :742 ms, 在所有 Java 提交中击败了8.80%的用户
//内存消耗 :45.7 MB, 在所有 Java 提交中击败了44.99%的用户
public class Main_47 {
        public static  List<List<Integer>> permuteUnique(int[] nums) {
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

