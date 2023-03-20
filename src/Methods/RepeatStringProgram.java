package Methods;

import java.util.Scanner;

//Write a method that receives a string and a repeat count n (integer).
//The method should return a new string (the old one repeated n times).
public class RepeatStringProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(repeatString(input, n));
    }

    private static String repeatString(String input, int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            output.append(input);
        }
        return output.toString();
    }

}
