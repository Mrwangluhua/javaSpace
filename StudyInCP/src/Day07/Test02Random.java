package Day07;

import java.util.Random;
import java.util.Scanner;

public class Test02Random {
    public static void main(String[] args) {
        int count = 10;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int test = r.nextInt(101);
        while(count>0) {
            count--;
            if(count==0){
                System.out.println("没次数了");
            }
            System.out.println("请输入你要猜的数字：");
            int a = sc.nextInt();
            if(a>test){
                System.out.println("大了,还剩下"+count+"次");
            }else if(a<test){
                System.out.println("小了,还剩下"+count+"次");
            }else {
                System.out.println("恭喜你猜对了,总共猜了"+count+"次");
            }
        }
    }
}
