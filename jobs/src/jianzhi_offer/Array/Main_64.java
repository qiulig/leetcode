package jianzhi_offer.Array;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * �������ڵ����ֵ
 */
public class Main_64 {
public static ArrayList<Integer> maxInWindows(int [] num, int size) {
    ArrayList<Integer> arr = new ArrayList<>();
    if (num==null)
        return arr;
    if (num.length<size||size<=0)
        return arr;
    Deque<Integer> queue = new LinkedList<>();
    for (int i = 0; i<num.length; i++){
        //���ǰ������Ȳ������С��ֱ�Ӱ�ǰ��ɾ��(��Ϊ�����ܳ�Ϊ���洰�ڵ����ֵ)
        while (!queue.isEmpty()&&num[i]>=num[queue.getLast()])
            queue.pollLast();
        //���ǰ���Ԫ�ر�k���ж��Ƿ��ڴ��ڷ�Χ�ڣ��������Ƴ�
        while (!queue.isEmpty()&&queue.getFirst()<i-(size-1))
            queue.pollFirst();
        queue.offerLast(i);
        if (i+1>=size)
            arr.add(num[queue.getFirst()]);
    }
    return arr;
}
    public static void main(String[] args) {
        int arr[] = {2,3,4,2,6,2,5,1};
        maxInWindows(arr,3);

    }

}
