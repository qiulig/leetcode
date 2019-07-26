package jianzhi_offer.tree;

/**
 * �����������л��ͷ����л�
 */
public class Main_61 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public int index = -1;
        //���ѵݹ���������Զ������������л�
        String Serialize(TreeNode root) {
            StringBuffer sb = new StringBuffer();
            if(root == null){
                sb.append("#,");
                return sb.toString();
            }
            //������������
            sb.append(root.val + ",");
            //������
            sb.append(Serialize(root.left));
            //������
            sb.append(Serialize(root.right));
            return sb.toString();
        }
        TreeNode Deserialize(String str) {
            //��������
            if(str==null||str.length()<=0)
                return null;
            //���ַ�������","���Ϊ����
            String[] strr = str.split(",");
            int len = strr.length;
            index++;
            if(index >= len){
                return null;
            }
            TreeNode node = null;
            //�����������#��ʾ�սڵ㣬���ٽ���������������null���������ĸ���㷵��
            if(!strr[index].equals("#")){
                node = new TreeNode(Integer.valueOf(strr[index]));
                //�ָ�������
                node.left = Deserialize(str);
                //�ָ�������
                node.right = Deserialize(str);
            }
            //������������ɣ����ظ��ڵ�
            return node;
        }
    }
}
