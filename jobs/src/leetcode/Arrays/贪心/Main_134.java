package leetcode.Arrays.̰��;
//ִ����ʱ :1 ms, ������ Java �ύ�л�����98.73%���û�
//�ڴ����� :38.2 MB, ������ Java �ύ�л�����42.97%���û�
public class Main_134 {
    public static void main(String[] args) {

    }
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int curGas = 0;
        int startIndex = 0;
        for(int i = 0;i<gas.length;i++){
            totalGas += gas[i]-cost[i];
            curGas += gas[i] - cost[i];
            if(curGas < 0){
                curGas = 0;
                startIndex = i+1;
            }
        }

        return totalGas >= 0?startIndex:-1;

    }
}
