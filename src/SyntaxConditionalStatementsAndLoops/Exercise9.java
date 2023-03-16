package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//You will receive an integer as an input from the console.
// Print the 10 times table for this integer. See the examples below for more information.
//Output
//Print every row of the table in the following format:
//{theInteger} X {times} = {product}
//Constraints
//•	The integer will be in the interval [1…100]
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nTimesI = 0;
        for (int i = 1; i <= 10 ; i++) {
            nTimesI = n * i;
            System.out.println(n + " X " + i + " = " + nTimesI);
        }
    }

}
