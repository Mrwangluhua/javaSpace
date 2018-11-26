package NKExercise;

public class Pvf {
    public static void main(String[] args) {
        try {
            show(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        } catch (Exception e) {
            System.out.print("E");
        }
    }

    public static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                if (array[i] % 2 == 0) {
                    throw new NullPointerException();
                } else {
                    System.out.println(i);
                }
            } finally {
                System.out.print("e");
            }
        }
    }
}