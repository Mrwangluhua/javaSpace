package Day07;

import java.util.Scanner;

/*使用代码完成：键盘录入三个数据,求出最大值
* */
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三个需要比较的数：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Max = getMax(a,b,c);
        System.out.println("三个数最大的是:"+Max);
    }
    public static int getMax(int num1,int num2,int num3){
        int max  = 0;
        if(num1>=num2&&num1>=num3){
            return num1;
        }else if(num2>=num1&&num2>=num3){
            return  num2;
        }else {
            return num3;
        }
    }
}
