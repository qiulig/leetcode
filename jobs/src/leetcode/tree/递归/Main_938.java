package leetcode.tree.�ݹ�;
//ִ����ʱ :3 ms, ������ Java �ύ�л�����48.66%���û�
//�ڴ����� :53.1 MB, ������ Java �ύ�л�����32.11%���û�
public class Main_938 {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    static int num = 0;
    public static int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null)
            return 0;
       if(root!=null){
           rangeSumBST(root.left,L,R);
           if(root.val >=L && root.val<=R){
               num +=root.val;
           }
           rangeSumBST(root.right,L,R);
       }
       return num;
    }

    public static void main(String[] args) {
//        ���룺root = [10,5,15,3,7,null,18], L = 7, R = 15
//        �����32
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.left.right.right = new TreeNode(18);
        System.out.println(rangeSumBST(root,7,15));
    }
}
