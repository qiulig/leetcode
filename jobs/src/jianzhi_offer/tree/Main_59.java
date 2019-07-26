package jianzhi_offer.tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * ��ʵ��һ����������֮���δ�ӡ��������
 * ����һ�а��մ����ҵ�˳���ӡ��
 * �ڶ��㰴�մ��������˳���ӡ��
 * �����а��մ����ҵ�˳���ӡ���������Դ����ơ�
 */
public class Main_59 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public static class Solution {
        public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
         if (pRoot == null) {
                 return result;
             }
         ArrayList<Integer> list = new ArrayList<>();
         LinkedList<TreeNode> queue = new LinkedList<>();
         queue.addLast(null);//��ָ���
         queue.addLast(pRoot);
         boolean leftToRight = true;
         while (queue.size() != 1) {
             TreeNode node = queue.removeFirst();
             if (node == null) {//�����ָ���
                 Iterator<TreeNode> iter = null;
                 if (leftToRight) {
                        iter = queue.iterator();//��ǰ�������
                     } else {
                         iter = queue.descendingIterator();//�Ӻ���ǰ����
                     }
                 leftToRight = !leftToRight;
                 while (iter.hasNext()) {
                         TreeNode temp = (TreeNode) iter.next();
                         list.add(temp.val);
                     }
                 result.add(new ArrayList<Integer>(list));
                 list.clear();
                 queue.addLast(null);//��Ӳ�ָ���
                 continue;//һ��Ҫcontinue
               }
             if (node.left != null) {
                     queue.addLast(node.left);
                 }
             if (node.right != null) {
                     queue.addLast(node.right);
                 }
             }
         return result;
     }

        public static void main(String[] args) {
            TreeNode list = new TreeNode(8);
            list.left = new TreeNode(6);
            list.right = new TreeNode(10);
            list.left.left = new TreeNode(5);
            list.left.right =new TreeNode(7);
            list.right.left = new TreeNode(9);
            list.right.right = new TreeNode(11);
            Print(list);
        }
    }
}
