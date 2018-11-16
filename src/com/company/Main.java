package com.company;

import java.util.Scanner;
// (9.0/5)*摄氏度+32 摄氏度转华氏度
public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入要选择的选项：\"s-h(摄氏转华氏)；h-s(华氏转摄氏)\":");
            String a = sc.nextLine();
            switch (a) {
                case "s-h":
                    System.out.println("请输入摄氏温度:");
                    double w = sc.nextDouble();
                    double b = cover(w);
                    System.out.println("转换后的华氏温度为：" + b + "℉");
                    break;
                case "h-s":
                    System.out.println("请输入华氏温度:");
                    double m = sc.nextDouble();
                    double h = cover2(m);
                    System.out.println("转换后的摄氏温度为：" + h + "℃");
                    break;
                default:
                    break;
            }
        }
    }
    public static double cover(double a){//摄氏温度转华氏温度
        double s = (9.0/5)*a+32;
        return s;
    }
    public static double cover2(double b){//华氏度转摄氏度
        double h= (b-32)/(9.0/5);
        return h;
    }
}