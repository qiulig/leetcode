package jianzhi_offer.Array;

import java.util.HashMap;
import java.util.Map;

/**
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 */
public class Main_28 {
    public static class Solution {
        public static int MoreThanHalfNum_Solution(int [] array) {
            HashMap<Integer,Integer> map = new HashMap<>();
            int res = 0;
            for(int i = 0;i<array.length;i++){
                if(map.containsKey(array[i])){
                    map.put(array[i],map.get(array[i])+1);
                }else{
                    map.put(array[i],1);
                }
            }
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                    if(entry.getValue()>array.length/2)
                        res = entry.getKey();
            }
            return res;
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,2,5,2,3};
        Solution.MoreThanHalfNum_Solution(arr);
    }
}
