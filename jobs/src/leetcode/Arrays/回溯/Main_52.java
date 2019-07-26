package leetcode.Arrays.����;

import java.lang.reflect.Array;
import java.util.*;
//ִ����ʱ :29 ms, ������ Java �ύ�л�����5.45%���û�
//�ڴ����� :34.8 MB, ������ Java �ύ�л�����41.25%���û�
public class Main_52 {
    public static int totalNQueens(int n) {
        //���ڴ洢��
        List<Integer> col = new ArrayList<>();
        //���ڴ洢���Խ���
        List<Integer> z_diagonal = new ArrayList<>();
        //���ڴ洢���Խ���
        List<Integer> f_diagonal = new ArrayList<>();
        //�洢���
        List<List<String>> res = new ArrayList<>();
        //�ӵ�һ��row = 0��ʼ
        backtrack(0, n, res, new ArrayList<String>(), col, z_diagonal, f_diagonal);
        return res.size();
    }
    public static void backtrack(int row, int NumOfQueen, List<List<String>> res, ArrayList<String> tmplist, List<Integer> col, List<Integer> z_diagonal, List<Integer> f_diagonal) {
        //���������һ��
        if (row == NumOfQueen) {
            res.add(new ArrayList<>(tmplist));
            return;
        }
        //�ӵ�0�п�ʼ����
        for (int column = 0; column < NumOfQueen; column++) {
            //������ڹ�����Χ�ڣ�����ͬһ�л���ͬһ�� && ���Խ��ߺ���� &&  ���Խ��߲���ȣ�
            if (!col.contains(column) && !f_diagonal.contains(row + column) && !z_diagonal.contains(row - column)) {
                col.add(column);
                f_diagonal.add(row + column);
                z_diagonal.add(row - column);
                char[] s = new char[NumOfQueen];
                Arrays.fill(s, '.');
                //��һ�е�jλ�÷Żʺ�
                s[column] = 'Q';
                tmplist.add(new String(s));
                //�����㷨
                backtrack(row+1,NumOfQueen,res,tmplist,col,z_diagonal,f_diagonal);
                tmplist.remove(tmplist.size() - 1);
                col.remove(Integer.valueOf(column));
                f_diagonal.remove(Integer.valueOf(row + column));
                z_diagonal.remove(Integer.valueOf(row - column));
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(totalNQueens(4));
    }
}
