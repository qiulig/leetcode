package huawei;
import java.util.Scanner;
import java.util.Stack;
public class Main_3 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        String str = sr.nextLine();
        solution(str);
    }

    public static void solution(String str) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> operStack = new Stack<>();
        int mark = 0;
        int paramOne = 0;
        int paramTwo = 0;
        for(int i = 0;i<str.length();i++){
            char chas = str.charAt(i);
            if(chas == '('){
                //��ȡ����λ
                operStack.push(str.substring(i+1,i+4));
                //����Ϊ�ո������λ��
                i = i + 4;
                //����λ���һ�����ֵ���������
                mark = i+1;
            }else if(chas == ')'){
                if(mark < i){
                    //�������ֵĽ�ȡ
                    numStack.push(Integer.valueOf(str.substring(mark,i)));
                    i++;
                    mark = i+1;
                }
                //�õ�һ�Σ����Ķ�Ӧ���ͽ���һ�μ���
                paramOne = numStack.pop();
                paramTwo = numStack.pop();
                calc(numStack,operStack,paramOne,paramTwo);
            }else{
                //�ո�λ�����ֽ�������
                if(chas == ' '){
                    if(mark < i ){
                        numStack.push(Integer.valueOf(str.substring(mark,i)));
                        //��һ�����ֵ�����Ϊ�ո����һλ����mark = i+1;
                        mark = i + 1;
                    }
                }
            }
        }
        //�������û������ģ��ͽ����ٴμ���
        while (!operStack.isEmpty()){
            paramTwo = numStack.pop();
            paramOne = numStack.pop();
            calc(numStack,operStack,paramOne,paramTwo);
        }
    }

    private static void calc(Stack<Integer> numStack, Stack<String> operStack, int paramOne, int paramTwo) {
        switch(operStack.pop()){
            case "add":
                numStack.push(paramOne + paramTwo);
                break;
            case "sub":
                numStack.push(paramOne - paramTwo);
                break;
            case "mul":
                numStack.push(paramOne * paramTwo);
                break;
            case "div":
                if(paramTwo == 0)
                    System.out.println("error");
                else
                    numStack.push(paramOne / paramTwo);
                break;
        }
    }
}
