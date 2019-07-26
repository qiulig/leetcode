package jianzhi_offer.tree;

import java.util.Arrays;

/**
 * > ����һ���������飬�жϸ������ǲ���ĳ�����������ĺ�������Ľ��������������Yes,�������No��
 * �������������������������ֶ�������ͬ��
 * 2.����˼·
 */
public class Main_23 {
        public boolean VerifySquenceOfBST(int [] sequence) {
            if(sequence==null ||sequence.length<=0)
                return false;
            int len = sequence.length;
            int root = sequence[len-1];
            int index = 0;
            for(;index<len-1;index++){
                if(root<=sequence[index])
                    break;
            }
            for(int i = 0;i<index;i++){
                if(root<sequence[i])
                    return false;
            }
            int rightIndex = index;
            for(;rightIndex<=len-1;rightIndex++){
                if(root>sequence[rightIndex])
                    return false;
            }
            boolean leftflag = true;
            if(index>0){
                leftflag = VerifySquenceOfBST(Arrays.copyOfRange(sequence,0,index));
            }
            boolean rightflag = true;
            if(index<len-1){
                rightflag = VerifySquenceOfBST(Arrays.copyOfRange(sequence,index,len-1));
            }
        return leftflag && rightflag;
        }

}
