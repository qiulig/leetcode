package leetcode.Arrays.����;

import java.util.*;

//ִ����ʱ :742 ms, ������ Java �ύ�л�����8.80%���û�
//�ڴ����� :45.7 MB, ������ Java �ύ�л�����44.99%���û�
public class Main_47 {
        public static  List<List<Integer>> permuteUnique(int[] nums) {
            List<List<Integer>> res = new ArrayList<>();
            backTrace(nums,0,new ArrayList<>(),res);
            return res;
        }

        private static void backTrace(int[] nums, int start,ArrayList<Integer> tempList, List<List<Integer>> res) {
            //startΪ�߽�ֵ
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

