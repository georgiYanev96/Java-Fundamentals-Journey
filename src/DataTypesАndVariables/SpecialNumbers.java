package DataTypesАndVariables;

import java.util.Scanner;

//A number is special when its sum of digits is 5, 7 or 11.
//Write a program to read an integer n and for all numbers in the range 1…n
//to print the number and if it is special or not (True / False).
public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int num = 1; num <= n; num++) {
            int sumOfDigits = 0;
            int digits = num;
            while (digits > 0) {
                sumOfDigits += digits % 10;
                digits = digits / 10;
            }

            if (sumOfDigits == 5 || sumOfDigits == 7 || sumOfDigits == 11) {
                System.out.printf("%d -> True%n", num);
            } else {
                System.out.printf("%d -> False%n", num);
            }
        }
    }
}