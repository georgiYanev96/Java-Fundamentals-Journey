package Methods;
import java.util.Scanner;

//Write a method that receives two numbers and an operator, calculates the result and returns it.
//You will be given three lines of input.
//The first will be the first number, the second one will be the operator and the last one will be the second number.
// The possible operators are: / * + -
//Print the result rounded up to the second decimal point.
public class MathsOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        int second = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f",getFinalResult(first,operation,second));
    }

    private static double getFinalResult(int first, String operation, int second) {
        return switch (operation) {
            case "/" -> first / second;
            case "*" -> first * second;
            case "-" -> first - second;
            case "+" -> first + second;
            default -> 0;
        };
    }
}
