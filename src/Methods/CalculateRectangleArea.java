package Methods;
//Create a method that calculates and returns the area of a rectangle by given width and length.

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println(getRectangleArea(width, length));
    }

    private static double getRectangleArea(double width, double length) {
        return width*length;
    }

}
