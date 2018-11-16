package Day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
* 集合工具类。
- 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引,如果集合中没有该元素返回-1。
- 定义replace方法，将某集合中的某元素，全部替换为新元素,替换完成后打印集合。
*/
public class Ex05 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int[] array ={76,65,43,23,56,78,76,87,88,76};
        list = getScoreList();
        Scanner sc = new Scanner(System.in);
        System.out.println(list);
        System.out.println("请输入需要查找的数字：");
        int target = sc.nextInt();
        int find = findIndex(list,target);
        System.out.println(find);
        for (int i = 0; i < 10; i++) {
            list2.add(array[i]);
        }
        System.out.println(list2);
        System.out.println("请输入将要替换的元素");
        int num  = sc.nextInt();
        System.out.println("请输替换后的元素");
        int targe = sc.nextInt();
        ArrayList<Integer> replaceArr = new ArrayList<>();
        replaceArr = replace(list2,num,targe);
        System.out.println(replaceArr);
    }
    public static ArrayList<Integer> getScoreList() {
        ArrayList<Integer> list = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            int score = ra.nextInt(101);
            list.add(score);
        }
        return list;
    }

    public static int findIndex(ArrayList<Integer> list,int target){
        int find = 0;
        for (int i = 0; i < list.size(); i++) {
            if(target == list.get(i)){
                find = i;
                break;
            }else{
                find = -1;
            }
        }
        return find;
    }
   public static ArrayList<Integer> replace(ArrayList<Integer> list,int num,int target){
       ArrayList<Integer> tarList = new ArrayList<>();
       tarList = list;
       for (int i = 0; i < list.size(); i++) {
           if(num == list.get(i)){
               tarList.set(i,target);
           }
       }
       return tarList;
    }
}
