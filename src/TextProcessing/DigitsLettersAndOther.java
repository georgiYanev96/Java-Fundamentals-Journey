package TextProcessing;

import java.util.Scanner;

//Write a program that receives a single string and on the first line prints all the digits,
//on the second – all the letters, and on the third – all the other characters.
//There will always be at least one digit, one letter and one other characters.
public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String digits = "";
        String letters = "";
        String norDigitsNorLetters = "";
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(Character.isDigit(current)){
                digits = digits  + current;
            }else if(Character.isLetter(current)){
                letters = letters + current;
            }else{
                norDigitsNorLetters = norDigitsNorLetters + current;
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(norDigitsNorLetters);
    }
}
