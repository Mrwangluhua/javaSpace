package Day07;

import java.text.DecimalFormat;
import java.util.Random;

/*
* 双色球投注去分为红色球号码去和蓝色球号码区，
* 红色球的号码范围是01-33
* 蓝色球的号码范围是01-16
* 双色球每期从33个红球中开出6个号码，
* 从16个蓝球中开出1个号码作为中奖号码，
* 双色球玩法即是竞猜开奖号码的6个红球号码和一个蓝球号码，顺序不限。
* */
public class ex01PlasP {
    public static void main(String[] args) {
        String[] array = getBall();
        showArray(array);
        System.out.println();
        showResult(array);
    }

    public static void showArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }

    public static void showResult(String[] array) {
        System.out.println("红球是:");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+"\t");
        }
        System.out.println();
        System.out.println("蓝色球是:");
        System.out.println(array[array.length-1]);
    }

    public static String[] getBall() {
        String[] array = new String[7];
        DecimalFormat df = new DecimalFormat("00");
        Random ra = new Random();
        for(int i =0;i<6;i++){
            int c = ra.nextInt(33)+1;
            array[i] = df.format(c);
        }
        int blue = ra.nextInt(16)+1;
        array[6] = df.format(blue);
        return array;
    }
}
