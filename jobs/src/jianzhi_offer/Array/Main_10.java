package jianzhi_offer.Array;

/**
 * ���ǿ�����2*1��С���κ��Ż�������ȥ���Ǹ���ľ��Ρ�
 * ������n��2*1��С�������ص��ظ���һ��2*n�Ĵ���Σ��ܹ��ж����ַ�����
 */
public class Main_10 {
    public class Solution {
        public int RectCover(int target) {
            if(target==0||target==1||target==2)
                return target;
            else
                return RectCover(target-1)+RectCover(target-2);

        }
    }

}
