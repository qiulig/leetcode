package zijie.zrjie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ��Ŀ����
 *��һ�����ε�����ṹ�У��ܹ���n���ڵ㣬�����ڴ���̾ݵĹ����л����������ʱ����ڵ㴦��ʱ�ӡ��Ŷ�ʱ�ӡ�����ʱ�ӡ��������ӵȣ����ǽ����д�������в�����ʱ�����ȡ��ֵͳһΪһ����ֵ��
 *Ϊ�������������Ч�ʣ�������Ҫ��ȡĳЩ����ڵ㣬�����������п��ܴ��䵽�������ڵ��У������ʱ�ӣ���ڵ�A���ڵ�B��ʱ��Ϊx���룬�ڵ�B���ڵ�C��ʱ��Ϊy���룬��ڵ�A���ڵ�C����ʱ��Ϊx+y���룬���������д��ڴ����Ľڵ��Լ���εĳ�������ĳ�����Ҫ�þ����ܸ�Ч�ķ�ʽ�����Եõ������
 *��������:
 *       ��һ��һ������n,����ȥn-1��ÿ����������u,v,w,��ڵ�u��ڵ�v֮���ʱ��Ϊw,
 *      �� n+1 ��Ϊһ������q,��ʾ��q�γ���������ȥq��ÿ��һ������pos,��ʾ��ѯ��Ľڵ��š�
 * �������:
 *     ����ÿ���������Ľڵ㣬����ýڵ㵽���������������ڵ�������ʱ�ӡ�
 *ʾ��1
 *   ����
 *   4
 *   1  2   10
 *   1  3   5
 *   4  1   3
 *   2
 *   2
 *   4
 *   �����
 *   15
 *   13

 */
public class Main_5 {
    public static void main(String[] args) {
        Scanner sr   = new Scanner(System.in);
        int n = sr.nextInt();

        List<pos> list = new ArrayList<>();
        for(int i = 0;i< n-1;i++){
            list.add(new pos(sr.nextInt(),sr.nextInt(),sr.nextInt()));
        }
        //��ȡ�������
        int arr[][] = new int[n][n];
        for(int i = 0;i< list.size();i++){
                arr[list.get(i).getX()-1][list.get(i).getY()-1] = list.get(i).getDistance();
                arr[list.get(i).getY()-1][list.get(i).getX()-1] = list.get(i).getDistance();
        }

        int q = sr.nextInt();
        int []pos = new int[q];
        for(int i = 0;i<q;i++){
            pos[i]  = sr.nextInt();
        }
    }
    public static void solution(int arr[][]){

    }
    static class pos{
        int x;
        int y;
        int distance;

        public pos(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getDistance() {
            return distance;
        }

        public void setDistance(int distance) {
            this.distance = distance;
        }
    }
}
