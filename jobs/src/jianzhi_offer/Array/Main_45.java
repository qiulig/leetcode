package jianzhi_offer.Array;

import java.util.Arrays;

/**
 * LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...��������г����5����,
 * �����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���������A,����3,С��,����,��Ƭ5��,��Oh My God!��
 * ����˳��.....LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 * �����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ����
 * ����,Ҫ����ʹ�������ģ������Ĺ���,
 * Ȼ���������LL��������Σ� ����������˳�Ӿ����true����������false��Ϊ�˷������,�������Ϊ��С����0��
 */
public class Main_45 {
    public static boolean isContinuous(int [] numbers) {
        if(numbers.length<5)
            return false;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        int count[] = new int[14];
        //��0����û���ظ�����
        for(int i = 0;i<numbers.length;i++){
            count[numbers[i]]++;
            //����Ǵ�С���Ļ���������������ֱ��continue��ִ��count[numbers[i]>=2���ж�
            if(numbers[i] == 0){
                continue;
            }
            if(count[numbers[i]]>=2){
                return false;
            }
            //
            if(Max<numbers[i]) {
                Max = numbers[i];
            }
            if(Min >numbers[i]){
                Min = numbers[i];
            }
        }
        if ( Max - Min < 5) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int numbers[] = {0,2,3,4,6};
        System.out.println(isContinuous(numbers));
    }
}
