package DataTypesАndVariables;

import java.util.Scanner;

//You will be given an integer that will be distance in meters.
//Write a program that converts meters to kilometers formatted to the second decimal point.
public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String meters = scanner.nextLine();
        double km = Double.parseDouble(meters);
        System.out.printf("%.2f", km/1000);
    }
}
