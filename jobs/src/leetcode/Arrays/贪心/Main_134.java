package leetcode.Arrays.贪心;
//执行用时 :1 ms, 在所有 Java 提交中击败了98.73%的用户
//内存消耗 :38.2 MB, 在所有 Java 提交中击败了42.97%的用户
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
