package NKExercise;

public class Ex02 {
    public static void main(String[] args) {
        Test mv = new Test();
        TreadExample t1 = new TreadExample(mv);
        TreadExample t2 = new TreadExample(mv);
        TreadExample t3 = new TreadExample(mv);
        t1.start();
        t2.start();
        t3.start();
    }
}
class Test{
    private int data;
    int result;
    public void m(){
        result+=2;
        data+=2;
        System.out.print(result+" "+data);
    }
}
class TreadExample extends Thread{
    private Test mv;
    public TreadExample(Test mv){
        this.mv = mv;
    }
    public void run(){
        synchronized (mv){
            mv.m();
        }
    }
}
