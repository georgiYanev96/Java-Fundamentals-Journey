package TextProcessing;

import java.util.Scanner;

//Write a program that reads a string from the console and replaces any
//sequence of the same letters with a single corresponding letter.
public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String output = removeDuplicates(input);
        System.out.println(output);
    }

    public static String removeDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        char prevChar = '\0';
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != prevChar) {
                sb.append(currentChar);
                prevChar = currentChar;
            }
        }
        return sb.toString();
    }
}
