package TextProcessing;
//Write a program that reads the path to a file and subtracts the file name and its extension.

import java.util.Scanner;

public class ExtractFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\\\");
        String file = input[input.length-1];
        String[] fileData = file.split("\\.");
        String name = fileData[0];
        String extension = fileData[1];
        System.out.printf("File name: %s%n", name);
        System.out.printf("File extension: %s%n", extension);


    }
}
