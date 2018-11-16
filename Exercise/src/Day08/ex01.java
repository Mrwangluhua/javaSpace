package Day08;

import java.util.Scanner;

/*第一题：需求实现

- 反转键盘录入的字符串。
*/
public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        int str = sc.nextInt();
        //reverious()
        System.out.println(Math.abs(str));
    }
}
