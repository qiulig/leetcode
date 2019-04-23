package Arrays;

/**��������Ϊ n ���������� nums������ n > 1������������� output ��
 * ���� output[i] ���� nums �г� nums[i] ֮�������Ԫ�صĳ˻���
 *ʾ��:
 *����: [1,2,3,4]
 *���: [24,12,8,6]
 *
 */
public class Main_238 {
    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        //�˲��൱�������ұߵ�����
        res[res.length-1] =1;
        for(int i =res.length-2;i>=0;i--){
            res[i] = res[i+1]*nums[i+1];
        }
        //�˲�Ϊ�������*res[i]�ý��
        int left = 1;
        for(int i = 0;i<res.length;i++){
            res[i] = left *res[i];
            left = left*nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int arr []= {1,2,3,4};
        int res[] = productExceptSelf(arr);
        for(int s:res){
            System.out.print(s+" ");
        }
    }

}
