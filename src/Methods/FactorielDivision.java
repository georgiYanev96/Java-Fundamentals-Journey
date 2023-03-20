package Methods;

import java.util.Scanner;

//Read two integer numbers. Calculate factorial of each number.
//Divide the first result by the second and print the division formatted to the second decimal point.
public class FactorielDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        double result = getFactoriel(first)/getFactoriel(second);
        System.out.println(result);
    }

    private static double getFactoriel(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact*i;
        }
        return fact;
    }
}
