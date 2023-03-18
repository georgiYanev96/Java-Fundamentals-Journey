package DataTypesАndVariables;

import java.util.Scanner;

//Write a program that takes 3 lines of characters and prints them in reversed order with a space between them.
public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.println(String.valueOf(third.charAt(0)) + second.charAt(0) + first.charAt(0));

    }

}
