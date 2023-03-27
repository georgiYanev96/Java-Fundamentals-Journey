package TextProcessing;

import java.util.Scanner;

//Create a method that takes two strings as arguments and returns the sum of their character codes multiplied
//(multiply str1[0] with str2[0] and add to the total sum).
//Then continue with the next two characters.
//If one of the strings is longer than the other, add the remaining character codes to the total sum without multiplication.
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        int total = 0;
        if(first.length() < second.length()){
            for (int i = 0; i < first.length(); i++) {
                int char1 = second.charAt(i);
                int char2 = first.charAt(i);
                total = total + (char1 * char2);
            }
            for (int i = first.length(); i < second.length(); i++) {
                total = total + second.charAt(i);
            }
        }else if(first.length() >= second.length()){
            for (int i = 0; i < second.length(); i++) {
                int char1 = second.charAt(i);
                int char2 = first.charAt(i);
                total = total + (char1 * char2);
            }
            for (int i = second.length(); i < first.length(); i++) {
                total = total + first.charAt(i);
            }
        }
        System.out.println(total);
    }
}
