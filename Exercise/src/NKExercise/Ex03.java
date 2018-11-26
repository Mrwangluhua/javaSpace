package NKExercise;

public class Ex03 {
    private int count;

    public static void main(String[] args) {
        Ex03 test =new Ex03(88);
        System.out.println(test.count);
    }
    Ex03(int a ){
        count+=a;
    }
}
