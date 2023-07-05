package bai_tap;

import java.util.Scanner;

public class SumMainDiagonalMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = input.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element at position " + i + "." + j + " : ");
                array[i][j] = input.nextInt();
            }
        }


        int sumMain = 0;
        int sumExtra = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j) {
                    sumMain += array[i][j];
                }
                if (i + j == n - 1) {
                    sumExtra = array[i][j];
                }
            }
        }
        System.out.println("Sum of the numbers on the main diagonal of the matrix: " + sumMain);
        System.out.println("Sum of the numbers on the extra diagonal of the matrix: " + sumExtra);
    }
}
