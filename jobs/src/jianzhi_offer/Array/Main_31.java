package jianzhi_offer.Array;

/**
 * ���1~13��������1���ֵĴ���,�����100~1300��������1���ֵĴ�����
 * Ϊ�����ر�����һ��1~13�а���1��������1��10��11��12��13��˹�����6��,���Ƕ��ں�����������û���ˡ�
 * ACMerϣ�����ǰ����,������������ձ黯,���Ժܿ���������Ǹ�����������1���ֵĴ�������1 �� n ��1���ֵĴ�������
 */
public class Main_31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        String s="";
        for(int i = 1;i<=n;i++){
            s= i+"";
            count += s.length()-s.replaceAll("1", "").length();
            s.isEmpty();
        }
        return count;
    }


    public static void main(String[] args) {
     NumberOf1Between1AndN_Solution(10);
    }
}
