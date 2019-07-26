package jianzhi_offer.Array;

/**
 * ��ֻ����������2��3��5��������������Ugly Number����
 * ����6��8���ǳ�������14���ǣ���Ϊ������������7��
 * ϰ�������ǰ�1�����ǵ�һ���������󰴴�С�����˳��ĵ�N��������
 */
public class Main_33 {
    public static void main(String[] args) {
        System.out.println(GetUglyNumber_Solution(7));
    }
    public static int GetUglyNumber_Solution(int index) {
        int[] arr = new int[index];
        if (index == 0)
            return 0;
        arr[0] = 1; //��һ������Ϊ1����������ĵ�һ��Ԫ��
        int t2 = 0;
        int t3 = 0;
        int t5 = 0;
        for (int i = 1; i < index; i++) {
            //Ѱ��3����������С���Ǹ���
            arr[i] = Math.min(arr[t2] * 2, Math.min(arr[t3] * 3, arr[t5] * 5));
            //��С���Ǹ���������ֵ��1
            if (arr[t2] * 2 == arr[i])
                t2++;
            if (arr[t3] * 3 == arr[i])
                t3++;
            if (arr[t5] * 5 == arr[i])
                t5++;
        }

        return arr[index - 1];

    }

}
