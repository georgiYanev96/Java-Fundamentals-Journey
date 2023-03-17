package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//Write a program to check if a given number is a strong number or not.
//A number is strong if the sum of the Factorial of each digit is equal to the number.
//For example 145 is a strong number, because 1! + 4! + 5! = 145.
//Print "yes" if the number is strong and "no" if the number is not strong.
public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int sum = 0;
        int fact = 1;
        for (int i = 0; i < num.length(); i++) {
            int currentNum = Integer.parseInt(String.valueOf(num.charAt(i)));
            if (currentNum == 0) {
                sum += 1;
            } else {
                for (int j = currentNum; j > 0; j--) {
                    fact *= j;
                }
                sum += fact;
                fact = 1;
            }
        }
        if (sum == Integer.parseInt(num)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
}

