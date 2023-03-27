package TextProcessing;
//On the first line you will receive a string.
//On the second line you will receive a second string.
//Write a program that removes all of the occurrences of the first string in the second until there is no match.
//At the end print the remaining string.

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        while(secondInput.contains(firstInput)){
         secondInput =  secondInput.replace(firstInput, "");
        }
        System.out.println(secondInput);
    }
}
