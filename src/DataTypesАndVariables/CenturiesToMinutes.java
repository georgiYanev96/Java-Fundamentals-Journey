package DataTypesАndVariables;

import java.util.Scanner;

//Write program to enter an integer number of centuries and convert it to years, days, hours and minutes.
public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt(scanner.nextLine());
        long years = 100L * centuries;
        long days = 36524L * centuries;
        long hours = 876576L * centuries;
        long minutes = 52594560L * centuries;

        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",centuries,years,days,hours,minutes);


    }
}
