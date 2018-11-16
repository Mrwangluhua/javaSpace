public class exercise {
    public static void main(String[] args) {
        int[] a = {1, 2,3, 4, 5, 6, 7, 8};
        swap(a,a[0], a[3]);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }
    }

    private static void swap(int[]arr ,int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}