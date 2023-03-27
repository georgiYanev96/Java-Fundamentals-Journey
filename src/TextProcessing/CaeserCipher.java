package TextProcessing;
//Write a program that returns an encrypted version of the same text.
//Encrypt the text by shifting each character with three positions forward.
//For example A would be replaced by D, B would become E, and so on. Print the encrypted text.

import java.util.Scanner;

public class CaeserCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String crypted = encrypt(input);
        System.out.println(crypted);
    }
    public static String encrypt(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
                chars[i] = (char) ((c + 3));
        }
        return new String(chars);
    }
}

