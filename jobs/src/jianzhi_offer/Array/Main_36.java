package jianzhi_offer.Array;

import java.lang.reflect.Array;

/**
 * ͳ��һ�����������������г��ֵĴ���
 */
public class Main_36 {
    public static int GetNumberOfK(int [] array , int k) {
        int res = 0;
        if (array == null || array.length == 0)
            return res;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == k) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,4,5,6};
        System.out.println(GetNumberOfK(arr,2));
    }
}
