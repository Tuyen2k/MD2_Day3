package bai_tap;

import java.util.Scanner;

public class AddValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = scanner.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter value index " + (i + 1) + " in array: ");
            array1[i] = scanner.nextInt();
        }
        //tạo mảng với n phần tử
        System.out.print("Array before add: ");
        for (int value : array1) {
            System.out.print(value + "\t");
        }

        //giá trị muốn thêm
        System.out.print("\nEnter value add in array: ");
        int x = scanner.nextInt();

        //vị trí muốn thêm
        System.out.print("\nEnter index add in array: ");
        int index = scanner.nextInt();

        //cách thêm phần tử vào mảng
        int[] arraysNew = new int[n + 1];
        if (index > -1 && index < n) {

            //duyệt mảng ban đầu và gán các phần tử của mảng mới bằng phần tử mảng ban đầu
            for (int i = 0; i < n; i++) {
                arraysNew[i] = array1[i];
            }

            //duyệt mảng mới và gán phần tử tai vị trí index bằng x
            for (int i = n; i > index; i--) {
                arraysNew[i] = arraysNew[i - 1];
            }
            arraysNew[index] = x;
        }

        //in mảng sau khi thêm
        System.out.print("\nArray after add: ");
        for (int value : arraysNew) {
            System.out.print(value + "\t");
        }
    }
}
