package stringMethods;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Scanner;

public class _03_equals {
    public static void main(String[] args) {
        System.out.println("melda".equals("melda"));//non static
/*
        Method Task: It compares 2 strings with each other and tells if they are equal or not
        NOTE: This comparison is case-sensitive
        -It is non-static, and we call it with another String object
        -It is a return type and returns a boolean
        -It takes a String as an argument
         */

        System.out.println("Melda".equals("Melda")); // true
        System.out.println("melda".equals("Melda")); // false

        String name1 = "John";
        String name2 = "James";
        String name3 = "James";

        System.out.println(name1.equals(name2)); // false
        System.out.println(name2.equals(name3)); // true

        System.out.println("\n-------PRACTICES--------\n");
        String str1 = "Hello";
        String str2 = str1; // str2 = "Hello"

        boolean b = !(str1.equals(str2)); // false

        System.out.println(b); // false


        System.out.println(!("abc".concat("xyz").equals("abcx" + "yz")));
        /*
        "abcxyz".equals("abcxyz")   -> !true -> false

        int i = (5 + 2) * 3 ->
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a word");
//        String word1 = scanner.next(), word2 = scanner.next();
//        do {
//
//            if (word1.equals(word2)) {
//                System.out.println("Two words are equal");
//            } else {
//                System.out.println("Two words are NOT equal");
//                System.out.println("Please enter different words");
//                word1 = scanner.next();
//                word2 = scanner.next();
//            }
//        } while (!word1.equals(word2));




      specialCharacter();

    }

    public static void specialCharacter() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a character");
        String c = scanner.next();
        char c1 = c.charAt(0);

        do {
            if (Character.isDigit(c1) || Character.isLetter(c1) ||
                    Character.isWhitespace(c1)) {
                System.out.println("Invalid Character is detected");
                System.out.println("Please enter another character");
                c = scanner.next();
                c1 = c.charAt(0);
            }
            else if(c1 == '.' || c1 == '*') {
                System.out.println("Special Character is " + c1);
            }
        } while (Character.isDigit(c1) || Character.isLetter(c1) ||
                 Character.isSpaceChar(c1));
    }

    public static void equalWords() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word1 = scanner.next();
        String word2 = scanner.next();
        do {
            if (word1.equals(word2)) {
                System.out.println("These two words " + "'" +word1 + " and " + word2 + "'" + " are equal");

            } else {
                System.out.println("Two words " + "'" + word1 + " and " + word2 + "'" +" are NOT equal");
                System.out.println("Please enter different words");
                word1 = scanner.next();
                word2 = scanner.next();
            }
        } while (!word1.equals(word2));
    }


}

