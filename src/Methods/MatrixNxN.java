package Methods;

import java.util.Scanner;
//Write a method that receives a single integer n and prints nxn matrix with that number.
public class MatrixNxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println(printMatrix(n));
    }

    private static String printMatrix(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                output.append(n).append(" ");
            }
            output.append("\n");
        }
        return output.toString();
    }
}

