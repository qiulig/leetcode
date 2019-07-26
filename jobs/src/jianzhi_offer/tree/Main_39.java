package jianzhi_offer.tree;

/**
 * 平衡二叉树
 */
public class Main_39 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    //平衡二叉树是一棵空树或它的左右两个子树的高度差的绝对值不超过1
//并且左右两个子树都是一棵平衡二叉树。
    public static class Solution {
        public static  boolean IsBalanced_Solution(TreeNode root) {
            if(root==null){
                return true;
            }
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);
            int diff = left - right;
            if(diff>1||diff<-1){
                return false;
            }
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        }
        public static  int treeDepth(TreeNode root) {
            //----递归求二叉树深度----
            if(root == null){
                return 0;
            }
            int left = treeDepth(root.left);
            int right = treeDepth(root.right);

            return (left>right)?(left+1):(right+1);
        }

        public static void main(String[] args) {
            TreeNode list = new TreeNode(8);
            list.left = new TreeNode(6);
            list.right = new TreeNode(10);
            list.left.left = new TreeNode(5);
            list.left.right =new TreeNode(7);
            list.right.left = new TreeNode(9);
            list.right.right = new TreeNode(11);
            IsBalanced_Solution(list);
        }
    }
}
