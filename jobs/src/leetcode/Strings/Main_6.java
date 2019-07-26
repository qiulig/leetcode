package leetcode.Strings;

public class Main_6 {
//    public static String convert(String s, int numRows) {
//       if(s.length()<=numRows){
//           return s;
//       }
//       StringBuilder sb = new StringBuilder();
//       for(int i = 0;i<s.length();i += (2*numRows-2)){
//           sb.append(s.charAt(i));
//       }
//       for(int i = 1;i<numRows;i++){
//           for(int j = i;j< s.length();j++){
//               if((j-i)%(2*numRows-2)==0||(j+i)%(2*numRows-2)==0)
//                    sb.append(s.charAt(j));
//           }
//       }
//
//    return sb.toString();
//    }
//    ���赱ǰ������r��������R��I(n)��ʾĳ�е�n����ĸ��ԭ�ַ����е�index��n��0��ʼ��
//    r=1,Rʱ��I(n+1) = I(n)+2(R-1)
//            1<r<Rʱ��
//    I(n+1) = I(n)+2(R-r) nΪż��ʱ��
//    I(n+1) = I(n)+2(r-1) nΪ����
    public static String convert(String s, int numRows) {

            if(s==null||s.length()==0||numRows==1||numRows>=s.length()) {
                return s;
            }
            StringBuilder sb = new StringBuilder();

            for(int i=1;i<s.length()+1;i+=2*(numRows-1)) {
                sb.append(s.charAt(i-1));
            }
            for(int i=2;i<numRows;i++) {
                boolean flag = true;
                for(int j=i;j<s.length()+1;j+=(flag)?2*(numRows-i):2*(i-1),flag=!flag) {
                    sb.append(s.charAt(j-1));
                }
            }
            for(int i=numRows;i<s.length()+1;i+=2*(numRows-1)) {
                sb.append(s.charAt(i-1));
            }
            return sb.toString();
        }
    public static void main(String[] args) {

        System.out.println(convert("LEETCODEISHIRING",3));
    }
}
