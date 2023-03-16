package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

import static java.lang.Math.abs;

//Take as an input an even number and print its absolute value.
// If the number is odd, print "Please write an even number." and continue reading numbers.
public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while ( n % 2 != 0){
            System.out.println("Please write an even number.");
            n = Integer.parseInt(scanner.nextLine());
        }

            System.out.println("The numbers is: " + abs(n));

    }
}
