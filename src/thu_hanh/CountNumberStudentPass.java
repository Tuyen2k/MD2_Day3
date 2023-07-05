package thu_hanh;

import java.util.Scanner;

public class CountNumberStudentPass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        int[] arrayPoint = new int[size];
        for (int i = 0; i < arrayPoint.length; i++) {
            System.out.print("Enter point at position " + (i+1) +" : ");
            arrayPoint[i] = input.nextInt();
        }

        for ( int value : arrayPoint){
            if ( value >= 5){
                count++;
            }
        }
        System.out.println("Quantity student pass: " + count);
    }
}
