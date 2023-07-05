package bai_tap;

import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i + 1) + " in array: ");
            array[i] = scanner.nextInt();
        }
        int index = -1;
        System.out.println("Enter value delete: ");
        int x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == array[i]) {
                index = i;
            }
        }

        System.out.print("Array before delete: ");
        for (int value : array) {
            System.out.print(value + "\t");
        }

        if (index > -1) {
            for (int i = index; i < n - 1; i++) {
                array[i] = array[i + 1];
            }
        }
        int[] arr = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = array[i];
        }

        System.out.print("\nArray after delete: ");
        for (int value : arr) {
            System.out.print(value + "\t");
        }
    }
}
