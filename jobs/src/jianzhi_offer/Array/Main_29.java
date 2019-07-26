package jianzhi_offer.Array;

import java.util.ArrayList;

/**
 * ����n���������ҳ�������С��K��������������4,5,1,6,2,7,3,8��8�����֣�����С��4��������1,2,3,4,��
 */
public class Main_29 {
    public static void main(String[] args) {
        int input[] = {4,5,1,6,2,7,3,8};
        GetLeastNumbers_Solution(input,4);
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input.length<k)
            return res;
        quicksort(input, 0, input.length - 1);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }
    public static void quicksort(int arr[], int low, int high)
    {
        if(low < high)
        {
            int position = partition(arr, low, high);
            quicksort(arr, low, position - 1);
            quicksort(arr, position + 1, high);
        }

    }
        public static int partition(int arr[], int low, int high) {
            //���û�׼ֵ
            int key = arr[low];
            while(low < high){
                //���ҵ���ֱ���ҵ�һ��С��key��ֵ
                while(low < high && arr[high] >= key) --high;
                //����ֵ����ǰ�Ŀ�
                arr[low] = arr[high];
                //�����ң�ֱ���ҵ�һ������key��ֵ
                while(low < high && arr[low] <= key) ++low;
                //����ֵ����ǰһ����
                arr[high] = arr[low];
            }
            //����׼ֵ�������һ����
            arr[low] = key;
            //���һ���ӻ��������С�ڸ�ֵ���ұߴ��ڸ�ֵ
            return low;
        }
    }
