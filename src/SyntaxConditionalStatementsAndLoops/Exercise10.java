package SyntaxConditionalStatementsAndLoops;
//Rewrite you program(Exercise 9)  so it can receive the multiplier from the console.
// Print the table from the given multiplier to 10.
// If the given multiplier is more than 10 - print only one row with the integer, the given multiplier and the product.
// See the examples below for more information.
//Output
//Print every row of the table in the following format:
//{theInteger} X {times} = {product}
//Constraints
//•	The integer will be in the interval [1…100]

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        int nTimesI = 0;
        if(multiplier > 10){
            nTimesI = n * multiplier;
            System.out.println(n + " X " + multiplier + " = " + nTimesI);
        }else {
            for (int i = multiplier; i <= 10; i++) {
                nTimesI = n * i;
                System.out.println(n + " X " + i + " = " + nTimesI);
            }
        }
    }
}
