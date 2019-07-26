package leetcode.Arrays.����;
//ִ����ʱ :11 ms, ������ Java �ύ�л�����79.40%���û�
//�ڴ����� :45 MB, ������ Java �ύ�л�����75.30%���û�
public class Main_79 {
    public static boolean exist(char[][] board, String word) {
        int[][] isvisited = new int[board.length][board[0].length];
        for(int i = 0;i<board.length;i++){
            for(int j = 0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j] && backTrace(i,j,0,word,isvisited,board))
                    return true;
            }
        }
       return false;
    }

    private static boolean backTrace(int startRow, int startColumn, int index, String word, int[][] isvisited, char[][] board) {
        if(index == word.length())
            return true;
        if( startRow>=board.length || startRow<0 || startColumn>= board[0].length || startColumn<0
                ||isvisited[startRow][startColumn]==1
                ||board[startRow][startColumn]!=word.charAt(index)){
            return false;
        }
        isvisited[startRow][startColumn] = 1;
        if(backTrace(startRow+1,startColumn,index+1,word,isvisited,board)             //��
                ||backTrace(startRow-1,startColumn,index+1,word,isvisited,board)      //��
                ||backTrace(startRow,startColumn+1,index+1,word,isvisited,board)   //��
                ||backTrace(startRow,startColumn-1,index+1,word,isvisited,board))  //��
             {
                return true;
        }else{
            //����
            isvisited[startRow][startColumn] = 0;
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }


}
