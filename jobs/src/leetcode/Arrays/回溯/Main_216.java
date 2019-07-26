package leetcode.Arrays.����;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * �ҳ��������֮��Ϊ?n ��?k?��������ϡ������ֻ������ 1 -?9 ��������������ÿ������в������ظ������֡�

 ˵����

 �������ֶ�����������
 �⼯���ܰ����ظ�����ϡ�?
 ʾ�� 1:

 ����: k = 3, n = 7
 ���: [[1,2,4]]
 ʾ�� 2:

 ����: k = 3, n = 9
 ���: [[1,2,6], [1,3,5], [2,3,4]]

 */
//ִ����ʱ :5 ms, ������ Java �ύ�л�����8.96%���û�
//�ڴ����� :34.1 MB, ������ Java �ύ�л�����28.88%���û�
public class Main_216 {
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backTrace(k,n,1,new ArrayList<>(),res);
        return res;
    }

    private static void backTrace(int k, int target,int start, ArrayList<Integer> tmpList, List<List<Integer>> res) {
        if(0 == k && target == 0){
            Collections.sort(tmpList);
            if(!res.contains(tmpList))
                res.add(new ArrayList<>(tmpList));
        }else{
            for(int i = start;i <= 9 ;i++){
                tmpList.add(i);
                backTrace(k-1,target - i,i+1,tmpList,res);
                tmpList.remove(tmpList.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        combinationSum3(2,18);
    }

}

