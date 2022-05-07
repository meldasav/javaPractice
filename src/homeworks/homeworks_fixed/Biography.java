package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Scanner;

public class Biography {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> listOfBooks = new ArrayList<>();
        System.out.println("What is your favorite author's name? ");
        String firstName = scan.next();
        System.out.println("What is your favorite author's last name? ");
        String lastName = scan.next();
        scan.nextLine();
        System.out.println("Where is your favorite author from?");
        String country = scan.next();

        String str = "";
        boolean isAlive = false;
        System.out.println("is your favorite author alive?");
        str = scan.next();
        if (str.toLowerCase().startsWith("y")) isAlive = true;

        int age = 0;
        if (isAlive) {
            System.out.println("What is your favorite author age?");
            age = scan.nextInt();
        }

        Author author = new Author(firstName, lastName, country, isAlive, age, listOfBooks);

        String answer="";
        do {
            System.out.println("What is the name of the book?");
            String name = scan.nextLine();
            scan.nextLine();
            System.out.println("What is genre of the book?");
            String genre = scan.next();
            System.out.println("How many pages does book have?");
            int totalPage = scan.nextInt();
            Book book = new Book(name, genre, totalPage);
            listOfBooks.add(book);
        } while (answer.toUpperCase().startsWith("Y"));
        System.out.println(author);
        if(!listOfBooks.isEmpty()){
            for(Book book : listOfBooks){
                System.out.println(book);
            }
        }
    }
}
