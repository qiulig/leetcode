package ����;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author     ��
 * @date       ��2019/6/25 0025
 * @description:
 * �ο�@XiaKIsGod��c�汾��д��java�汾��
 * ˼·���Ǳ���ö�٣�
 * ������ǵ�ѡ�����ٵõ�k��Ʊ���������������
 * 1.�������ÿ�����ڵ���k�ĺ�ѡ�߶����Ʊ���������������ˣ���continue������ת2��
 * 2.��ʣ�µ�����û�б����������Ʊ�ۼ��������Ÿ���һ��һ��ȡ��ֱ����ѡ�ߵ�Ʊ���ڵ���k��
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // ������Ʊ
        int voteNum = in.nextInt();
        // ���ٸ���ѡ��
        int peopleNum = in.nextInt();
        // ÿ����ѡ�ߵ�Ʊ
        int[] voteNumOfPeople = new int[peopleNum];
        // �������ĳ����ѡ�ߵ�Ʊ���ĵ��ǹ�
        List<Integer>[] cost = new ArrayList[peopleNum];
        for (int i = 0; i < peopleNum; i++) {
            cost[i] = new ArrayList<>();
        }//        List<List<Integer>> cost = new ArrayList<>();
        // ���Ľ��
        long res = Integer.MAX_VALUE;
        // ��ÿ��Ʊ������cost��voteNumOfPeople
        for (int i = 0; i < voteNum; i++) {
            int peopleTemp = in.nextInt() - 1;
            int costTemp = in.nextInt();
            voteNumOfPeople[peopleTemp]++;
            cost[peopleTemp].add(costTemp);
        }
        // ÿ����ѡ�߰���������ǹ�����
        for (int i = 1; i < peopleNum; i++) {
            Collections.sort(cost[i]);
        }
        // ��ʼ����ö�� ���������i��Ʊ������ѡ
        for (int i = 1; i <= voteNum; i++) {
            long costNum = 0;
            List<Integer> costTempList = new ArrayList<>();
            // ��Ҫ����Ʊ
            int needVote = i - voteNumOfPeople[0];
            // ׼��ͳ��Ʊ����i��
            for (int j = 1; j < peopleNum; j++) {
                if (voteNumOfPeople[j] >= i) {
                    int temp = voteNumOfPeople[j] - i + 1;  //��Ҫ��Ʊ����
                    for (int k = 0; k < temp; k++) {
                        costTempList.add(cost[j].get(k));
                    }
                }
            }
            for (int j = 0; j < costTempList.size(); j++) {
                needVote--;
                costNum += costTempList.get(j);
            }
            // ������ͷ�ľ͹��ˣ���ֱ�ӷ���
            if (needVote <= 0) {
                res = Math.min(res, costNum);
                continue;
            }
            // �������iѡƱ�Ļ����У���ʣ�µ����м�����
            costTempList = new ArrayList<>();

            for (int j = 1; j < peopleNum; j++) {
                // ׼��ͳ��Ʊ����i��ʣ�µĲ���
                if (voteNumOfPeople[j] >= i) {
                    int temp = voteNumOfPeople[j] - i + 1;
                    for (int k = temp; k < cost[j].size(); k++) {
                        costTempList.add(cost[j].get(k));
                    }
                } else {
                    // Ʊ��û����i��
                    costTempList.addAll(cost[j]);
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
}
