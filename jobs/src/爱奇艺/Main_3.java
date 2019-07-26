package ������;
import java.util.*;
//̰���㷨�������������
public class Main_3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int N = sr.nextInt();
        List<Work> lists = new ArrayList<>();
        for(int i = 0;i<N;i++){
            int x1 = sr.nextInt();
            int x2 = sr.nextInt();
            if(x1<x2)
                lists.add(new Work(x1,x2));
            else
                lists.add(new Work(x2,x1));
        }
        System.out.println(solution(lists));
}
    private static int solution(List<Work> works) {
        //works�����Ѿ���end��С����������
        Collections.sort(works);
        int count = 1;
        //��ǰ�����Ľ���ʱ��
        int endTime = works.get(0).getEnd();
        for(int i = 1;i<works.size();i++){
            if(endTime<=works.get(i).getStart()){
                count++;
                endTime = works.get(i).getEnd();
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
