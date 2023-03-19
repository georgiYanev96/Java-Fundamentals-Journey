package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//Write a program which creates 2 arrays.
//You will be given an integer n. On the next n lines you get 2 integers. Form 2 arrays as shown below.
public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] first = new int[n];
        int[] second = new int[n];
        for (int i = 0; i <= first.length-1; i++) {
            String[] elements = scanner.nextLine().split(" ");
            if(i % 2 == 0) {
                first[i] = Integer.parseInt(elements[0]);
                second[i] = Integer.parseInt(elements[1]);
            }else {
                first[i] = Integer.parseInt(elements[1]);
                second[i] = Integer.parseInt(elements[0]);
            }
        }
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
    }
}
