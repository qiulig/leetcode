package zhaoyin;

import java.util.*;

public class Main_2 {
    static HashMap<String,List<String>> map = new HashMap<>();
    public static void main(String[] args) {
    }
    //����ֵ��ȡ��
    public static String getType(String url){
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            if(entry.getValue().equals(url)){
               return entry.getKey();
            }
        }
        return "";
    }
    //���ݼ���ȡֵ
    public static List<String> getUrl(String url){
        for(Map.Entry<String,List<String>> entry:map.entrySet()){
            if(entry.getKey().equals(url)){
               return  entry.getValue();
            }
        }
        //�����ڷ��ؿ�
        return new ArrayList<>();
    }
}
