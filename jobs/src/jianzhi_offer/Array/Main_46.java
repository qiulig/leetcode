package jianzhi_offer.Array;

public class Main_46 {
    public static int Sum_Solution(int n) {
        int sum = n;
        boolean ans = (n>0)&&((sum+=Sum_Solution(n-1))>0);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Sum_Solution(3));
    }
}
