package vivo;

import java.util.ArrayList;

/**
 *��������A��B���ҳ�����A�д��ڶ�B�в����ڵ�Ԫ�أ�����ӡ���
 *  A: 1 2 3 5
 *  B: 2 3 4
 * �����
 * 1  5
 */
public class Main_1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5};
        int arr2[] = {1,2,3};
        solution(arr,arr2);
    }
    public static ArrayList<Integer> solution(int []array, int array2[]){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0;i<array.length;i++){
            res.add(array[i]);
        }
        for(int i = 0;i<array2.length;i++){
            if(res.contains(array2[i])){
                while(res.contains(array2[i])) {
                    res.remove(Integer.valueOf(array2[i]));
                }
            }
        }
        return res;
    }
}
