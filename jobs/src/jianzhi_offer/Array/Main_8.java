package jianzhi_offer.Array;

/**
 * ��̨�ף�
 * һֻ����һ�ο�������1��̨�ף�Ҳ��������2����
 * �����������һ��n����̨���ܹ��ж������������Ⱥ����ͬ�㲻ͬ�Ľ������
 */
public class Main_8 {
    public class Solution {
        public int JumpFloor(int target) {
            if(target<=2)
            {
                return target;
            }
            int one_=1; //��һ����̨�׵ķ�����
            int two_=2; //�ڶ�����̨�׵ķ�����
            int finN=0;
            for(int i=3;i<=target;i++)
            {
                finN=one_+two_;
                one_=two_;
                two_=finN;
            }
            return finN;
        }
    }
}
