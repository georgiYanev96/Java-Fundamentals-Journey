package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Read an array from the console and sum only the even numbers.
public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        for (int i = 0; i <= num.length-1 ; i++) {
            if(num[i] % 2 == 0){
                sum += num[i];
            }
        }
        System.out.println(sum);

    }
}
