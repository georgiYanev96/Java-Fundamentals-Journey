package Methods;

import java.util.Scanner;

//You are given two values of the same type as input.
//The values can be of type int, char of String.
//Create a method getMax() that returns the greater of the two values:
public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        switch (command) {
            case "int":
                int first = Integer.parseInt(scanner.nextLine());
                int second = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(first, second));
                break;
            case "char":
                String firstChar = scanner.nextLine();
                String secondChar = scanner.nextLine();
                System.out.println(getMax(firstChar.charAt(0),secondChar.charAt(0)));
                break;
            case "string":
                String input1 = scanner.nextLine();
                String input2 = scanner.nextLine();
                System.out.println(getMax(input1, input2));
                break;
        }
    }

    private static int getMax(int first, int second) {
        return Math.max(first, second);
    }
    private static char getMax(char first, char second) {
        if(first > second) {
            return first;
        }
        return second;
    }
    private static String getMax(String first, String second) {
        if(first.compareTo(second) >= 0) {
            return first;
        }
        return second;
    }
}
