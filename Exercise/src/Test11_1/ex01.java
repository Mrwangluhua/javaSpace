package Test11_1;

public class ex01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int left = 0, right = arr.length-1;
        while (left < right) {
            while (left < right && arr[right] %2 == 0) {
                --right;
            }
            while (left < right && arr[left] %2 != 0) {
                ++left;
            }

            if (left < right) {
                arr[left]=arr[left]+arr[right];
                arr[right] = arr[left]-arr[right];
                arr[left] = arr[left]-arr[right];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }

    }
}
