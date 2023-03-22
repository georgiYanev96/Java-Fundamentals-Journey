package ObjectsAndClasses.Articles;

import java.util.Scanner;

//Create an article class with the following properties:
//•	Title – a string
//•	Content – a string
//•	Author – a string
//The class should have a constructor and the following methods:
//•	Edit (new content) – change the old content with the new one
//•	ChangeAuthor (new author) – change the author
//•	Rename (new title) – change the title of the article
//•	override ToString – print the article in the following format:
//"{title} - {content}:{author}"
//Write a program that reads an article in the following format "{title}, {content}, {author}".
//On the next line, you will get a number n. On the next n lines, you will get one of the following commands:
//"Edit: {new content}";
//"ChangeAuthor: {new author}";
//"Rename: {new title}".
//At the end, print the final article.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Article myArticle = new Article();
        myArticle.setTitle(input[0]);
        myArticle.setContent(input[1]);
        myArticle.setAuthor(input[2]);
        int n = Integer.parseInt(scanner.nextLine());
        while (n > 0){
            String[] command = scanner.nextLine().split(": ");
            if(command[0].equals("Edit")) {
            myArticle.edit(command[1]);
            }
            if(command[0].equals("ChangeAuthor")) {
                myArticle.changeAuthor(command[1]);
            }
            if(command[0].equals("Rename")) {
                myArticle.rename(command[1]);
            }
            n--;
        }
        System.out.println(myArticle.toString());
    }
}
