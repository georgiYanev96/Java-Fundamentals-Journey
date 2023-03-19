package Arrays;

import java.util.Scanner;

//Read n numbers and print them in reverse order.
public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            numbers[i] = num;
        }
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
