package AssociativeArays;
import java.util.Arrays;
import java.util.Scanner;
//Read an array of strings, take only words which length is even. Print each word on a new line.

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w ->  w.length() % 2 == 0)
                .toArray(String[]::new);
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }
}
