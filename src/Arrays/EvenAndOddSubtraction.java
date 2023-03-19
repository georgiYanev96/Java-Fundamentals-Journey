package Arrays;
//Write a program that calculates the difference between the sum of the even and the sum of the odd numbers in an array.

import java.util.Scanner;
import java.util.Arrays;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] items = inputLine.split(" ");
        int[] arr = Arrays.stream(items)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int oddSum = 0;
        int evenSumm = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if(arr[i] % 2 == 0){
                evenSumm += arr[i];
            }else{
                oddSum += arr[i];
            }
        }
            System.out.println(evenSumm-oddSum);
    }
}
