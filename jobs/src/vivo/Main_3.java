package vivo;

import com.sun.applet2.AppletParameters;

import java.util.*;

/**
 *��Ʒ�ɹ���ÿ����Ʒ���ܻ�ӭ�̶Ȳ�һ�����ָ����ܽ���Լ�����Ʒ�ĵ��ۺ��ȶ�ֵ����ÿ����Ʒֻ�ɹ�һ������ι������ʹ������Ʒ���ȶ�ֵ���
 * ��һ����������������ʾ�ܽ��
 * �ڶ�����һ������Ϊn�����������飬��ʾ��Ʒ����
 * ��������һ������Ϊn�����������飬��ʾ��Ӧ��Ʒ�ȶ�ֵ
 * �����
 * ������ȶ�ֵ
 * ����
 * ���룺
 * * 1000
 * * 200 600 100 180 300 450
 * * 6   10   3   4   5   8
 * �����
 * * 21
 *
 */
public class Main_3 {
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

        //vivo��
        solution(total,weight,value);
    }
    //���1����i�����Ž�ȥ�����ü�ֵf[v]
    //���2����i���Ž�ȥ�����ü�ֵ[v-c[i]]+w[i]
    //״̬ת�Ʒ��̣�f[v] = max(f[v],f[v-w[i]]+c[i])
    //weight��ʾÿ����Ʒ��������value����ÿ����Ʒ�ļ�ֵ��total ��ʾ������Num��ʾ��Ʒ������
    // �� f[v]��ʾ����������v���������ֵ��
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
    //vivo���������
    //arrA��������weight[]��arrB�����ֵvalue[]
    public static void solution(int total,int []arrA,int []arrB){
        int [] f = new int[total+1];
        System.out.println(ZeroPackage(arrA,arrB,f,arrA.length,total));
    }

    private static int ZeroPackage(int[] weight, int[] value, int[] f, int Num, int total) {
        for(int i = 0;i<Num ; i++){
            for(int v = total;v>=weight[i];v--){
                f[v] = Math.max(f[v],f[v-weight[i]]+value[i]);
            }
        }
        return f[total];
    }

}
