package Day06;
/*1、统计并获取10-100之间(包含10和100)个位与十位都为奇数的数字，并将该数字打印到控制台上。*/
public class ex01 {
    public static void main(String[] args){
        showTime();
    }
    public static void showTime(){
        for (int i = 10; i < 100; i++) {
            if((i/10)%2==1 && (i%10)%2==1){
                System.out.print(i+"\t");
            }
        }
    }
}
