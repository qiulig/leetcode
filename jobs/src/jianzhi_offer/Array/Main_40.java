package jianzhi_offer.Array;

import java.util.ArrayList;

public class Main_40 {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> res = new ArrayList();
        for(int i = 0;i<array.length;i++){
            if(res.contains(array[i])){
                res.remove(Integer.valueOf(array[i]));

            }else{
                res.add(array[i]);
            }
        }
        num1[0] = res.get(0);
        num2[0] = res.get(1);
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,1,2,3,4,6};
        int num1[] = new int[1];
        int num2[] = new int[1];
        FindNumsAppearOnce(arr,num1,num2);
    }
}
