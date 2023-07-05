package bai_tap;

import java.util.Scanner;

public class SumColArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = input.nextInt();
        System.out.println("Enter element length: ");
        int m = input.nextInt();

        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element at position " + i + "." + j + " : ");
                array[i][j] = input.nextInt();
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][1];
        }
        System.out.println("Sum of colum in array is: " + sum);
    }
}
