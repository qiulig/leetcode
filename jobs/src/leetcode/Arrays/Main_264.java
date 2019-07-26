package leetcode.Arrays;

/**
 * ����
 * ��дһ�������ҳ��� n ��������
 ��������ֻ���������� 2, 3, 5 ����������
 ʾ��:
 ����: n = 10
 ���: 12
 ����: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 ��ǰ 10 ��������
 ˵��:
 1 �ǳ�����
 n ������1690��
 */
public class Main_264 {
    public static int nthUglyNumber(int n) {
        int [] arr = new int[n];
        if(n==0)
            return 0;
        arr[0] = 1;
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for(int i = 1;i<n;i++){
            arr[i] =Math.min(Math.min(arr[t2]*2,arr[t3]*3),arr[t5]*5);
            if(arr[t2]*2 == arr[i]){
                t2++;
            }
            if(arr[t3]*3 == arr[i]){
                t3++;
            }
            if(arr[t5]*5 == arr[i]){
                t5++;
            }
        }
        return arr[n-1];
    }

    public static void main(String[] args) {
        nthUglyNumber(10);
    }
}
