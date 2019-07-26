package jianzhi_offer.Array;

import java.util.ArrayList;

public class Main_19 {
    public static class Solution {
        public static ArrayList<Integer> printMatrix(int [][] matrix) {
            // ��������
            int rows = matrix.length;
            // ��������
            int columns = matrix[0].length;
            ArrayList<Integer> list = new ArrayList<Integer>();
            // ��ѭ�������������ǵ�ǰ�������ڸ�Ȧѭ����ʼ�������������Լ���ǰ��������
            //��Ȧѭ����ʼ��������������ÿȦѭ����ʼ��������������ͬ��
            int start = 0;
            // ��(0,0)��ʼѭ��,Ȧ����start=0��һȦ��start=1�ڶ�Ȧ...�Դ�����
            while (rows > start * 2 && columns > start * 2){
                // ÿһȦ���һ���±�
                int endRow = rows - 1 - start;
                // ÿһȦ���һ���±�
                int endColumn = columns - 1 - start;
                // ��ʼһȦȦ��ӡ��ÿ��ӡһȦ��Ϊ�Ĳ��������ҡ����ϵ��¡����ҵ��󡢴��µ���
                // �����ң���һ��һ������
                for (int i = start; i <= endColumn; i++)
                    list.add(matrix[start][i]);
                // ���ϵ��£����һ�д��ڿ�ʼ��
                if (endRow > start){
                    for (int i = start + 1; i <= endRow; i++)
                        list.add(matrix[i][endColumn]);
                }
                // ���ҵ������һ�д��ڿ�ʼ�У����һ�д��ڿ�ʼ��
                if (endRow > start && endColumn > start){
                    for (int i = endColumn - 1; i >= start; i--)
                        list.add(matrix[endRow][i]);
                }
                // ���µ���,�������������У�Ҳ�������һ�д��ڿ�ʼ�м�2�����һ�д��ڿ�ʼ��
                if (endRow >= start + 2 && endColumn > start){
                    for (int i = endRow - 1; i > start; i--)
                        list.add(matrix[i][start]);
                }
                // ������ӡ��һȦ
                start++;
            }
            return list;
        }
    }
    public static void main(String[] args) {
        int arr [][]= {
                      {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12}
                      };
        ArrayList<Integer> res = Solution.printMatrix(arr);
        for(int i:res){
            System.out.print(i+" ");
        }
    }
}
