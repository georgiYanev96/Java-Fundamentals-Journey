package ListsAndAdvancedArrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to append several arrays of numbers.
//	Arrays are separated by "|"
//	Values are separated by spaces (" ", one or several)
//	Order the arrays from the last to the first, and their values from left to right
public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\|");
        for (int i = input.length-1; i >= 0; i--) {
            String[] currentArray = input[i].split(" ");
            for (int j = 0; j < currentArray.length; j++) {
                if(!currentArray[j].isEmpty()) {
                    System.out.print(currentArray[j] + " ");
                }
            }
        }
    }
}
