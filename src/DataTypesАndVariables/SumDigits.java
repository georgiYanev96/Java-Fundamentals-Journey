package DataTypesАndVariables;

import java.util.Scanner;

//You will be given a single integer.
// Your task is to find the sum of its digits.
public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int sumOfDigits = 0;
        int digits = num;
        while (digits > 0) {
            sumOfDigits += digits % 10;
            digits = digits / 10;
        }
        System.out.println(sumOfDigits);
    }
}
