package jianzhi_offer.Strings;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 * ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼�����磬��student. a am I������������ʶ����
 * ��һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ���ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class Main_44 {
    public static String ReverseSentence(String str) {
        if(str.equals("")||str.equals(" "))
            return str;
        String res[] = str.split(" ");
        StringBuilder ss = new StringBuilder();
        for(int i = res.length-1;i>0;i--){
            ss.append(res[i]+" ");
        }
        ss.append(res[0]);
        return ss.toString();
    }

    public static void main(String[] args) {
       String str = ReverseSentence("student. a am I");
        System.out.println(str+'\t'+str.length());

    }
}
