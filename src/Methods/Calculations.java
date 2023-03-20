package Methods;

import java.util.Scanner;

//Write a program that receives a string on the first line ("add", "multiply", "subtract", "divide")
//and on the next two lines receives two numbers. Create four methods (for each calculation)
//and invoke the right one depending on the command. The method should also print the result (needs to be void).
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String calculation = scanner.nextLine();
        double first = Integer.parseInt(scanner.nextLine());
        double second = Integer.parseInt(scanner.nextLine());

        switch (calculation) {
            case "add" -> add(first, second);
            case "multiply" -> multiply(first, second);
            case "subtract" -> subtract(first, second);
            case "divide" -> divide(first, second);
        }
    }

    private static void divide(double first, double second) {
        double result = first / second;
        System.out.println(result);
    }

    private static void subtract(double first, double second) {
        double result = first - second;
        System.out.println(result);
    }

    private static void multiply(double first, double second) {
        double result = first * second;
        System.out.println(result);
    }

    private static void add(double first, double second) {
        double result = first + second;
        System.out.println(result);
    }
}
