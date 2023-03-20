package Methods;

import java.util.Scanner;
//Create a method that prints the sign of an integer number.
public class SignOfInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        isPositiveOrNegative(input);
    }
    public static void isPositiveOrNegative(int num){
        if(num >= 0){
            System.out.printf("The number %d is positive.%n",num);
        }else{
            System.out.printf("The number %d is negative.%n",num);
        }
    }
}
