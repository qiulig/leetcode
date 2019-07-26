package leetcode.Arrays.回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//执行用时 :30 ms, 在所有 Java 提交中击败了22.59%的用户
//内存消耗 :45 MB, 在所有 Java 提交中击败了27.34%的用户
public class Main_40 {
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        backTrace(candidates,target,0,new ArrayList<>(),res);
        return res;
    }

    private static void backTrace(int[] candidates, int target,int start, ArrayList<Integer> tmpList, List<List<Integer>> res) {
        if(target<0)
            return;
        else if(target == 0){
            Collections.sort(tmpList);
            if(!res.contains(tmpList)){
                res.add(new ArrayList<>(tmpList));
            }
        }else {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                tmpList.add(candidates[i]);
                backTrace(candidates, target - candidates[i], i + 1, tmpList, res);
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
//        int [] candidates = {2,5,2,1,2};
//        int target = 5;
        int [] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        combinationSum2(candidates,target);
    }


}
