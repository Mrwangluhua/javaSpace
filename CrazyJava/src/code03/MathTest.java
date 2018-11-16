package code03;

/*
Java并没有提供其他更加复杂的运算，如果需要完成乘方开方等运算需要借助Java.lang.Math类的工具方法完成复杂的运算。
*/
public class MathTest {
    public static void main(String[] args){
        double a =2.0;
        double b = Math.pow(a,5);
        System.out.println(b);
    }
}
