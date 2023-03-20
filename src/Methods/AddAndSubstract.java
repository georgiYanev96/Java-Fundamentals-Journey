package Methods;

import java.util.Scanner;

//You will receive 3 integers.
//Write a method sum to get the sum of the first two integers
//and subtract method that subtracts the third integer
//from the result from the sum method.
public class AddAndSubstract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int sumResult = sum(first, second);
        int finalResult = substract(sumResult, third);
        System.out.println(finalResult);
    }

    private static int substract(int sumResult, int third) {
        return sumResult - third;
    }

    private static int sum(int first, int second) {
        return  first + second;
    }
}
