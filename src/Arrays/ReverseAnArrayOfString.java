package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to read an array of strings, reverse it and print its elements.
//The input consists of a sequence of space separated strings.
//Print the output on a single line (space separated).
public class ReverseAnArrayOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] elements = sc.nextLine().split(" ");
        for (int i = 0; i < elements.length / 2; i++) {
            String oldElement = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = oldElement;
        }
        System.out.println(String.join(" ", elements));


    }
}
