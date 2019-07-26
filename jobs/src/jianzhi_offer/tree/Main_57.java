package jianzhi_offer.tree;

/**
 * ����һ�������������е�һ����㣬���ҳ��������˳�����һ����㲢�ҷ��ء�
 * ע�⣬���еĽ�㲻�����������ӽ�㣬ͬʱ����ָ�򸸽���ָ�롣
 */
public class Main_57 {
    public static class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public static class Solution {
        public TreeLinkNode GetNext(TreeLinkNode pNode)
        {
            if(pNode == null){
                return null;
            }
            //��ǰ���������������ô������һ�������������������������ӽ��
            if(pNode.right != null){
                pNode = pNode.right;
                while(pNode.left != null){
                    pNode = pNode.left;
                }
                return pNode;
            }
            // //// ��ǰ�����������������Ҫ�ҵ�һ���������������������Ľ��
            while(pNode.next != null){
                if(pNode.next.left== pNode){
                    return pNode.next;
                }
                pNode = pNode.next;
            }
            return null;
        }
    }

        public static void main(String[] args) {
        }
    }