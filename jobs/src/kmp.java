public class kmp {
    public int KMPSearch(String str, String pattern)
    {
        int strIndex = 0;
        int patternIndex = 0;
        int [] next = GetNext(pattern);
        while (strIndex < str.length() && patternIndex  < pattern.length())
        {
            //�����j = -1�����ߵ�ǰ�ַ�ƥ��ɹ�����S[i] == P[j]��������i++��j++
            if (patternIndex  == -1 || str.charAt(strIndex) == pattern.charAt(patternIndex ))
            {
                strIndex++;
                patternIndex ++;
            }
            else
            {
                //�����j != -1���ҵ�ǰ�ַ�ƥ��ʧ�ܣ���S[i] != P[j]�������� i ���䣬j = next[j]
                //next[j]��Ϊj����Ӧ��nextֵ
                patternIndex  = next[patternIndex ];
            }
        }
        if (patternIndex  == pattern.length())
            return strIndex - patternIndex ;
        else
            return -1;
    }
    //next[j] = k ��ʾp[j] ֮ǰ��ģʽ���Ӵ��У��г���Ϊk����ͬǰ׺�ͺ�׺��
    public static int[] GetNext(String pattern){
        int next[] =new int[ pattern.length()];
        next[0] = -1;
        int k = -1;  //ǰ׺�����������ʼ��
        int j = 0;  //��׺�����������ʼ��
        while (j<pattern.length()-1){
            //p[k]��ʾǰ׺��p[j]��ʾ��׺
            //��p[k] == p[j]����next[j + 1 ] = next [j] + 1 = k + 1��
            if(k == -1 || pattern.charAt(j) == pattern.charAt(k)){
                next[++j] = ++k;
            }else {
                //��������ݹ�ǰ׺����k = next[k]
                k = next[k];
            }
        }
        return next;
    }
}
