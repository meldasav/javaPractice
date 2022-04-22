package ifElseStatements.ternaryOperator;

import utilities.ScannerHelper;

import java.util.Scanner;

public class TernaryPractice {
    public static void main(String[] args) {
        /**
         * write a program ask user their balance if their balance lower than 50.00 give a proper message
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your balance");
        System.out.println((scan.nextDouble() < 50.00) ? "you have enough" : "you don't have enough");

        /**
         * Ask user enter their height if it is more than 5 he can get on the roller coaster
         */
        System.out.println("Please enter your height");
        System.out.println((scan.nextDouble() > 5) ? "you are tall enough" : "you are not tall enough");

        /**
         * generate a random number between 0-50 if number between 10 and 25 return true otherwise print false
         */
        int random = (int) (Math.random() * 51);
        System.out.println((random >= 10 && random <= 25) ? "number is between 10 and 25" : "number is not between 10 and 25");
        System.out.println(".............NEW TASK.............");
        /**
         * ASK USER ENTER NAME IF NAME STARTS WITH A or a you are in the club otherwise you are not in yhe club
         */
        System.out.println("What is your name?");
        String str = scan.nextLine();
        if (str.toLowerCase().startsWith("a")) System.out.println("you are in the club ");
        else System.out.println("you are not in the club");

        //way 2
        System.out.println(str.toLowerCase().startsWith("a")? "you are in the club" : "you are not in the club");
    }

    /**
     * CREATE METHOD FIND ABSOLUTE DIFFERENCE OF 2 INT NUMBERS AND RETURN USE TERNARY
     */
    public static int findAbsOf2(int a, int b) {
        return (a > b) ? a - b : b - a;
    }

    public static String getMiddleCharacter(String str) {
        return (str.length() % 2 == 0) ? "" + str.charAt(str.length() / 2 + 1) + str.charAt(str.length() / 2) : "" + str.charAt(str.length() / 2);
    }
}





