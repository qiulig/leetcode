package jianzhi_offer.Strings;

/**
 * �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 * ����һ���������ַ�����S���������ѭ������Kλ������������
 * ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc�����ǲ��Ǻܼ򵥣�OK���㶨����
 */
public class Main_43 {
    public static String LeftRotateString(String str,int n) {
        if(n>str.length())
            return null;
        return str.substring(n,str.length())+str.substring(0,n);
    }
    public static void main(String[] args) {
        System.out.println(LeftRotateString("abcXYZdef",3));
    }
}
