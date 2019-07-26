package vivo.L2019;

public class Main_3 {
    public static void main(String[] args) {
        String str = "abba";
        solution(str);
    }
    public static void solution(String str){
        char arr[] = str.toCharArray();
        //dp[i][j]����i~j���ַ����Ļ��ĳ���
        boolean [][]dp = new boolean[str.length()][str.length()];
        //��ʼ���Խ���
        for(int i = 0;i<str.length();i++){
            dp[i][i] = true;
        }
        //��ʼ�����ڵ������ַ��Ƿ�Ϊ����
        for(int i = 0;i<=arr.length-2;i++){
            dp[i][i+1] = str.charAt(i) == str.charAt(i+1)?true:false;
        }
        int max = 1;
        String res = "";
        for(int i = 0;i<arr.length;i++){
            for(int j = i+2;j<arr.length;j++){
                    //���˵�������Լ��м�����ǻ���
                    dp[i][j] = dp[i+1][j-1] && str.charAt(i) == str.charAt(j) ? true:false;
                if(dp[i][j] == true && j - i + 1>max){
                    max = j-i+1;
                    res = str.substring(i,j+1);
                }
            }
        }
        System.out.println(max);
        System.out.println(res);
    }
}
