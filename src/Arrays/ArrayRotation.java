package Arrays;
//Write a program that receives an array and number of rotations you have to perform (first element goes at the end)
//Print the resulting array.


import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String first = arr[0];
            for (int j = 0; j < arr.length-1; j++) {
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        System.out.println(Arrays.toString(arr));
    }

}
