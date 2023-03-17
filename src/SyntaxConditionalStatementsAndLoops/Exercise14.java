package SyntaxConditionalStatementsAndLoops;
import java.util.Scanner;
//You are given a group of people, type of the group, on which day of the week they are going to stay.
//Based on that information calculate how much they have to pay and print that price on the console.
//Use the table below. In each cell is the price for a single person.
//The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.
//              Friday          Saturday          Sunday
//Students      8.45             9.80             10.46
//Business      10.90            15.60              16
//Regular       15                20              22.50
//There are also discounts based on some conditions:
//· Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%
//· Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.
//· Regular – if the group is bigger than or equal 10 and less than or equal to 20 reduce the total price by 5%
//You should reduce the prices in that EXACT order
public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;

        switch (type) {
            case "Students" -> {
                switch (day) {
                    case "Friday" -> price = 8.45;
                    case "Saturday" -> price = 9.80;
                    case "Sunday" -> price = 10.46;
                }
            }
            case "Business" -> {
                price = switch (day) {
                    case "Friday" -> 10.90;
                    case "Saturday" -> 15.60;
                    case "Sunday" -> 16;
                    default -> price;
                };
            }
            case "Regular" -> {
                price = switch (day) {
                    case "Friday" -> 15;
                    case "Saturday" -> 20;
                    case "Sunday" -> 22.50;
                    default -> price;
                };
            }
        }

        if(num >= 30 && type.equals("Students")){
            price = price * num * 0.85;
            System.out.printf("Total price: %.2f",price);
        }else if(num >= 100 && type.equals("Business")){
            double sale = price * 10;
            price = price * num - sale;
            System.out.printf("Total price: %.2f",price);
        }else if(num >= 10 && num <= 20 && type.equals("Regular")){
            price = price * num * 0.95;
            System.out.printf("Total price: %.2f",price);
        }
        else {
            price = price * num;
            System.out.printf("Total price: %.2f",price);
        }

    }
}
