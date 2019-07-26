package zijie;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
��Ŀ��һ��С�򣬴Ӹ�H�ĵط����£����µ���߶�ΪH/2,�������������С���H�߶����µ���n�ε��������·��
  ����������
    �����һ��Ϊ������m,������m��ÿ��2������H��n,n������5
  ���������
    ���m�У���ʾ��·�̣��������С�����2λ
  ����
     ���룺
        1
        5
        2
     �����
        10.00
 */
public class Main_1 {
    public static double solution(int Height,int n){
        if(n==0)
            return 0;
        if(n == 1)
            return Height;
        double res = Height;
        double H = Height*1.00/2;
        for(int i = 1;i<n;i++){
            res = res + H*2;
            H = H/2;
        }
        return res;
//        return res%.2f;
    }
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int m = sr.nextInt();
        int height[]  = new int[m];
        int n[] = new int[m];
        for(int i = 0;i<m;i++) {
             height[i] = sr.nextInt();
             n[i] = sr.nextInt();
        }
        for(int i = 0;i<m;i++){
            System.out.println(df.format(solution(height[i],n[i])));
//            System.out.println(solution(height[i],n[i]));
        }
    }
}
