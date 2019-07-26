package jianzhi_offer.tree;

import jianzhi_offer.LinkLists.Main_3;

import javax.swing.tree.TreeNode;
import java.util.Arrays;

/**
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}�����ؽ������������ء�
 */
public class Main_4 {
    //���Ĺ���
      public static class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public static class Solution {
        public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {
            if(pre.length==0 || in.length==0)
                return null;
            TreeNode node = new TreeNode(pre[0]);	//�����
            for(int i=0;i<pre.length;i++){
                if(pre[0] == in[i]){	 //�ҵ����ڵ�����������ĵ㣬���Ϊ������ڵ㣬�ұ�Ϊ�����ҽڵ�
                    //�ݹ���ù�����ǰ�ڵ��������
                    node.left = reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                    //�ݹ���ù�����ǰ�ڵ��������
                    node.right = reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                    break;
                }
            }
            return node;
        }
    }

    public static void main(String[] args) {
        int pre[] = {1,2,4,7,3,5,6,8};
        int in[] = {4,7,2,1,5,3,8,6};
        TreeNode node =  Solution.reConstructBinaryTree(pre,in);
        postprint(node);
    }
    public static void postprint(TreeNode node){
          if(node!=null)
          {
              postprint(node.left);
              postprint(node.right);
              System.out.print(node.val+" ");
          }
    }
}
