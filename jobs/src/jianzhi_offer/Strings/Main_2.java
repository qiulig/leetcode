package jianzhi_offer.Strings;

/**
 * ��ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 * ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class Main_2 {
    public static class Solution {
        public static String replaceSpace(StringBuffer str) {
            return str.toString().replaceAll(" ", "%20");
        }

        public static void main(String[] args) {
            StringBuffer s =new StringBuffer("we are happy");
            System.out.println(replaceSpace(s));
        }
        public String replaceSpace2(StringBuffer str) {
                int spacenum = 0;//spacenumΪ����ո���
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i)==' ')
                        spacenum++;
                }
                //indexoldΪΪ�滻ǰ��str�±�
                int indexold = str.length()-1;
                //����ո�ת����%20֮���str����
                int newlength = str.length() + spacenum*2;
                //indexoldΪΪ�ѿո��滻Ϊ%20���str�±�
                int indexnew = newlength-1;
                //ʹstr�ĳ�������ת����%20֮��ĳ���,��ֹ�±�Խ��
                str.setLength(newlength);
                for(;indexold>=0 && indexold<newlength;--indexold){
                    if(str.charAt(indexold) == ' '){
                        str.setCharAt(indexnew--, '0');
                        str.setCharAt(indexnew--, '2');
                        str.setCharAt(indexnew--, '%');
                    }else{
                        str.setCharAt(indexnew--, str.charAt(indexold));
                    }
                }
                return str.toString();
            }
        }

}
