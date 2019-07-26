package jianzhi_offer.Array;

/**
 * ��һ���ַ���ת����һ������(ʵ��Integer.valueOf(string)�Ĺ��ܣ�
 * ����string����������Ҫ��ʱ����0)��Ҫ����ʹ���ַ���ת�������Ŀ⺯����
 * ��ֵΪ0�����ַ�������һ���Ϸ�����ֵ�򷵻�0��
 */
public class Main_49 {
    public static int StrToInt(String str) {
        if(str.trim().equals("")){
            return 0;
        }
        int sum = 0;
        int flag = 1;
        if(str.charAt(0) =='+'||str.charAt(0)=='-'){
            if(str.charAt(0)=='-') {
                flag = -1;
            }
            sum = cal(str,1,str.length(),flag);
        }else{
            sum = cal(str,0,str.length(),flag);

        }
        return sum*flag;
    }

    private static int cal(String str, int start, int end,int flag) {
        int sum = 0;
        for(int i = start;i<end;i++){
            if(str.charAt(i)>='0' &&str.charAt(i)<='9'){
                if(flag == 1 && sum>Integer.MAX_VALUE)
                    throw new RuntimeException("�����");
                if(flag == -1 && sum<Integer.MIN_VALUE)
                    throw new RuntimeException("�����");
                sum = sum*10+str.charAt(i)-'0';
            }else{
                return 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(StrToInt("+214"));
        System.out.println(StrToInt("-2a4"));
    }

}
