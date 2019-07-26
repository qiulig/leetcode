package jianzhi_offer.Array;

/**
 * ��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * ���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
 * ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 */
public class Main_53 {
    public static boolean isNumeric(char[] str) {
        String ss = String.valueOf(str);
        int len = ss.length();
        //���ж�ÿ���ַ��Ƿ�Ϸ�
        for(int i=0; i<len; i++){
            char c = ss.charAt(i);
            if(!((c>='0' && c <= '9') || c=='e' || c=='E'
                    || c=='+' || c=='-'|| c=='.'))
                return false;
        }
        ////������,E������ĩβ
        if(ss.charAt(len-1) == '+' || ss.charAt(len-1) == '-'
                || ss.charAt(len-1) == 'E' || ss.charAt(len-1) == 'e')
            return false;
        //�ж�С���㣬ֻ����һ��
        if(ss.indexOf(".") != ss.lastIndexOf("."))
            return false;
        //���������м��λ��ʱ��ǰ�����e��E,����������
        for(int i=1; i<len-1; i++){
            char c = ss.charAt(i);
            if(c == '+' || c=='-'){
                if(!(ss.charAt(i-1) == 'e' || ss.charAt(i-1) == 'E')
                        ||!(ss.charAt(i+1)>='0' && ss.charAt(i+1)<='9'))
                    return false;
            }
        }
        ////e�ĺ��治��������12E+4.3
        for(int i=1; i<len; i++){
            char c = ss.charAt(i);
            if(c == 'e' || c=='E'){
                if(i==len-1)
                    return false;
                if(ss.charAt(i+1) == '+' || ss.charAt(i+1) == '-'){
                    //��i+2��ʼ����û��С����.�򷵻�-1
                    if(ss.indexOf(".", i+2) != -1){
                        return false;
                    }
                }else{
                    if(ss.indexOf(".", i+1) != -1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char []str = {'+','1','e','.','3'};
        System.out.println(isNumeric(str));
    }
}
