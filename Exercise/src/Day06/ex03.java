package Day06;
/*
3、在main方法内按以下要求编写代码:
(1)打印1到100之内的整数，但数字中包含9的要跳过
(2)每行输出5个满足条件的数，之间用空格分隔
(3)如：1 2 3 4 5*/
public class ex03 {
    public static void main(String[] args){
        int count =0;
        for (int i = 1; i < 100; i++) {
            if((i/10)*10+9==i ||i/10==9){
                continue;
            }
            count++;
            System.out.print(i+"\t");
            if(count%5 ==0){
                System.out.println();
            }
        }
    }
}
