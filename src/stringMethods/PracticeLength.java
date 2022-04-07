package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeLength {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your favorite book");
        String book= scan.nextLine();
        System.out.println("write a quote");
        String quote=scan.nextLine();
        System.out.println(book.length());
        System.out.println(quote.length());

    }

}

