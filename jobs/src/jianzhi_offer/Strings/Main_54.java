package jianzhi_offer.Strings;

/**
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ���
 * ���磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"g"�����Ӹ��ַ����ж���ǰ�����ַ���google"ʱ��
 * ��һ��ֻ����һ�ε��ַ���"l"��
 */
public class Main_54 {
    //ԴԴ���ϵ�����ĸ�ŵ��ַ����У�����һ��256����С��int�������������ϣ��
    public class Solution {
        String str="";
        int[] count=new int[256];
        public void Insert(char ch)
        {
            if(ch >=256){
                return ;
            }else{
                str+=ch;//�ַ������ַ���
                count[ch]++;//�����ַ����޸������ַ�Ԫ�ص�ֵ
            }
        }
        public char FirstAppearingOnce()
        {
            for(char c:str.toCharArray()){// //ע����ǣ�Ҫ�ҵ�һ������һ�ε��ַ������Ա����ַ��������ܱ�����ϣ����
                if(count[c]==1){//����ַ�����Ϊ�±��Ԫ��ֵΪ1��˵�����ַ�����һ�Σ�ֱ�ӷ��ظ��ַ�
                    return c;
                }
            }
            return '#';
        }
    }
}
