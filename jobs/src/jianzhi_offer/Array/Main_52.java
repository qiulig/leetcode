package jianzhi_offer.Array;

/**������ʽƥ��
 * ��ʵ��һ����������ƥ�����'.'��'*'��������ʽ��ģʽ�е��ַ�'.'��ʾ����һ���ַ���
 * ��'*'��ʾ��ǰ����ַ����Գ�������Σ�����0�Σ���
 * �ڱ����У�ƥ����ָ�ַ����������ַ�ƥ������ģʽ��
 * ���磬�ַ���"aaa"��ģʽ"a.a"��"ab*ac*a"ƥ�䣬������"aa.a"��"ab*a"����ƥ��
 */
public class Main_52 {
//    public static boolean match(char[] input, char[] pattern) {
//        String str1 = input.toString();
//        String str2 =  pattern.toString();
//        if (input == null || pattern == null) return false;
//            return matchCore(str1, 0, str2, 0);
//    }
//
//    private static boolean matchCore(String str,int strIndex,String pattern,int patternIndex){
//        if((str.length()==strIndex)&&(pattern.length()==patternIndex)){
//            //����1��input��pattern�������ַ���ĩβ
//            return true;
//        }
//        if((strIndex!=str.length())&&(pattern.length()==patternIndex)){
//             //����2���ַ���inputû�е�ĩβ��pattern����ĩβ
//            return false;
//     }
//     if((str.length()==strIndex)&&(pattern.length()!=patternIndex)){
//             //����3���ַ���input��ĩβ��pattern��û�е�ĩβ
//             return false;
//         }
//     // ���1��pattern�ĵڶ����ַ���*
//     if((patternIndex+1<pattern.length())&&(pattern.charAt(patternIndex+1)=='*')){//pattern�ڶ����ַ�Ϊ*
//             if((str.charAt(strIndex)==pattern.charAt(patternIndex))||(pattern.charAt(patternIndex)=='.')){
//                     //����ĸ��ƥ��
//                     return matchCore(str,strIndex+1,pattern,patternIndex+2) //*ƥ���
//                          ||matchCore(str,strIndex+1,pattern,patternIndex)    //*ƥ����
//                          ||matchCore(str,strIndex,pattern,patternIndex+2);   //*ƥ��0��
//                 }else{
//                     //����ĸ��ƥ�䣨��.���������ַ�����ƥ�䣩����ô��*��ֻ�ܴ���ƥ��0��
//                     return matchCore(str,strIndex,pattern,patternIndex+2);
//                 }
//         }
//     //���2��patttern�ڶ����ַ����ǡ�*��ʱ��
//     if((str.charAt(strIndex)==pattern.charAt(patternIndex))||(pattern.charAt(patternIndex)=='.')){
//             //pattern�ڶ�����ĸ����*��������ĸƥ��
//             return matchCore(str,strIndex+1,pattern,patternIndex+1);
//         }
//     return false;  //�������ȫ����ƥ��
// }
    public static boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null)
            return false;
        int strIndex = 0,patternIndex = 0;
        return matchCore(str, strIndex, pattern, patternIndex);
    }
    public static boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        //��Ч�Լ��飺str��β��pattern��β��ƥ��ɹ�
        if (strIndex == str.length && patternIndex == pattern.length) {
            return true;
        }
        //pattern�ȵ�β��ƥ��ʧ��
        if (strIndex != str.length && patternIndex == pattern.length) {
            return false;    }
        //ģʽ��2����*�����ַ�����1����ģʽ��1��ƥ��,��3��ƥ��ģʽ���粻ƥ�䣬ģʽ����2λ
        //   //�����ǰpattern����һ����*����û�г���pattern�ĳ���ʱ
        if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
            // //�����ǰ�ַ�str[index]��pattern[index]��ȣ����ߵ�ǰpatternΪ��.��
            if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
                return matchCore(str, strIndex, pattern, patternIndex + 2)//ģʽ����2����Ϊx*ƥ��0���ַ�(��ǰpattern[index+1]='*'��str[index]!=pattern[index]��
                        || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//��Ϊģʽƥ��1���ַ� (��ǰpattern[i+1]='*'��str[index]=pattern[index])
                        || matchCore(str, strIndex + 1, pattern, patternIndex);//*ƥ��1������ƥ��str�е���һ������ǰpattern[index]='.'��
            } else {
                //��ǰ�ַ�str[index]��pattern[index]�����&&��ǰpattern��Ϊ��.��
                return matchCore(str, strIndex, pattern, patternIndex + 2);
            }
        }
        //ģʽ��2������*�����ַ�����1����ģʽ��1��ƥ�䣬�򶼺���1λ������ֱ�ӷ���false
        //pattern[index]='.'�������strindex��pattern����1����ƥ��
        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
            return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        char str[] = {'a','.','a','a','b'};
        char pa[] = {'a','.','*','b'};
        match(str,pa);
        int a=5;
        int b= 5;
        int c = a>>2+b>>2;
        System.out.println(c);
    }


}
