package code04;

import java.util.Scanner;

public class Code4_6_4TwoDimensionTest {
    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5 },{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][i] + "\t");
            }
            System.out.println();
        }
    }
}