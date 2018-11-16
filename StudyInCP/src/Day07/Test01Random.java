package Day07;

import java.util.Random;

public class Test01Random {
    public static void main(String[] args) {
        Random r = new Random();
        while(true){
            int s = r.nextInt(101)+88;
            System.out.println(s);
            if(s == 88||s==188){
                System.out.println("成功"+s);
                break;
            }
        }
    }
}
