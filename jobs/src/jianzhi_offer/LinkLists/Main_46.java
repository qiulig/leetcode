package jianzhi_offer.LinkLists;

/**
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
 * ��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,
 * �����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 */
public class Main_46 {
    public static int LastRemaining_Solution(int n, int m) {
        if(n<1||m<1)
            return -1;
        int array[] = new int[n];
        int i = -1 ;
        int step = -1;
        int count = n;
        while (count>0){  //��Ϸ��ʼ
            i++;  //����
            if(i >= n)
                i=0;
            if(array[i] == -1) continue;
            step++;
            if(step == m-1){
                array[i] = -1;
                step = -1;
                count--;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5,3));
    }
}
