package leetcode.Arrays;

public class Main_10 {
        public static boolean isMatch(String str, String pattern) {
            if (str == null || pattern == null)
                return false;

            return matchCore(str.toCharArray(), 0, pattern.toCharArray(), 0);
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
        //���˸��Ķ�̬�滮�Ĵ�
        public static boolean isMatch2(String s, String p) {
            if (s == null || p == null) {
                return false;
            }
            boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
            //i= 0��j= 0��ʾstr��patternΪ�մ���ƥ��ɹ���true
            dp[0][0] = true;
            //strΪ�մ���pattern��Ϊ�մ������
            for (int i = 0; i < p.length(); i++) {
                //ǰһ��Ϊtrue��һ��Ϊ*��*ƥ��0����������һ��Ϊtrue
                if (p.charAt(i) == '*' && dp[0][i - 1]) {
                    dp[0][i + 1] = true;
                }
            }
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < p.length(); j++) {
                    //��ǰ��ĸƥ�䣬�ַ�str��pattern�����ƶ�һλ
                    if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
                        dp[i + 1][j + 1] = dp[i][j];
                    }
                    //��һ���ַ���*
                    if (p.charAt(j) == '*') {
                        //str��pattern��ƥ��
                        if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                            //str���䣬pattern���ƶ���λ
                            dp[i + 1][j + 1] = dp[i + 1][j - 1];
                        } else {
                            //ƥ��0�Σ�str������pattern����2λ��ƥ��һ�Σ�str�ƶ�һλ��pattern�ƶ�2λ��ƥ���Σ�str�ƶ�1�Σ�pattern����
                            dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i + 1][j - 1] || dp[i][j + 1]);
                        }
                    }
                }

            }
            return dp[s.length()][p.length()];
        }


    public static void main(String[] args) {
        System.out.println(isMatch2("ab","a*b"));
    }
}
