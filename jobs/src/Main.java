import leetcode.LinkLists.Main_2;

import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Integer a = -128;
        Integer b = -128;
        System.out.println(a==b);

//        solution(arr,arr2);
    }
//    public static ArrayList<Integer>  solution(int []array,int array2[]){
//        ArrayList<Integer> res = new ArrayList<>();
//        for(int i = 0;i<array.length;i++){
//            res.add(array[i]);
//        }
//        for(int i = 0;i<array2.length;i++){
//            if(res.contains(array2[i])){
//                while(res.contains(array2[i])) {
//                    res.remove(Integer.valueOf(array2[i]));
//                }
//            }
//        }
//        return res;
//    }
static class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
    public static void solution(int m ,int n ,ListNode head){
        ListNode heads = head;
        ListNode node1Pre = null;
        for(int k = 1;k < m && head != null; k++){
            node1Pre = head;
            head= head.next;
        }
        ListNode node1 = head;
        ListNode node2Pre = null;
        heads = head;
        for(int k = 1;k < n && head != null; k++){
            node2Pre = head;
            head = head.next;
        }
        ListNode node2 = head;
        node1Pre.next = node2;
        ListNode tmp = node2.next;
        node2.next = node1.next;
        node2Pre.next = node1;
        node1.next = tmp;
        while (heads!=null) {
            System.out.println(heads.val);
            heads = heads.next;
        }

    }
}