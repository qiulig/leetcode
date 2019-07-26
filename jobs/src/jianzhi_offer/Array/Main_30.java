package jianzhi_offer.Array;

/**
 * HZż������Щרҵ������������Щ�Ǽ����רҵ��ͬѧ����������鿪����,���ַ�����:�ڹ��ϵ�һάģʽʶ����,������Ҫ��������������������,������ȫΪ������ʱ��,����ܺý��������,��������а�������,�Ƿ�Ӧ�ð���ĳ������,�������Աߵ��������ֲ����أ�����:{6,-3,-2,7,-15,1,2,2},����������������Ϊ8(�ӵ�0����ʼ,����3��Ϊֹ)��
 * ��һ�����飬��������������������еĺͣ���᲻�ᱻ������ס��(
 * �������ĳ���������1)
 */
public class Main_30 {
    public class Solution {
        public int FindGreatestSumOfSubArray(int[] array) {
            if(array == null || array.length == 0)
                return 0;
            int res = Integer.MIN_VALUE;
            int cur = 0;
            for(int i = 0;i<array.length;i++){
                cur += array[i];
                res = Math.max(res,cur);
                cur = cur < 0 ? 0 : cur;
            }
            return res;
        }
    }
}
