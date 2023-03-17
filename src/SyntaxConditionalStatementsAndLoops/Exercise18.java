package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//Write a program, which receives a number – n, and prints a triangle from 1 to n as in the examples
public class Exercise18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
