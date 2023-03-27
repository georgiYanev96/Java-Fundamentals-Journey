package TextProcessing;
//You will be given series of strings until you receive an "end" command.
//Write a program that reverses strings and printseach pair on separate line in format "{word} = {reversed word}".

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        String reversed = "";
        while (toContinue){
            String input = scanner.nextLine();
            if(input.equals("end")){
                toContinue = false;
                break;
            }
            for (int i = input.length()-1; i >= 0; i--) {
                reversed = reversed + input.charAt(i);
            }
            System.out.printf("%s = %s%n", input, reversed);
            reversed = "";
        }
    }
}
