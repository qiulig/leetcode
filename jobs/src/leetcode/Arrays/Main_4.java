package leetcode.Arrays;

import java.util.PriorityQueue;

/**
 * ����������СΪ m �� n ���������� nums1 �� nums2
 �����ҳ������������������λ��������Ҫ���㷨��ʱ�临�Ӷ�Ϊ O(log(m + n))��
 ����Լ��� nums1 �� nums2 ����ͬʱΪ�ա�
 ʾ�� 1:
 nums1 = [1, 3]
 nums2 = [2]
 ����λ���� 2.0
 ʾ�� 2:
 nums1 = [1, 2]
 nums2 = [3, 4]

 ����λ���� (2 + 3)/2 = 2.5
 */
public class Main_4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1Length = nums1.length;
        int n2Length = nums2.length;
        int totalLength = n1Length + n2Length;
        int arrayIndex = 0;
        int maxArrayIndex = totalLength / 2;
        int n1Index = 0;
        int n2Index = 0;
        int last1 = 0;
        int last2 = 0;
        while (arrayIndex <= maxArrayIndex) {
            last2 = last1;
            if (n1Index >= n1Length) {
                last1 = nums2[n2Index++];
            } else if (n2Index >= n2Length) {
                last1 = nums1[n1Index++];
            } else {
                if (nums1[n1Index] <= nums2[n2Index]) {
                    last1 = nums1[n1Index++];
                } else {
                    last1 = nums2[n2Index++];
                }
            }
            arrayIndex++;
        }
        if (totalLength % 2 == 0) {
            return (last1 + last2) / 2.0;
        } else {
            return last1;
        }
    }
    public static void main(String[] args) {
        int a[] = {};
        int b[] = {3,5};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
