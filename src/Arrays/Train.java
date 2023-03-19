package Arrays;

import java.util.Arrays;
import java.util.Scanner;

//You will be given a count of wagons in a train n.
//On the next n lines you will receive how many people are going to get on that wagon.
//At the end print the whole train and after that the sum of the people in the train.
public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        int sumPeople = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            int current = Integer.parseInt(scanner.nextLine());
            arr[i] = current;
            sumPeople += current;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(sumPeople);

    }
}
