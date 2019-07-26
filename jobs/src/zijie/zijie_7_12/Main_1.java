package zijie.zijie_7_12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *��һ������N,һֱִ��һ�ֲ��������������ֿ��Կ����õ�һ����������ô��������ֿ���(ȡsqrt) �������һ�� ��ִ�ж��ٴβ����ܰ�������ּ���1
 ��������:
 ����N,1<=N<=10^18
 �������:
 ���ִ�ж��ٴβ����ܰ�N����1
 ʾ��1
    ���룺 10
    ����� 4
 ˵���� 10->9-> 3 ->2 ->1
 */
public class Main_1 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        long N = sr.nextLong();
        System.out.println(solution(N));
    }
    //ͨ����30%
    public static long solution(long N){
        if(N <= 0)
            return 0;
        long count = 0;
        while(N != 1){
            if(Math.sqrt(N) == (long) Math.sqrt(N) ){
                N = (long)Math.sqrt(N);
                count++;
            }else{
                N = N - 1;
                count++;
            }
        }
        return count;
    }
    //ͨ����100%
    public static void method(long n){
        long temp = n;
        List<Long> list = new ArrayList<>();
        //�� 2--N�������п��Կ����ŵ����浽list����
        while (temp >1){
            temp = (long) Math.sqrt(temp);
            list.add(temp * temp);
        }
        int count = 0;
        //list�������������
        int pos = 0;
        while (n > 1){
            //�����ǰ���ǿ��Կ����ŵ�
            if(n == list.get(pos)){
                ++count;
                //������ָ����һ����
                ++pos;
                n = (long) Math.sqrt(n);
            }else{
                //�м�����1�ĸ���
                count += (n-list.get(pos));
                //n��ɼ�ȥn��1���Ǹ����Կ����ŵ���
                n = list.get(pos);
            }
        }
        System.out.println(count);
    }
}
