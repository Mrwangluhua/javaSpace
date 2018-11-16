package Day07;

import java.util.ArrayList;

/*
 * 定义ArrayList集合对象，存储1-20的数字，遍历集合对象，
 * 把奇数和偶数分别存放在另外的两个集合中，然后遍历两个集合
 *
 * */
public class ex01Plas {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1 = getArray();
        ArrayList<Integer> jishu = new ArrayList<>();
        ArrayList<Integer> oushu = new ArrayList<>();
        for(int i = 0;i<list1.size();i++){
            if(list1.get(i)%2 == 0){
                oushu.add(list1.get(i));
            }else{
                jishu.add(list1.get(i));
            }
        }
        showArrayList(jishu);
        System.out.println();
        showArrayList(oushu);
    }

    private static void showArrayList(ArrayList<Integer> list) {
        for(int i = 0;i<list.size();i++){
            int num = list.get(i);
            System.out.print(num+"\t");
        }
    }

    public static ArrayList<Integer> getArray() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <20; i++) {
            list.add(i+1);
        }
        return list;
    }
    public static ArrayList<Integer> setNum(int num){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(num);
        return list;
    }

}
