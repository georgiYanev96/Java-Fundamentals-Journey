package Methods;

import java.util.Scanner;

//Write a method that receives a single string and prints the count of the vowels. Use appropriate name for the method.
// a, e, i, o, and u
public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(countVowels(input));
    }

    private static int countVowels(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 'a' ||
                    input.charAt(i) == 'e' ||
                    input.charAt(i) == 'i' ||
                    input.charAt(i) == 'o' ||
                    input.charAt(i) == 'u' ||
                    input.charAt(i) == 'A' ||
                    input.charAt(i) == 'E' ||
                    input.charAt(i) == 'I' ||
                    input.charAt(i) == 'O' ||
                    input.charAt(i) == 'U'){
                result ++;
            }
        }
        return result;
    }
}
