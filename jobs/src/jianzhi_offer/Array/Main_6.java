package jianzhi_offer.Array;

/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���Ǽ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0��
 */
public class Main_6 {
    public static class Solution {
            public static int minNumberInRotateArray(int[] array){
                int low = 0;
                int high = array.length - 1;
                while(low < high){
                    int middle = low + (high - low)/2;
                    if(array[middle] > array[high]){
                        low = middle + 1;
                    }else if(array[middle] == array[high]){
                        high = high - 1;
                    }else{
                        high = middle;
                    }
                }
                return array[low];
            }
        }

    public static void main(String[] args) {
        int arr[] = {1,1,1,0,1,1};
        int a[] = {1,0,1,1,1};
        int b[] = {3,4,5,1,2};
        System.out.println(Solution.minNumberInRotateArray(arr));
    }
    }
