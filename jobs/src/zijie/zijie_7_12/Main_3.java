package zijie.zijie_7_12;

import java.util.Scanner;

/**
 *
 ����Ŀ����
    СW���������СQ�����⣬�����Ǻû��ѣ�СQ˵�����ͦ�򵥵ġ�����СW��û����������СWҲ��Ҫ���ӵģ����ܰ������?������СQ֪��Ŷ������������:
 ��һ��������n,�ҳ���С��������x������y^2= n +x^2������y����
 ��������:
        һ������ T(0<T<1000)������T�У�ÿ��һ������n (1<=n<= 10^9)
 �������:
        ����ÿ��n���x,���x���������-1
 */

public class Main_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result[]=test(nums);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }

    public static int[] test(int nums[]){
        int length=nums.length;
        int res[]=new int[length];
        for(int i=0;i<nums.length;i++){
            res[i]=solve(nums[i]);
        }
        return res;
    }

    public static int solve(int n ){
        //<<���з�������λ�����������Ķ�������������ָ��λ������λ��0����
        // ������߰�x����Ϊint�������
        int x = (1<<30);
        // i��������̽y-x��
        //��Ϊy^2-x^2=n,(y-x)^2-(y^2-x^2)=2*x^2-2*x*y<0,���ԣ�y-x��^2<n
        for(int i=1;i*i<=n;i++){
            if(n%i!=0) continue;
            //i&1�ж��ǲ�������,y^2-x^2=(x+y)*(y-x)����ͬ����ͬż����
            if( (i&1) == ( (n/i)&1 ) ){
                //   n/i-i=x  (n/i-i)=x,
                //  (n/i-i)/2>0
                if((n/i-i)/2>0 && (n/i-i)/2<x)
                    //�õ�y
                    x=(n/i-i)/2;
            }
        }
        if( x<(1<<30) )
            return x;
        else
            return -1;
    }
}