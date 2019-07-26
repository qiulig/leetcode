package suanfa;

import java.util.*;

//���ϸ���
//����������±����Ҫ���ѵĹ㲥̨���Լ��㲥̨�źſ��Ը��ǵĵ����� ���ѡ�����ٵĹ㲥̨�������еĵ��������Խ��յ��źš�
//        �㲥̨	���ǵ���
//        K1	     ID,NV,UT
//        K2	     WA,ID,MT
//        K3	     OR,NV,CA
//        K4	     NV,UT
//        K5	     CA,AZ
//
public class Main_tanxin_jihefugai {
    public static void main(String[] args) {
        HashMap<String,HashSet<String>> broadcasts = new HashMap<>();
        broadcasts.put("K1", new HashSet(Arrays.asList(new String[] {"ID","NV","UT"})));
        broadcasts.put("K2", new HashSet(Arrays.asList(new String[] {"WA","ID","MT"})));
        broadcasts.put("K3", new HashSet(Arrays.asList(new String[] {"OR","NV","CA"})));
        broadcasts.put("K4", new HashSet(Arrays.asList(new String[] {"NV","UT"})));
        broadcasts.put("K5", new HashSet(Arrays.asList(new String[] {"CA","AZ"})));

        //��Ҫ���ǵ�ȫ������
        HashSet<String> allAreas = new HashSet<>(Arrays.asList(new String[] {"ID","NV","UT","WA","MT","OR","CA","AZ"}));
        //��ѡ��Ĺ㲥̨�б�
        List<String> lists = new ArrayList<>();
        //(1) ѡ��һ���㲥̨���������������δ���ǵĵ����������һЩ�Ѹ��ǵĵ���Ҳû��ϵ
        // (2) �ظ���һ��ֱ�����Ը�����ȫ���ĵ���
        HashSet<String> tempSet = new HashSet<>();
        String maxKey = null;
        while(allAreas.size()!=0){
            maxKey = null;
            //һ����ѡ����֮ǰδ���ǵģ��������ĵ�̨
            for(String key:broadcasts.keySet()){
                tempSet.clear();
                HashSet<String> areas = broadcasts.get(key);
                tempSet.addAll(areas);
                //���2�����ϵĽ������õ��Ľ����ĵ�̨����tempSet����
                tempSet.retainAll(allAreas);
                //����ü��ϰ����ĵ���������ԭ���ļ��϶�
                if (tempSet.size()>0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    //�õ�Ҫ����ĵ�̨key
                    maxKey = key;
                }

            }
            //�ҵ�δ���ǵ�̨���������Ǹ���̨
            if (maxKey != null) {
                lists.add(maxKey);
                //�����ǵ����Ƴ�allAreas
                allAreas.removeAll(broadcasts.get(maxKey));
            }
        }
        System.out.print("selects:" + lists);

    }
}
