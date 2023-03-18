package DataTypesАndVariables;
//Write a program that prints whether a given character is upper-case or lower-case.

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        if (Character.isUpperCase(a.charAt(0))){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }

}
