package zijie;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 ����Ŀ����
   �����������źܶ��˶������û���Ҳû��ϵ�������Ҹ���ҽ���һ����Ϸ����:��һ�������У����˺ܶ�����ӡ����ĳ������ͬ�����ӣ�����ͨ��һ����������
    (�����߲��ܾ�����������)�������ߵ�ת�۴������������Σ���ô���������ӾͿ�������������ȥ��������˼����������ǰû���������������ѯ��ͬѧ���������
    �߲��ܴ������ƹ�ȥ�ģ�����ʵ�����Ǵ�ġ������Ѿ���ɴ������ֻ�ܽ���ʹ��ˣ����߲��ܴ���Χ�ƹ����������Ⱥ����������ӣ���ͼ��������ȥ��Ȼ����
    Ϸ�ĺ�̨�ж������������ܲ�����ȥ����������������д�����̨����
 ����������
    ���������ж��顣ÿ�����ݵĵ�1��������������n,m(0<n<=1000, 0<m<1000��,�ֱ��ʾ���̵��������������ڽ�������n���У�ÿ����m���Ǹ������������̵ķ����
    ����0��ʾ���λ��û�����ӣ���������ʾ���ӵ����͡���������һ���Ǹ�������q(0<q<50)�� ��ʾ������q��ѯ�ʡ��ڽ�������q���ÿ�����ĸ�������x1, y1, x2,
    y2,��ʾѯ�ʵ�x1��y1�е��������x2��y2�е������ܲ�����ȥ��n=0,m=0ʱ�����������
    ע��:ѯ��֮�����Ⱥ��ϵ��������Ե�ǰ״̬��!
 �������:
    ÿһ���������ݶ�Ӧ1��������������ȥ�����"YES",���������"NO"��
 ���룺
    3   4
    1   2   3   4
    0   0   0   0
    4   3   2   1
    4
    1   1   3   4
    1   1   2   4
    1   1   3   3
    2   1   2   4
    0   0
 �����
    YES
    NO
    NO
    NO
 */
public class Main_5 {
    public static void main(String[] args) {
        List<String> res = new ArrayList<>();
        Scanner sr = new Scanner(System.in);
        while (true) {
            int row = sr.nextInt();
            int col = sr.nextInt();
            if (row == 0 && col == 0) {
                break;
            } else {
                //���������ͼ��
                int[][] map = new int[row][col];
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        map[i][j] = sr.nextInt();
                    }
                }
                int num = sr.nextInt();
                //���ڴ����Ҫ�����ֵ����꣬ÿ��list�������ĸ���������x1,y1,x2,y2
                ArrayList<ArrayList> lists = new ArrayList<>();
                for (int i = 0; i < num; i++) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int j = 0; j < 4; j++) {
                        list.add(sr.nextInt());
                    }
                    lists.add(list);
                }
                for (int i = 0; i < lists.size(); i++) {
                    int x1 = (int) lists.get(i).get(0) - 1;
                    int y1 = (int) lists.get(i).get(1) - 1;
                    int x2 = (int) lists.get(i).get(2) - 1;
                    int y2 = (int) lists.get(i).get(3) - 1;
                    if (map[x1][y1] != map[x2][y2] || (map[x1][y1] == 0 && map[x2][y2] == 0)) {
                        res.add("NO");
                        continue;
                    } else {
                        if (dfs(x1, y1, 0, 0) || dfs(x1, y1, 0, 1)
                                || dfs(x1, y1, 0, 2) || dfs(x1, y1, 0, 3)) {
                            res.add("YES");
                        } else {
                            res.add("NO");
                        }

                    }
                }
            }

        }
        //������
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    private static boolean dfs(int x1, int y1, int turn, int direction) {
        if(turn>2)
            return false;
    return true;
    }


}
