package DataTypesАndVariables;

import java.util.Scanner;

//Read two names and a delimiter. Print the names joined by the delimiter.
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();
        System.out.printf("%s%s%s",firstName,delimiter,secondName);
    }
}
