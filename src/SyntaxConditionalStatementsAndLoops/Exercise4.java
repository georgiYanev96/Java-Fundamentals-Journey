package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//Every time Stamat tries to pay his bills he sees on the cash desk the sign:
// "I will be back in 30 minutes". One day Stamat was sick of waiting and decided he needs a program,
// which prints the time after 30 minutes. That way he won’t have to wait on the desk
// and come at the appropriate time. He gave the assignment to you, so you have to do it.
//Input
//The input will be on two lines. On the first line, you will receive the hours
// and on the second you will receive the minutes.
//Output
//Print on the console the time after 30 minutes. The result should be in format "hh:mm".
// The hours have one or two numbers and the minutes have always two numbers (with leading zero).
//Constraints
//•	The hours will be between 0 and 23.
//•	The minutes will be between 0 and 59.
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours =  Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int additionalMinutes = 30;
        int newHours = 0;
        int newMinutes = minutes + additionalMinutes;


        if(newMinutes > 60){
            newMinutes = newMinutes - 60;
            newHours = hours +1;
            if(newHours == 24){
                newHours = 0;
            }
        } else if(newMinutes == 60){
            newMinutes = 0;
        newHours = hours+1;
            if(newHours == 24){
                newHours = 0;
            }
        }

        System.out.printf("%02d:%02d", newHours, newMinutes);
    }
}
