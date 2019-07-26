package leetcode.Arrays;

import java.util.Stack;

public class Main_9 {

    public static boolean isPalindrome(int x) {
        String res = x+"";
        String ans = new StringBuilder(x+"").reverse().toString();
        if(res.equals(ans)){
            return true;
        }
        return false;
    }
    public static boolean isPalindrome2(int x) {
        Stack<Integer> stack = new Stack<>();
        int res = x;
        if(x<0)
            return false;
        while(x>0){
            stack.push(x%10);
            x = x /10;
        }
        while (res>0){
            if(stack.pop()==res%10){
                res = res/10;
            }else {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome2(424));
    }
}
