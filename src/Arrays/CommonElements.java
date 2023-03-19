package Arrays;

import java.util.Scanner;
import java.util.Arrays;


//Write a program, which prints common elements in two arrays.
//You have to compare the elements of the second array to the elements of the first.
public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        StringBuilder common = new StringBuilder();
        for (int i = 0; i <=  arr2.length-1; i++) {
            for (int j = 0; j <= arr1.length-1 ; j++) {
                if(arr2[i].equals(arr1[j])){
                    common.append(arr2[i] + " ");
                }
            }
        }
        System.out.println(common);

    }
}
