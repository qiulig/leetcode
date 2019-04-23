package Arrays;

/**
 * ���� n ���Ǹ�������ʾÿ�����Ϊ 1 �����ӵĸ߶�ͼ�����㰴�����е����ӣ�����֮���ܽӶ�����ˮ��
 */
public class Main_42 {
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
