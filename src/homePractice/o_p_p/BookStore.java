package homePractice.o_p_p;

import java.util.Scanner;

public class BookStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("how many books");
        int bookNum = input.nextInt();
        Book[] myBook = new Book[bookNum];
        for (int i = 0; i < bookNum; i++) {
            Book b = new Book();
            System.out.println("enter title");
            b.title = input.nextLine();
            input.nextLine();
            System.out.println("enter auttor");
            b.author = input.nextLine();
            System.out.println("enter pages");
            b.pages = input.nextInt();
            myBook[i] = b;
        }
        System.out.println(myBook[0].title);
        System.out.println(myBook.length);
    }
}