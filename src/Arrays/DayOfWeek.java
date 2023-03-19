package Arrays;

import java.util.Scanner;

//Enter a day number [1…7] and print the day name (in English) or "Invalid day!".
// Use an array of strings.
public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] weekDays = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(weekDays[n]);
    }

}
