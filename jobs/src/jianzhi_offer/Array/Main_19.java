package jianzhi_offer.Array;

import java.util.ArrayList;

public class Main_19 {
    public static class Solution {
        public static ArrayList<Integer> printMatrix(int [][] matrix) {
            // 矩阵行数
            int rows = matrix.length;
            // 矩阵列数
            int columns = matrix[0].length;
            ArrayList<Integer> list = new ArrayList<Integer>();
            // 让循环继续的条件是当前行数大于该圈循环开始的行数的两倍以及当前列数大于
            //该圈循环开始的列数的两倍（每圈循环开始的行数、列数相同）
            int start = 0;
            // 从(0,0)开始循环,圈数：start=0第一圈，start=1第二圈...以此类推
            while (rows > start * 2 && columns > start * 2){
                // 每一圈最后一行下标
                int endRow = rows - 1 - start;
                // 每一圈最后一列下标
                int endColumn = columns - 1 - start;
                // 开始一圈圈打印，每打印一圈分为四步，从左到右、从上到下、从右到左、从下到上
                // 从左到右，第一步一定会走
                for (int i = start; i <= endColumn; i++)
                    list.add(matrix[start][i]);
                // 从上到下，最后一行大于开始行
                if (endRow > start){
                    for (int i = start + 1; i <= endRow; i++)
                        list.add(matrix[i][endColumn]);
                }
                // 从右到左，最后一行大于开始行，最后一列大于开始列
                if (endRow > start && endColumn > start){
                    for (int i = endColumn - 1; i >= start; i--)
                        list.add(matrix[endRow][i]);
                }
                // 从下到上,至少是三行两列，也就是最后一行大于开始行加2，最后一列大于开始列
                if (endRow >= start + 2 && endColumn > start){
                    for (int i = endRow - 1; i > start; i--)
                        list.add(matrix[i][start]);
                }
                // 继续打印下一圈
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
