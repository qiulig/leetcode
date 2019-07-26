package leetcode.tree;
//ִ����ʱ :2 ms, ������ Java �ύ�л�����96.50%���û�
//�ڴ����� :44.9 MB, ������ Java �ύ�л�����65.75%���û�
public class Main_538 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    static int num = 0;
    //����������Ϊ��С����Ҫ����ۼ����������������������ӱ�ɽڵ�ֵ���ɡ�
    public static TreeNode convertBST(TreeNode root) {
       if(root!=null)
       {
           //����������
           convertBST(root.right);
           //�ı�ֵ�������ۼӼ���
           root.val = root.val+num;
           //�洢��һ���ֵ
           num = root.val;
           //����������
           convertBST(root.left);

       }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        convertBST(root);

    }
}
