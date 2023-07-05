package bai_tap;

import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array1 length: ");
        int n = input.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i + 1) + " in array1: ");
            array1[i] = input.nextInt();
        }

        System.out.println("Enter array2 length: ");
        int m = input.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i + 1) + " in array2: ");
            array2[i] = input.nextInt();
        }

        int[] array3 = new int[n + m];

        for (int i = 0; i < n; i++) {
            array3[i] = array1[i];
        }

        for (int i = 0; i < m; i++) {
            array3[n + i] = array2[i];
        }

        System.out.print("\nArray after add: ");
        for (int value : array1) {
            System.out.print(value + "\t");
        }
        System.out.print("\nArray after add: ");
        for (int value : array2) {
            System.out.print(value + "\t");
        }
        System.out.print("\nArray after add: ");
        for (int value : array3) {
            System.out.print(value + "\t");
        }
    }
}
