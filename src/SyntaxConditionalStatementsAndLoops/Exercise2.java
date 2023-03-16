package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

// The description of the task is:
// Write a program, which takes as an input a grade and prints "Passed!"
// if the grade is equal or more than 3.00.
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00){
            System.out.println("Passed!");
        }

    }
}
