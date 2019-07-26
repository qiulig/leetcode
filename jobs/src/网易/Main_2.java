package ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_2 {
    public static void main(String[] args) {
        Work works[] = {
                new Work(2,1,new int[]{5} ),
                new Work(3,1,new int[]{5}),
                new Work(4,1,new int[]{5}),
                new Work(5,1,new int[]{6}),
                new Work(5,1,new int[]{1})
        };
        solution(works,5,5);

    }
    public static void solution(Work works[],int voterNum,int candidateNum ){
        //���Ͷ1������
        int index = 0;
        //temp������ [Ͷ��˭index--ͶƱ����-- ��¸������] ��i�����ʾ��i+1λѡ��
        Work temp[] = new Work[candidateNum];
        //��ʼ��
        for(int i = 0;i<candidateNum;i++){
            temp[i] = new Work(i+1,0,new int[]{0});
        }
        //ͳ��Ʊ�� ��˭���˼�Ʊ
        for(int i = 0;i< candidateNum;i++){
            for(int j = 0;j<works.length;j++) {
                //�����ǰwork��index - 1 = i
                if(works[j].getIndex() - 1 == i){
                   temp[i] = new Work(i+1,temp[i].getNum()+1,temp[i].getSorce());

                }
            }

        }
        //�ǹ�����
        int numOf1 = temp[0].getNum();
        int res = 0;
        Arrays.sort(temp);
        for(int i = 1;i<=voterNum;i++){
            int costNum = 0;
            List<Integer> costTempList = new ArrayList<>();
            //��Ҫ����Ʊ
            int needVote = i - numOf1;
            //׼��ͳ��Ʊ��>=i��
            for(int k = 0;k<temp.length;k++){
                if(temp[k].getNum()>=numOf1){
                    int tem = temp[i].getNum() - i + 1;
                    for(int m = 0;m<tem;k++){
                        int [] nums = temp[k].getSorce();
                        costTempList.add(nums[m]);
                    }
                }
            }
            for(int j = 0;j<costTempList.size();j++){
                needVote--;
                costNum += costTempList.get(j);
            }
            if(needVote<=0){
                res = Math.min(res,costNum);
                continue;
            }
            // �������iѡƱ�Ļ����У���ʣ�µ����м�����
            costTempList = new ArrayList<>();

            for (int j = 1; j < candidateNum; j++) {
                // ׼��ͳ��Ʊ����i��ʣ�µĲ���
                if (temp[j].getNum() >= i) {
                    int tem = temp[j].getNum() - i + 1;
                    for (int k = tem; k < temp[j].getSorce().length; k++) {
                        int[] nums = temp[k].getSorce();
                        costTempList.add(nums[k]);
                    }
                } else {
                    // Ʊ��û����i��
                    int nums[] = temp[j].getSorce();
//                    costTempList.addAll(Arrays.asList(nums));
                }
            }
            Collections.sort(costTempList);
            // Ʊ������������
            for (int j = 0; j < costTempList.size(); j++) {
                needVote--;
                costNum += costTempList.get(j);
                if (needVote <= 0) {
                    res = Math.min(costNum, res);
                    break;
                }
            }
        }
        System.out.println(res);
    }
    static class Work {
        int index;
        int num;
        int[] sorce;

        public Work(int index, int num, int[] sorce) {
            this.index = index;
            this.num = num;
            this.sorce = sorce;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public int getIndex() {
            return index;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int[] getSorce() {
            return sorce;
        }
    }
}

