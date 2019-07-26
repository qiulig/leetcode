package suanfa;


//����������
public class Main_tanxin_lvxingshang {
    public static void main(String[] args) {
        String city[] = {"A","B","C","D","E","F","G","H","I","J"};
        int x[] = {2066,935,1270,1389,984,2253,949,87,3094,2706};
        int y[] = {2333,1304,200,700,2810,478,3025,2483,1883,3130};
        double distance[][] = Caldistance(x,y);
        solve(distance,city);
    }
    //�������
    public static double[][] Caldistance(int x[],int y[]){
        double [][] distance = new double[x.length][x.length];
        for(int i = 0;i<x.length;i++){
            for(int j = 0;j<x.length;j++){
                //ŷʽ����
                distance[i][j] = Math.sqrt((x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]));
            }
        }
        return distance;
    }
    public static void solve(double[][]distance,String []city){
        double sum = 0;
        //��¼���ʹ��ĳ���
        int visited[] = new int[distance.length];
        //��¼���η��ʵĳ��У��õ���С�ľ���
        String path[] = new String[distance.length];
        //����ӵ�һ������A��ʼ
        path[0] = "A";
        //���ʹ��ĵ��¼Ϊ1
        visited[0] = 1;
        //��ǰ���ڷ��ʵĵ�
        int k = 0;
        //��һ������һ������ΪIndexΪ1��B����
        int nextCityIndex = 1;
        //��ʼ����С�ľ���
        double mindistance = Double.MAX_VALUE;
        //��¼�Լ����ʹ����ٸ�������
        int count = 1;
        while(count<city.length){
            for(int i = 0;i<city.length;i++){
                //����õ�û������
                if(visited[i]==0){
                    //��� �����ڷ��ʵĵ�k����һ�������С���룬��Ϊ��һ��Ҫ�����ʵĳ���
                    if(distance[k][i]<mindistance){
                        mindistance  = distance[k][i];
                        //��ȡ��һ��Ҫ�����ʵĳ��е��±�����
                        nextCityIndex = i;
                    }
                }
            }
            //���η��ʵĵ����·��
            sum = sum + mindistance;
            //���õ�����һ��Ҫ���ʵĳ��м��뵽path��
            path[count++] = city[nextCityIndex];
            //�õ㱻���ʣ���Ϊ1
            visited[nextCityIndex] = 1;
            //�����ʵĳ������ĳ���õ���һ�����еĵ����������
            k = nextCityIndex;
            //�ٴγ�ʼ��
            mindistance = Double.MAX_VALUE;
        }
        //�ó����η��ʵĽ�������
        for(int i = 0;i<path.length;i++){
            System.out.print(path[i]+" ");
        }
    }
}
