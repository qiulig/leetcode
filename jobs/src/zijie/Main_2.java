package zijie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Ѱ����С������
 * ��Ŀ������һϵ��2άƽ��������(x, y),����x��y��Ϊ������Ҫ���ø���С�ĳ����ο����е�����ڡ�
 *      �����ο�ı߷ֱ�ƽ����x��y�����ᣬ�����ڱ���Ҳ���Ǳ������ڡ�
 * ����������
 *      ��������������ɲ���������ÿ������������һϵ��������ɣ�ÿ������ռһ�У�����|x|��|y|С��231; - -��0�����־��һ�����������Ľ�����
 *      ע�⣨0��0������Ϊ�κ�һ��������������ĵ㡣һ��û�е�Ĳ���������־����������Ľ���
 * ���������
 *      ��û��������������1�������2�������������һ���ո��������һ�Ա�ʾ���������½ǵ����꣬��2�Ա�ʾ���������Ͻǵ����ꡣ
 * ʾ����
 *   ���룺
 *      12  56
 *      23  56
 *      13  10
 *      0    0
 *      12   34
 *      0    0
 *      0    0
 *   �����
 *
 */
public class Main_2 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        List<List<int[]>> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> listxx = new ArrayList<>();
        ArrayList<ArrayList<Integer>> listyy = new ArrayList<>();
        while (true){
            ArrayList<Integer> listx = new ArrayList<>();
            ArrayList<Integer> listy = new ArrayList<>();
            while (true){
                int x=sr.nextInt();
                int y=sr.nextInt();
                listx.add(x);
                listy.add(y);
                if(x==0&&y==0){
                    listxx.add(listx);
                    listyy.add(listy);
                    break;
                }
            }
            if( listxx.get(listxx.size()-1).size()==1
                    && (listxx.get(listxx.size()-1).get(0)==0 && listyy.get(listyy.size()-1).get(0)==0) &&
                        (listxx.get(listxx.size()-2).get(listxx.get(listxx.size()-2).size()-1)==0
                            &&listyy.get(listyy.size()-2).get(listyy.get(listxx.size()-2).size()-1)==0))
                    break;
        }
        for(int i = 0;i<listxx.size();i++){
            listxx.get(i).remove(listxx.get(i).size()-1);
            listyy.get(i).remove(listyy.get(i).size()-1);
        }
        for(int i = 0;i<list.size()-1;i++){
            solution(listxx.get(i),listyy.get(i));
        }

    }
    private static void solution(ArrayList<Integer> listx, ArrayList<Integer> listy) {
        Collections.sort(listx);
        Collections.sort(listy);
        int min_x = listx.get(0);
        int min_y = listy.get(0);
        int max_x = listx.get(listx.size()-1);
        int max_y = listy.get(listy.size()-1);
        System.out.println(min_x +" "+ min_y + " " + max_x +" "+ max_y);
    }

}
