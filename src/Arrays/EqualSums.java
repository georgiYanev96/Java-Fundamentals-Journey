package Arrays;

import java.util.Arrays;
import java.util.Scanner;
//Write a program that determines if there exists an element in the array such that the sum of the elements
//on its left is equal to the sum of the elements on its right.
// If there are no elements to the left / right, their sum is considered to be 0.
// Print the index that satisfies the required condition or “no” if there is no such index.
public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();
        String output = "no";

        for (int i = 0; i < numbers.length ; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int l = 0; l < i ; l++) {
                leftSum += numbers[l];
            }
            for (int r = i + 1; r < numbers.length; r++) {
                rightSum += numbers[r];
            }

            if(leftSum == rightSum){
                output = i + "";
                break;
            }
        }
        System.out.println(output);
    }
}
