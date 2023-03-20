package Methods;

import java.util.Scanner;

//Create a method that calculates and returns the value of a number raised to a given power.
public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(getNumPower(n, power));
    }

    private static double getNumPower(double n, int power) {
        double result = 1;
        for (int i = 0; i < power; i++) {
            result *= n;
        }
        return result;
    }
}
