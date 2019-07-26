package jianzhi_offer.tree;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.regex.Pattern;

/**
 * ���ϵ��°����ӡ��������ͬһ����������������ÿһ�����һ�С�
 */
public class Main_60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
public class Solution {
   ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       if(pRoot == null) {
           return res;
       }
       Queue<TreeNode> queue = new LinkedList<>();
       //��������
       queue.add(pRoot);
       while (!queue.isEmpty()){
           //ÿ����һ�Σ����½�һ��tmp
           ArrayList<Integer>  tmp = new ArrayList<>();
           int count = queue.size();
           for(int i = 0;i<count;i++){
               if(queue.peek().left!=null){
                   //��������
                   queue.add(queue.peek().left);
               }
               if(queue.peek().right!=null){
                   //�����ҽ��
                   queue.add(queue.peek().right);
               }
               //ɾ��������queue�е�ͷԪ�أ�ɾ��������һ����Ԫ�أ�
               tmp.add(queue.poll().val);
           }
           //��һ������ҽ�����res
           res.add(tmp);
       }
       return res;
    }
}

}
