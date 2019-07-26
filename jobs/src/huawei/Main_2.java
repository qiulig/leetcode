package huawei;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Main_2 {
    public static void main(String[] args) {
        solution(423234);
        solution2(4322234);
    }
    public static void solution(long a) {
        //��ų���һ�ε���
        List<Integer> list1 = new ArrayList<>();
        //����ظ�����
        List<Integer> list2 = new ArrayList<>();
        while (a != 0) {
            int temp = (int)a % 10;
            if (!list1.contains(temp) && !list2.contains(temp)) {
                list1.add(temp);
            } else {
                list1.remove(Integer.valueOf(temp));
                list2.add(temp);
            }
            a = a / 10;
        }
        //ʵ��Comparator,�����ȶ��дӴ�С����
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(int i = 0;i<list1.size();i++){
            queue.add(list1.get(i));
        }
        for(int i = 0;i<list2.size();i++){
            queue.add(list2.get(i));
        }
        long res = 0;
        while (queue.size()!=0){
            res = res*10 + queue.poll();
        }
        System.out.println(res);
    }
    public static void solution2(long a){
        //����Ͱ�����������ж��ĸ�ֵ���ֹ�
        int count[] = new int[10];
        //�������������ǰ�������0-9��������������ǰ����ѭ��
        List<Integer> list = new ArrayList<>();
        while (a!=0){
            int temp =(int) a%10;
            count[temp]++;
            //list������û���ֵ�ֵ
            if(!list.contains(temp)){
                list.add(temp);
            }
            //�ж��Ƿ���ǰ����ѭ��
            if(list.size() == 10){
                break;
            }
            a = a / 10;
        }
        //���������
        long res = 0;
        for(int i = count.length-1;i>=0;i--){
            if(count[i]!=0){
                res = res*10 + i;
            }
        }
        System.out.println(res);
    }


}
