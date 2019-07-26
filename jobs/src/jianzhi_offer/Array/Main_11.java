package jianzhi_offer.Array;

/**
 * ����һ��������������������Ʊ�ʾ��1�ĸ��������и����ò����ʾ��
 */
public class Main_11 {
    public static class Solution {
        public static int NumberOf1(int n) {
            int count=0;
            char []a=Integer.toBinaryString(n).toCharArray();
            for(int i=0;i<a.length;i++)
            {
                if(a[i]=='1')
                {
                    count++;
                }
            }
            return count;
        }
        public static int NumberOf(int n)
        {
            int count = 0;
            int res = n;
            while (n > 0)
            {
                count++;
                n = (n - 1) & n;
            }
            if(res<0){
                return 31-count;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.NumberOf1(-1));
        System.out.println(Solution.NumberOf(-1));
    }

}
