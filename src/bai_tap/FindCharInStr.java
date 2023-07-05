package bai_tap;

import java.util.Scanner;
import java.lang.String;

public class FindCharInStr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = input.nextLine();
        System.out.println("Enter the desired character : ");
        char ch = input.next().charAt(0);
        int count = 0;
//        char[] arr = str.toCharArray(); --> chuyển chuỗi thàng mảng các ký tự
//        str.charAt(index); --> truy xuất ký tự thứ index của chuỗi

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Number of occurrences of a character in a string: " + count);
    }
}
