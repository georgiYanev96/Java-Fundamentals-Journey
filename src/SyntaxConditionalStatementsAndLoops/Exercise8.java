package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//Write a program that prints the next n odd numbers (starting from 1) and on the last row prints the sum of them.
//Input
//On the first line, you will receive a number – n. This number shows how many odd numbers you should print.
//Output
//Print the next n odd numbers, starting from 1, separated by new lines. On the last line, print the sum of these
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int oddNumm = 1;

        while (n > 0){
            System.out.println(oddNumm);
            sum = sum + oddNumm;
            oddNumm = oddNumm +2;
            n--;
        }

        System.out.printf("Sum: %d", sum);

    }
}
