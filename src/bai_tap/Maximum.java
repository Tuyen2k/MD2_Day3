package bai_tap;

import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n = input.nextInt();
        System.out.println("Enter element length: ");
        int m = input.nextInt();
        double[][] array = new double[n][m];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Enter element index " + i +"."+ j + " : ");
                array[i][j] = input.nextDouble();
            }
        }

        System.out.print("\nArray: \n");
        double max = array[0][0];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]){
                    index1 = i;
                    index2 = j;
                    max = array[i][j];
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.print("\nMaximum value of the array is " + max +" at position " + index1+"."+index2);

    }
}
