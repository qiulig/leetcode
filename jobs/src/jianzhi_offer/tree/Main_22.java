package jianzhi_offer.tree;

import java.util.ArrayList;

public class Main_22 {
     public static class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }
     }
    public static class Solution {
        public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
            //����һ���б������洢�ڵ�
            ArrayList<TreeNode> treelist=new ArrayList<TreeNode>();
            ArrayList<Integer> intlist=new ArrayList<Integer>();

            if(root==null)  //û�нڵ�
                return intlist;
            //1.�ȴ�����ڵ�
            treelist.add(root);
            //2.ѭ�������б�һ��ʼ�б������root
            for(int i=0;i<treelist.size();i++)
            { TreeNode node=treelist.get(i);
                //3.������ӽڵ㲻Ϊ�գ��򽫽ڵ�����б�
                if(node.left!=null)
                    treelist.add(node.left);
                //3��������ӽڵ㲻Ϊ�գ������ӽڵ���뵽�б��У���ʱ�б��size��1
                if(node.right!=null)
                    treelist.add(node.right);

                intlist.add(node.val);
                //4����Ϊִ�����������������б��si
                //��˿��Լ���ѭ����һ���ڵ㣬ֱ��ѭ�������нڵ�
            }
            return intlist;
        }

        public static void main(String[] args) {
            TreeNode list = new TreeNode(8);
            list.left = new TreeNode(6);
            list.right = new TreeNode(10);
            list.left.left = new TreeNode(5);
            list.left.right =new TreeNode(7);
            list.right.left = new TreeNode(9);
            list.right.right = new TreeNode(11);
            ArrayList<Integer> res = Solution.PrintFromTopToBottom(list);
            for(int s:res){
                System.out.print(s+" ");
            }
        }
    }
}
