package jianzhi_offer.Array;

/**
 * �����˵��˶���Χ
 * ������һ��m�к�n�еķ���һ�������˴�����0,0�ĸ��ӿ�ʼ�ƶ���
 * ÿһ��ֻ�������ң��ϣ����ĸ������ƶ�һ�񣬵��ǲ��ܽ�������������������λ֮�ʹ���k�ĸ��ӡ�
 * ���磬��kΪ18ʱ���������ܹ����뷽��35,37������Ϊ3+5+3+7 = 18�����ǣ������ܽ��뷽��35,38����
 * ��Ϊ3+5+3+8 = 19�����ʸû������ܹ��ﵽ���ٸ����ӣ�
 */
public class Main_66 {
    public int movingCount(int threshold, int rows, int cols)
    {
        if(rows<1||cols<1||threshold<0)
        {
            return 0;
        }
        boolean []visit=new boolean[rows*cols];
        return count(threshold,rows,cols,visit,0,0);
    }
    private static int count(int threshold, int rows, int cols,
    boolean[] visit, int row, int col) {
    int res=0;
    if(check(threshold,rows,cols,visit,row,col))
    {
        visit[row*cols+col]=true;
        res=1+count(threshold,rows,cols,visit,row,col+1)
                +count(threshold,rows,cols,visit,row,col-1)
                +count(threshold,rows,cols,visit,row+1,col)
                +count(threshold,rows,cols,visit,row-1,col);
    }
    return res;
    }
    private static boolean check(int threshold, int rows, int cols, boolean[] visit, int row, int col) {
    if (row >= 0 && row < rows && col >= 0 && col < cols
            && visit[row * cols + col] == false
            &&getNum(col) + getNum(row) <= threshold) {
        return true;
    }
    return false;
    }
    //��ȡλ��֮��
    private static int getNum(int num) {
    int sum = 0;
    while (num > 0) {
        sum += num % 10;
        num /= 10;
    }
    return sum;
    }
}

