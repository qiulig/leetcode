package jianzhi_offer.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * 数据流中的中位数
 */
public class Main_63 {
    public class Solution {
       ArrayList<Integer> list = new ArrayList<>();
        public void Insert(Integer num) {
            list.add(num);

        }
        public Double GetMedian() {
            int size = list.size();
            if(size!=0){
                Collections.sort(list);
                if(size%2==0){
                    return (list.get(size/2)+list.get(size/2-1))/2.0;
                }else {
                    return list.get(size/2)*1.0;
                }
            }else {
                return null;
            }
        }
    }
}
