package DataTypesАndVariables;
//You have a water tank with capacity of 255 liters.
//On the next n lines, you will receive liters of water, which you have to pour in your tank.
//If the capacity is not enough, print “Insufficient capacity!” and continue reading the next line.
//On the last line, print the liters in the tank.


import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 0;
        while (n > 0){
            int liters = Integer.parseInt(scanner.nextLine());
            if(liters > 255 || capacity+liters > 255){
                System.out.println("Insufficient capacity!");
            }else{
                capacity += liters;
            }
            n--;
        }
        System.out.println(capacity);
    }
}
