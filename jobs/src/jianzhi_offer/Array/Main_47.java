package jianzhi_offer.Array;

/**
 * дһ������������������֮�ͣ�Ҫ���ں������ڲ���ʹ��+��-��*��/����������š�
 */
public class Main_47 {
    public static int Add(int num1,int num2) {
        int carry = 0;
        int sum = 0;
        do{
            //�����ͬΪ0��ͬΪ1 ,�õ��Ľ���൱�ڶ����Ƶ��������޽�λ��ӣ����Ϊ2�Ľ����0
            //��6��12����򣬼���0110^1100�� = 1010
            sum = num1 ^ num2;
            //num1&num2�õ���λ����Ҫ��λ������ǰ��λ>>1
            carry = (num1&num2)<<1;
            num1 = sum;
            num2 = carry;
        }while(num2!=0);  //ֱ���޽�λ����
        return num1;
    }

    public static void main(String[] args) {
        System.out.println( Add(6,12));
    }
}
