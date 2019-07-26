package С��;

import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        String[] arr = str.split("\\s+");
        int a[] = new int[arr.length-1];
        for(int i = 0;i<a.length;i++){
            a[i] = Integer.parseInt(arr[i+1]);
        }
//        int a[] = {60 ,76 ,66 ,76 ,85 ,55 ,61 ,71 ,84 ,62};
        System.out.println(solution(a));

    }

    private static int solution(int[] arr) {
        int bonus[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            bonus[i] = 1;
        }
        //�����ҿ�,�ӵڶ��������һ�����ĸ���
        //���Լ����ĳ�ʦ���������Լ�С�ģ������Ļ����ϼ�һ
        for(int i = 1;i<=arr.length-1;i++){
            //����ұߵ���������ߵ������ұߵ��� = ��ߵ��� + 1
            if(arr[i]>arr[i-1]){
                bonus[i] = bonus[i-1] + 1;
            }
        }
        //���ҵ���,�ӵ�2���������ڶ����ĸ��£�
        // �����ߵ��������ұߵ��������Ҵ�ʱ��ߵ�bonusС���ұߵģ���ߵ���  = �ұߵ� + 1
        //���Լ��Ҳ�ĳ�ʦ���������Լ�С�ģ�max(�Լ����Ҳ�+1)
        for(int j = arr.length-2;j>=0;j--){
            if(arr[j]>arr[j+1]){
                bonus[j] =Math.max(bonus[j+1]+1,bonus[j]);
            }
        }
        //����õ���
        int res = 0;
        for(int i = 0;i<bonus.length;i++){
            res +=bonus[i];
        }
        return res;
    }
}
