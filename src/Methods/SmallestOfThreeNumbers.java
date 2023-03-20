package Methods;

import java.util.Scanner;

//Write a method to print the smallest of three integer numbers. Use appropriate name for the method.
public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.printf("%d",getSmallestInteger(first,second,third));
    }

    private static int getSmallestInteger(int first, int second, int third) {
        if(first <= second && first <= third){
            return first;
        }else if (second <= first && second <= third ){
            return second;
        }else {
            return third;
        }
    }
}
