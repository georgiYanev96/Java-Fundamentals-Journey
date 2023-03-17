package DataTypesАndVariables;

import java.util.Scanner;

//Write a program that reads 3 lines of input.
//On each line you get a single character.
//Combine all the characters into one string and print it on the console.
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();
        System.out.println(String.valueOf(first.charAt(0)) + second.charAt(0) + third.charAt(0));

    }
}
