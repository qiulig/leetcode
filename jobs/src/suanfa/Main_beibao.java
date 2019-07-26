package suanfa;

import java.util.TreeSet;

public class Main_beibao {
    //0-1����
    public static int ZeroOnePackage(int []weight,int []value,int []f,int Num,int total){
        for(int i = 0;i<Num;i++){
            for(int v = total;v>=weight[i];v--){ //ע��������
                f[v] = Math.max(f[v-weight[i]]+value[i],f[v]);
            }
        }
        return f[total];
    }
    //��ȫ����
    public static int ZeroMorePackage(int []weight,int []value,int []f,int Num,int total){
        for(int i = 0;i<Num;i++){
            for(int v = weight[i];v<=total;v++){ //ע��������
                f[v] = Math.max(f[v-weight[i]]+value[i],f[v]);
            }
        }
        return f[total];
    }
    //���ر�������
    public static int MorePackage(int []weight,int []value,int []f,int Num,int total,int eachNum[]){
        for(int i = 0;i<Num;i++) {
            for (int v = total; v >= 0; v--) { //ע��������
                for (int k = 0; k <= eachNum[i]; k++) {
                    if (v - k * weight[i] < 0) {
                        break;
                    }else{
                        f[v] = Math.max(f[v - k * weight[i]] + k * value[i], f[v]);
                    }
                }
            }
        }
        return f[total];
    }

    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(3);
        set.add(2);
        set.add(9);
        while (!set.isEmpty()){
            System.out.println(set.pollFirst());
        }
        int total = 1000;
        int []f = new int[total+1];
        int weight[] = {200 ,600, 100, 180, 300, 450};
        int value[] = {6  , 10,   3,   4,   5,   8};
        //��������ͬʱ���ԣ������
        //0-1����
//        System.out.println(ZeroOnePackage(weight,value,f,weight.length,total));
        //��ȫ����
//        System.out.println(ZeroMorePackage(weight,value,f,weight.length,total));
        //���ر���
        int eachNum[] = {2,3,2,1,3,5};
//        System.out.println(MorePackage(weight,value,f,weight.length,total,eachNum));

    }

}
