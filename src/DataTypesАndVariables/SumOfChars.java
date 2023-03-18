package DataTypesАndVariables;

import java.util.Scanner;

//Write a program, which sums the ASCII codes of n characters.
//Print the sum on the console.
//Input
//•	On the first line, you will receive n – the number of lines, which will follow
//•	On the next n lines – you will receive letters from the Latin alphabet
//Output
//Print the total sum in the following format:
//The sum equals: {totalSum}
//Constraints
//•	n will be in the interval [1…20].
//•	The characters will always be either upper or lower-case letters from the English alphabet
//•	You will always receive one letter per line
public class SumOfChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int linesNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        while(linesNum > 0){
            String letter = scanner.next();
            sum = sum + (int) letter.charAt(0);
            linesNum--;
        }
        System.out.printf("The sum equals: %d", sum);
    }
}
