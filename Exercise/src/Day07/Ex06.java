package Day07;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*模拟乐透号码。

- 随机生成10个号码，范围1-50，作为乐透号码。
- 键盘录入10个整数，不能重复。
- 录入的整数与乐透号码对比，统计猜中了几个。

*/
public class Ex06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int count =0;
        list = getNum();
        System.out.println("请输入你的大乐透号码：");
        for (int i = 0; i < 10; i++) {
            int youNum = sc.nextInt();
            list1.add(youNum);
        }
        for (int i = 0; i < list1.size(); i++) {
            if(list.contains(list1.get(i))){
                count++;
            }
        }
        System.out.println("您输入的号码为："+list1);
        System.out.println("大乐透号码为+"+list);
        System.out.println("您共猜中"+count+"个数字");

    }


    public static ArrayList<Integer> getNum(){
        ArrayList<Integer> list = new ArrayList<>();
        Random ra = new Random();
        for (int i = 0; i < 10; i++) {
            int num =(ra.nextInt(50)+1);
            list.add(num);
        }
        return list;
    }
}
