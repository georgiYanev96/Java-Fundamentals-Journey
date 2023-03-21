package ListsAndAdvancedArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Read a number n and n lines of products. Print a numbered list of all the products ordered by name.
public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> products = new ArrayList<>();
        while (n > 0){
            String input = scanner.nextLine();
            products.add(input);
            n--;
        }
        Collections.sort(products);
        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n", i+1, products.get(i));
        }
    }
}
