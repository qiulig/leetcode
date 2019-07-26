package leetcode.tree;

import java.util.ArrayList;
//ִ����ʱ :1 ms, ������ Java �ύ�л�����99.59%���û�
//�ڴ����� :38.8 MB, ������ Java �ύ�л�����31.70%���û�
public class Main_111 {
    //  Definition for a binary tree node.
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) {
              val = x;
          }
      }
        public static int minDepth(TreeNode root) {
                if(root == null)
                    return 0;
                int left = minDepth(root.left);
                int right = minDepth(root.right);
                //������Ҷ�ӽ��
                if(left == 0 )
                    return right+1;
                if(right == 0)
                    return left+1;
                return left>right?right+1:left+1;
        }


        public static void main(String[] args) {
            TreeNode root = new TreeNode(3);
            root.left = new TreeNode(9);
            root.right = new TreeNode(20);
            root.right.left = new TreeNode(15);
            root.right.right = new TreeNode(7);
            System.out.println(minDepth(root));
        }
    }
