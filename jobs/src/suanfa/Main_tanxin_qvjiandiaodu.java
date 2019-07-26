package suanfa;

import java.lang.reflect.Array;
import java.util.*;

public class Main_tanxin_qvjiandiaodu {
    //1.ʱ�������,�����������
    //�γ�	��ʼʱ��	����ʱ��
    //����	  9AM	       10AM
    //Ӣ��	  9:30AM	   10:30AM
    //��ѧ	  10AM	       11AM
    //�����  10:30AM	   11:30AM
    //���� 	  11AM	       12PM
    //�㷨��ƣ�
    //   ��������Ļi�Ŀ�ʼʱ��С�����ѡ��Ļj�Ľ���ʱ�䣬��ѡ��i,����ѡ��i
    // 1.ѡ���������ĿΣ�����Ҫ��������Ͽεĵ�һ�ڿ�
    // 2.ѡ���һ�ÿν�����ſ�ʼ�ĿΣ����ҽ�������ĿΣ��⽫�ǵڶ����ڽ����ϵĿΡ�
    public static void main(String[] args) {
        String subject[] = {"Ӣ��","��ѧ","�����","����","����"};
        Work[]  works = {
                new Work(1,3),
                new Work(2, 5),
                new Work(4, 7),
                new Work(6, 9),
                new Work(8, 10)
        };
        int result = solution(works);
        System.out.println(result);
//        solution(subject,5,start,end);
    }
    private static int solution(Work[] works) {
        //works�����Ѿ���end��С����������
        Arrays.sort(works);
        int count = 0;
        //��ǰ�����Ľ���ʱ��
        int endTime = 0;
        for(int i = 0;i<works.length;i++){
            if(endTime<works[i].getStart()){
                count++;
                endTime = works[i].getEnd();
            }
        }
        return count;
    }

    static class Work implements Comparable{
        private int start;
        private int end;
        public Work(int start, int end) {
            this.start = start;
            this.end = end;
        }
        //end ��С��������
        @Override
        public int compareTo(Object o) {
            Work work = (Work) o;
            if(this.end > work.getEnd()){
                return 1;
            }else if(this.end == work.getEnd()){
                return 0;
            }else{
                return -1;
            }
        }
        public int getStart() {
            return start;
        }


        public int getEnd() {
            return end;
        }


    }

}
