package zhaoyin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
//        String str = sr.nextLine();
        String str = "";
        solution(str);
    }
    public static List<String> solution(String str){
        List<String> res = new ArrayList<>();
        int index = 0;
        for(int i = 0;i<str.length();i++){
            //�ж��ַ��ǲ���[a-z][A-Z]
            if((str.charAt(i)>='a' && str.charAt(i)<='z')||(str.charAt(i)>='A' && str.charAt(i)<'Z')){
            }else{
                //���������ַ�����֮ǰ��Ӣ����ӵ�res����
                res.add(str.substring(index,i));
                //�����ı���ӵ�res����
                res.add(str.charAt(i)+"");
                //���´�Ҫ��ȡ����������ĳ���һ���ַ�����������
                index = i+1;
            }
        }
        //���һ�º���һֱû���������ַ������Ǻ����Ӣ���ַ�Ҳû�ӵ�res���棬�������
        if(index < str.length()){
            res.add(str.substring(index,str.length()));
        }
        return res;
    }
}
