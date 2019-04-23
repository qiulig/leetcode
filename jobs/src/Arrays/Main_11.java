package Arrays;

/**
 * ���� n ���Ǹ����� a1��a2��...��an��ÿ�������������е�һ���� (i, ai) ���������ڻ� n ����ֱ�ߣ�
 * ��ֱ�� i �������˵�ֱ�Ϊ (i, ai) �� (i, 0)���ҳ����е������ߣ�ʹ�������� x �Ṳͬ���ɵ�����������������ˮ��
 * ˵�����㲻����б�������� n ��ֵ����Ϊ 2��
 */
public class Main_11 {
    public static int maxArea(int[] height) {
        int res = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            res = Math.max(res,(right-left)*Math.min(height[left],height[right]));
            //�����߶Ƚ�С��
            if ((height[left] > height[right])) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
