package homeworks.homeworks_fixed;

import java.util.Scanner;

public class Homework_10 {
    public static void main(String[] args) {
        /**
         * ask user enter a string
         * Assume that you are given a String of any length. First check
         * if it has at least length of 1. If the length is zero, then print “Length is zero”
         *  If it has length more than zero, then find:
         * -The length of the String
         * -First char in the String
         * -Last char in the String
         * -Check if the String contains any vowel letters
         * 	-if it has any vowel, then print “This String has vowel”
         * 	-Else, print “This String does not have vowel”
         * 	Vowels = a, e, i, u, o
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence = scan.nextLine();
        sentence = sentence.toLowerCase();

        if (!sentence.isEmpty()) {
            System.out.println(sentence.length());
            System.out.println(sentence.charAt(0));
            System.out.println(sentence.charAt(sentence.length() - 1));
            if (sentence.contains("a") ||
                    sentence.contains("e") ||
                    sentence.contains("i") ||
                    sentence.contains("o") ||
                    sentence.contains("u")) System.out.println("This string has vowel");
            else System.out.println("This String does not have vowel");

        }
        /**
         * Assume that you are given a String of any length. First check if it has at least length of 3.
         * If the length is less than 3, then print “Length is less than 3”
         * If it has length more than or equal to 3, then find the middle character for the odd length, middle 2 characters for the even length.
         */


        System.out.println("please enter a sentence");
        String sentence1 = scan.nextLine();
        if (sentence1.length() < 3) System.out.println("Length is less than 3");
        else if (sentence1.length() % 2 == 1) System.out.println(sentence1.charAt(sentence1.length() / 2));
        else
            System.out.println("" + sentence1.charAt(sentence1.length() / 2 - 1) + sentence1.charAt(sentence1.length() / 2));

        /**
         * Write a program that divides the given String. Length of given will be at least 4.
         *  if length of the String is not at least 4, then print “INVALID INPUT”
         * If the length is 4 or more, then
         * -print the first two characters
         * -print the last two characters
         * -print all the middle characters other than first and last 2 characters
         */
        System.out.println("please enter a sentence");
        String sentence2 = scan.nextLine();
        if (sentence2.length() < 2) {
            System.out.println("INVALID INPUT");
        } else {
            System.out.println("first two characters " + sentence2.substring(0, 2));
            System.out.println("last two characters " + sentence2.substring(sentence2.length() - 2));
            System.out.println("the middle characters " + sentence2.substring(2, sentence2.length() - 2));

        }
        /**
         Assume that you are given a String of any length. First check if it has at least length of 2.
         If the length is less than 2, then print “Length is less than 2”
         If it has length more than or equal to 2, then if first 2 and last 2 characters of the given String are same.
         If first 2 and last characters are same, then print true. Otherwise, print false
         */
        System.out.println("please enter a sentence");
        String sentence3 = scan.nextLine();
        if (sentence3.length() < 2) System.out.println("Length is less than 2");
        else System.out.println(sentence3.substring(0, 2).equals(sentence3.substring(sentence3.length() - 2)));

        /**
         * Write a program that gets rid of first and last characters of given two String values.
         * After getting rid of first and last characters, add these two String values to each other and print the result.
         * If one of the String values has length that is less than 2, then print “INVALID INPUT”
         */
        System.out.println("please enter a sentence");
        String sentence4 = scan.nextLine();
        String sentence5 = scan.nextLine();
        if(sentence4.length()<2 || sentence5.length()<2) System.out.println("INVALID INPUT");
        else System.out.println(""+sentence4.substring(1,sentence4.length()-1)+sentence5.substring(1,sentence4.length()-1));
        /**
         * Write a program that checks if a given String that has length of 4 at least and starts and ends with xx.
         * -If the length of String is less than 4, then print “INVALID INPUT”
         * -If given String starts and ends with xx, then print true.
         * -Otherwise, print false
         */
        System.out.println("please enter a sentence");
        String sentence6 = scan.nextLine();
        if(sentence6.length()<4) System.out.println("INVALID INPUT");
        else System.out.println(sentence6.toLowerCase().startsWith("xx") && sentence6.toLowerCase().endsWith("xx"));
        //2.way
  //      System.out.println(sentence6.length()<4? "INVALID INPUT":sentence6.toLowerCase().startsWith("xx")
  //               && sentence6.toLowerCase().endsWith("xx"));



    }
}





