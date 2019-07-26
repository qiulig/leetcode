package leetcode.Arrays;

import java.util.HashMap;

/**
 * ���� n ���Ǹ�������ʾÿ�����Ϊ 1 �����ӵĸ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��
 */
public class Main_42 {
    //ת����ÿ��λ�����µ�ˮ�����ܺ�
    public static int trap1(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int value = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            int leftMax = 0;
            int rightMax = 0;
            for (int l = 0; l < i; l++) {
                leftMax = Math.max(arr[l], leftMax);
            }
            for (int r = i + 1; r < arr.length; r++) {
                rightMax = Math.max(arr[r], rightMax);
            }
            value += Math.max(0, Math.min(leftMax, rightMax) - arr[i]);
        }
        return value;
    }

    //˼·2�����ν���ÿ��λ�õ�ˮ����max_left��max_right�Ǳ���ֵС�����ıߡ������м们����
    public static int trap2(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        HashMap map = new HashMap<>();
        int n = arr.length - 2;
        int[] leftMaxs = new int[n];
        leftMaxs[0] = arr[0];//��ָ���ʼ��Ϊ��һ����
        //����ߵ�max
        for (int i = 1; i < n; i++) {
            leftMaxs[i] = Math.max(leftMaxs[i - 1], arr[i]);
        }
        int[] rightMaxs = new int[n];
        rightMaxs[n - 1] = arr[n + 1];//��ָ���ʼ��Ϊ�������һ����
//���ұߵ�max
        for (int i = n - 2; i >= 0; i--) {
            rightMaxs[i] = Math.max(rightMaxs[i + 1], arr[i + 2]);
        }
        int value = 0;
        for (int i = 1; i <= n; i++) {
            value += Math.max(0, Math.min(leftMaxs[i - 1], rightMaxs[i - 1]) - arr[i]);
        }
        return value;
    }

    //˼·3������һ��ָ��
    public static int trap3(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int n = arr.length - 2;
        int[] rightMaxs = new int[n];
        rightMaxs[n - 1] = arr[n + 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMaxs[i] = Math.max(rightMaxs[i + 1], arr[i + 2]);
        }
        int leftMax = arr[0];
        int value = 0;
        for (int i = 1; i <= n; i++) {
            value += Math.max(0, Math.min(leftMax, rightMaxs[i - 1]) - arr[i]);
            leftMax = Math.max(leftMax, arr[i]);
        }
        return value;
    }
    //˼·4��
    public static int trap4(int[] arr) {
        if (arr == null || arr.length < 3) {
            return 0;
        }
        int value = 0;
        int leftMax = arr[0];
        int rightMax = arr[arr.length - 1];
        int l = 1;//�ӵڶ����鿴�Ƿ�����ˮ
        int r = arr.length - 2;////�ӵ����ڶ����鿴�Ƿ�����ˮ
        while (l <= r) {
            if (leftMax <= rightMax) {
                value += Math.max(0, leftMax - arr[l]);
                leftMax = Math.max(leftMax, arr[l++]);
            } else {
                value += Math.max(0, rightMax - arr[r]);
                rightMax = Math.max(rightMax, arr[r--]);
            }
        }
        return value;
    }
    public static  int trap(int[] height) {
        if(height==null||height.length<3)
            return 0;
        int res = 0;
        int leftMax = height[0];
        int RightMax = height[height.length-1];
        int left = 1;
        int right = height.length-2;
        while(left<=right){
            if(leftMax<RightMax){
                res += Math.max(0,leftMax-height[left]);
                leftMax = Math.max(leftMax,height[left]);
                left++;
            }else{
                res += Math.max(0,RightMax-height[right]);
                RightMax = Math.max(RightMax,height[right]);
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println( trap(arr));
    }
}
