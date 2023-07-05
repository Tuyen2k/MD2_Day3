package bai_tap;

import java.util.Scanner;
public class Minimum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("\nEnter value element in array at position "+ (i+1)+" : ");
            array[i]=input.nextInt();
        }

        int min = array[0];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (min > array[i]){
                min = array[i];
                index = i;
            }
        }
        System.out.print("\nMinimum value of the array is " + min +" at position index is " + index);
    }
}
