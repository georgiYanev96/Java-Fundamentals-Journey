package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

// Modify the above program(exercise2) , so it will print "Failed!" if the grade is lower than 3.00.
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 3.00){
            System.out.println("Passed!");
        } else if (grade < 3.00) {
            System.out.println("Failed!");
        }

    }
}
