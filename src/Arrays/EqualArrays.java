package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Read two arrays and print on the console whether they are identical or not.
//Arrays are identical if their elements are equal.
//If the arrays are identical find the sum of the first one and print on the console following message:
//"Arrays are identical. Sum: {sum}", otherwise find the first index where the arrays differ
//and print on the console following message: "Arrays are not identical. Found difference at {index} index."
public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstLine = scanner.nextLine();
        String[] firstArray = firstLine.split(" ");

        String secondLine = scanner.nextLine();
        String[] secondArray = secondLine.split(" ");

        int[] intArr1 = Arrays.stream(firstArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();
        int[] intArr2 = Arrays.stream(secondArray)
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int sum = 0;
        boolean identical = true;
        for (int i = 0; i <= intArr1.length - 1; i++) {
            if (intArr1[i] != intArr2[i]) {
                System.out.printf("Arrays are not identical. Found difference at %d index.%n", i);
                identical = false;
                break;
            }
            sum += intArr1[i];
        }
        if (identical) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
