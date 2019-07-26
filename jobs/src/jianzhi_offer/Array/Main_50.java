package jianzhi_offer.Array;

public class Main_50 {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length == 0)
            return true;
        int res[] = new int [length];
        boolean flag = false;
        for(int i = 0;i<length;i++){
           res[numbers[i]]++;
            //���ظ�����
            if(res[numbers[i]]>1){
                duplication[0] = numbers[i];
                flag = true;
                break;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        int [] arr = {2,4,2,1,4};
        int[] dup = new int [1];
        duplicate(arr,arr.length,dup);
    }
}
