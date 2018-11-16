import java.util.Scanner;

public class Year_Mouth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始年份");
         int a = sc.nextInt();
        System.out.println("请输入终止年份");
         int b = sc.nextInt();
        System.out.println("请输入起始月份");
        int c = sc.nextInt();
        System.out.println("请输入终止月份");
        int d = sc.nextInt();
        showYear_Mouth(a,b,c,d);
    }
    public static void showYear_Mouth(int year1,int year2,int mouth1,int mouth2){
        for(int i = year1;i<=year2;i++){
            for (int j = mouth1; j <= mouth2; j++) {
                System.out.println("第"+i+"年，第"+j+"月");
            }
        }
    }
}
