package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program to find all the top integers in an array.
//A top integer is an integer which is bigger than all the elements to its right.
public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt((Integer::parseInt))
                .toArray();
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            boolean isTopNumber = true;

            for (int j = i  + 1; j < arr.length; j++) {
                if(element <= arr[j]){
                    isTopNumber = false;
                    break;
                }
            }
            if(isTopNumber){
                System.out.print(element + " ");
            }
        }
        }

    }

