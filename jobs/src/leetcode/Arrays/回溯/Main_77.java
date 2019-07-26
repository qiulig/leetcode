package leetcode.Arrays.����;
/**������������ n �� k������ 1 ... n �����п��ܵ� k ��������ϡ�

 ʾ��:

 ����: n = 4, k = 2
 ���:
 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 **/
import java.util.List;
import java.util.ArrayList;

//ִ����ʱ :40 ms, ������ Java �ύ�л�����52.77%���û�
//�ڴ����� :52.5 MB, ������ Java �ύ�л�����26.41%���û�
public class Main_77 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(k,n,1,new ArrayList(),res);
        return res;
    }
    public static void backtrack(int k,int n,int start,List<Integer> tmplist,List<List<Integer>> result){
        if(k == 0){
            result.add(new ArrayList<>(tmplist));
        }else {
            for (int i = start; i <= n; i++) {
                tmplist.add(i);
                //�ݹ�
                backtrack( k - 1, n, i+1,tmplist, result);
                tmplist.remove(tmplist.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        combine(4,2);
    }
}
