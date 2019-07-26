package leetcode.tree;
//ִ����ʱ :1 ms, ������ Java �ύ�л�����90.07%���û�
// �ڴ����� :45.4 MB, ������ Java �ύ�л�����35.21%���û�
public class Main_222 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public static int countNodes(TreeNode root) {

        if(root==null){
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);
        return left+right +1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(18);
        System.out.println(countNodes(root));
    }
}
