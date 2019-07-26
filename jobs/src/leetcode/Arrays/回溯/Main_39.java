package leetcode.Arrays.����;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
    ����һ�����ظ�Ԫ�ص����� candidates ��һ��Ŀ���� target ���ҳ� candidates �����п���ʹ���ֺ�Ϊ target ����ϡ�
    candidates �е����ֿ����������ظ���ѡȡ��
 */
//ִ����ʱ :3 ms, ������ Java �ύ�л�����99.84%���û�
//�ڴ����� :37.4 MB, ������ Java �ύ�л�����96.85%���û�
public class Main_39 {
        public static List<List<Integer>> combinationSum(int[] candidates, int target) {
            //��Ž��
            List<List<Integer>> res = new ArrayList<>();
            //����
            Arrays.sort(candidates);
            //�ӵ�һ������ʼ�ݹ�
            calculate(candidates,target,0,new ArrayList<>(),res);

            return res;
        }
    public static void calculate(int[] candidates,int target,int start,ArrayList<Integer> tmpList,List<List<Integer>> result) {
        //����
        if (target < 0) {
            return;
        }
        //��������
        else if (target == 0) {
            result.add(new ArrayList<>(tmpList));
            return;
        } else {
            for (int i = start; i < candidates.length && target >= candidates[i]; i++) {
                //����
                tmpList.add(candidates[i]);
                //�ݹ�
                calculate( candidates, target - candidates[i], i, tmpList,result);
                //������õ���һ�ν����list
                tmpList.remove(tmpList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] candidates= {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates,target));
    }
}

