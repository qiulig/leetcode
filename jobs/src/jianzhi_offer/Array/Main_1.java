package jianzhi_offer.Array;

/**
 * ��һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
 * �ж��������Ƿ��и�������
 */
public class Main_1 {
    public static class Solution {
        public static  boolean Find(int target, int [][] array) {
            boolean res = false;
            int row = 0;
            int col = array[0].length-1;
            while(row<=array.length-1&&col>=0){
                if(array[row][col]>target){
                    col--;
                }else if(array[row][col]<target){
                    row++;
                }else{
                    res = true;
                    break;
                }
            }
            return res;
        }

        public static void main(String[] args) {
           int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
            System.out.println(Find(3,a));
        }
    }
}
