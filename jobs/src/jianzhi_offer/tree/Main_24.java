package jianzhi_offer.tree;

import java.util.ArrayList;

/**
 * ����һ�Ŷ������ĸ��ڵ��һ����������ӡ���������н��ֵ�ĺ�Ϊ��������������·����
 * ·������Ϊ�����ĸ���㿪ʼ����һֱ��Ҷ����������Ľ���γ�һ��·����
 * (ע��: �ڷ���ֵ��list�У����鳤�ȴ�����鿿ǰ)
 */
public class Main_24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        //����һ������ΪArrayList<Integer>��list
        ArrayList<ArrayList<Integer>> pathlist=new ArrayList<ArrayList<Integer>>();
        //����һ��list,���ڴ�ű�����ֵ
        ArrayList<Integer> path=new ArrayList<Integer>();
        public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
            //�����Ϊ�գ��򷵻ؿյ�pathlist
            if(root==null)
                return pathlist;
            //��rootֵ����list
            path.add(root.val);
            //�����������������������Ŀ��ֵ=��ֵ���򷵻�path
            if(root.left==null&&root.right==null&&target==root.val)
            {
                pathlist.add(new ArrayList<Integer>(path));
            }
            //�����ʱ��ֵС��Ŀ��ֵ���Һ���������
            if(root.val<=target&&root.left!=null)
            {
                //��������������������Ϊ���������Ҵ�ʱ��target=target-��������rootֵ
                FindPath(root.left,target-root.val);
            }
            //�����ʱ��ֵС��Ŀ��ֵ���Һ���������
            if(root.val<=target&&root.right!=null)
            {
                //��������������������Ϊ���������Ҵ�ʱ��target=target-��������rootֵ
                FindPath(root.right,target-root.val);
            }
            //����·����ֵ�Ƿ������������ֵ����Ҫ���ˣ�
            //��ʹ��remove�����Ƴ�·���ϵ����һ���ڵ㡣
            path.remove(path.size()-1);
            return pathlist;
        }
    }
}
