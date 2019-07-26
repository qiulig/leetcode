package jianzhi_offer.tree;

/**
 * 求二叉树的深度
 */
public class Main_38 {
     public class TreeNode {
         int val = 0;
         TreeNode left = null;
         TreeNode right = null;
     public TreeNode(int val) {
          this.val = val;
     }
     }
    public class Solution {
        public int TreeDepth(TreeNode root) {
                    //----递归求二叉树深度----
                    if(root == null){
                        return 0;
                    }
                    int left = TreeDepth(root.left);
                    int right = TreeDepth(root.right);
                    return (left>right)?(left+1):(right+1);
                }

    }
}
