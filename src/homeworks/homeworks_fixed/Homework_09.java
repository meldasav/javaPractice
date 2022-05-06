package homeworks.homeworks_fixed;

import java.util.Scanner;

public class Homework_09 {
    public static void main(String[] args) {
        /**
         * Write a program that asks user to enter their names
         * Print out the length of name
         * Find the first character in the name and print out that
         * Find the last character in the name and print out that
         * Find the first 3 characters in the name and print out those
         * Find the last 3 characters in the name and print out those
         * 6.      Check if name starts with character A (or a) or not and print messages below
         * 	If name starts with A or a, print “You are in the club!”
         * 	If name does not start with A or a, print “Sorry, you are not in the club”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name?");
        String name = scan.next();
        System.out.println(name.length());
        if (!name.isEmpty()) {
            System.out.println(name.charAt(0));
            System.out.println(name.charAt(name.length() - 1));
        }
        if (name.length() >= 3) {
            System.out.println(name.substring(0, 3));
            System.out.println(name.substring(name.length() - 3));

        }
        System.out.println(name.toLowerCase().startsWith("a") ? "You are in the club" : "Sorry you are not in the club!");

        /**
         * Write a program that asks user to enter their full address
         * Check if city is Chicago (or chicago) in the address
         * If city is Chicago, then print “You are in the club”
         * If city is Des Plaines, then print “You are welcome to join to the club”
         * If city is any other city, then print “Sorry, you will never be in the club”
         */
        System.out.println("Please enter your full address");
        String address = scan.nextLine();
        scan.nextLine();
        if (address.toLowerCase().contains("chicago")) System.out.println("You are in the club");
        else if (address.toLowerCase().contains("des plaines")) System.out.println("You are welcome to join the club");
        else System.out.println("Sorry, you will never be in the club");

        /**
         * Write a program that asks user to enter their colors, at least 4 colors
         * Check If those colors contains “red” and “green”
         * If “green” is listed in favorite colors, then print “Green is in the list”
         * If “red” is listed in favorite colors, then print “Red is in the list”
         * If both “green” and “red” are listed in favorite colors, then print “Green and red are in the list”
         * If both “green” and “red” are not listed in favorite colors, then print “Green and red are not in the list”
         */
        System.out.println("***********Task 3************");
        System.out.println("please enter 4 colors");
        String color = scan.nextLine();
        if (!color.isEmpty()) {
            if (color.toLowerCase().contains("green") && color.toLowerCase().contains("red"))
                System.out.println("Green and red are in the list");
            else if (color.toLowerCase().contains("green")) System.out.println("Green is in the list");
            else if (color.toLowerCase().contains("red")) System.out.println("Red is in the list");
        } else {
            System.out.println("Green and red are not in the list");

        }
        /**
         * Assume that you are given below String
         * String str = “   Java is FUN   ”;
         *
         * Create 3 new Strings and assign each word from str to those new Strings
         * Finally print the results as below
         *
         * Expected output:
         * The first word in the str is = java
         * The second word in the str is = is
         * The third word in the str is = fun
         */
        String str = "   Java is FUN   ";
        str=str.toLowerCase().trim();
        System.out.println("The first word in the str is = " + str.substring(0,str.indexOf(' ')));
        System.out.println("The second word in the str is = " + str.substring(str.indexOf(' ')+1,str.lastIndexOf(' ')));
        System.out.println("The third word in the str is = " + str.substring(str.lastIndexOf(' ')+1));

        }
    }

