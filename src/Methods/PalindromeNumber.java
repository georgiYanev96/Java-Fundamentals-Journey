package Methods;

import java.util.Scanner;

//A palindrome is a number which reads the same backward as forward, such as 323 or 1001.
//Write a program which reads a positive integer numbers until you receive "END".
//For each number print whether the number is palindrome or not.
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean read = true;
        while (read){
            String input = scanner.nextLine();
            if(input.equals("END")){
                read = false;
            }else {
                int num = Integer.parseInt(input);
                System.out.println(checkForPalindromeNumber(num));
            }
        }
    }

    private static String checkForPalindromeNumber(int num) {
        int r,sum=0,temp;
        temp=num;
        while(num>0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum) {
            return "true";
        }
        else {
            return "false";
        }
    }
}

