package Methods;
//Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
//•	2.00 – 2.99 - "Fail"
//•	3.00 – 3.49 - "Poor"
//•	3.50 – 4.49 - "Good"
//•	4.50 – 5.49 - "Very good"
//•	5.50 – 6.00 - "Excellent"

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input = Double.parseDouble(scanner.nextLine());
        printInWords(input);
    }

    private static void printInWords(double input) {
        if(input >= 2.00 && input <= 2.99){
            System.out.println("Fail");
        }else  if(input >= 3.00 && input <= 3.49) {
            System.out.println("Poor");
        }else  if(input >= 3.50 && input <= 4.49) {
            System.out.println("Good");
        }else  if(input >= 4.50 && input <= 5.49) {
            System.out.println("Very good");
        }else  if(input >= 5.50 && input <= 6.00) {
            System.out.println("Excellent");
        }
    }
}
