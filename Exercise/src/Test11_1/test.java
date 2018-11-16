package Test11_1;

import java.text.DecimalFormat;

public class test {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("000.0");
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(df.format(arr[i])+"\t");
        }
    }
}
