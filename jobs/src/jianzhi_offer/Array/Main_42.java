package jianzhi_offer.Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * ����һ����������������һ������S���������в�����������
 * ʹ�����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 */
public class Main_42 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> ss = new ArrayList<>();
        int Min_ = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        for(int i = 0;i<array.length;i++){
            if(res.contains(sum-array[i])){
                if(Min_>(sum-array[i])*array[i]){
                    Min_ = (sum-array[i])*array[i];
                    index1 = array[i];
                    index2 = sum=array[i];
                }
            }else{
                res.add(array[i]);
            }
            if(index1!=0||index2!=0)
            {
                ss.add(index1);
                ss.add(index2);
            }
        }
        return ss;
    }

}
