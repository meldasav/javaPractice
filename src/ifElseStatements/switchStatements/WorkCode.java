package ifElseStatements.switchStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {
        /**
         * write a program ask user which day it is
         * Based on the answer print what color will be selected
         *
         * 1.Monday ->Blue
         * 2.Tuesday->Red
         * 3.Wednesday->Purple
         * 4.Thursday->Yellow
         * 5.Friday->Orange
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter which day it is");
        int day = scan.nextInt();

        if (day == 1) System.out.println("Blue");
        else if (day == 2) System.out.println("Red");
        else if (day == 3) System.out.println("Purple");
        else if (day == 4) System.out.println("Yellow");
        else if (day == 5) System.out.println("Orange");
        else if (day == 6 || day == 7) System.out.println("it is weekend");
        else System.out.println("it is not valid");

        /**
         * WAY 2 SWITCH STATEMENT   you can use with /int /byte/short/enum/boolean/String
         */

        switch (day) {
            case 1:
                System.out.println("Blue");
                break;
            case 2:
                System.out.println("red");
                break;
            case 3:
                System.out.println("purple");
                break;
            case 4:
                System.out.println("Yellow");
                break;
            case 5:
                System.out.println("Orange");
                break;
            case 6:
            case 7:
                System.out.println("it is weekend");
                break;
            default:
                System.out.println("it is not valid");
        }
        /**
         * DAY 1-> MONDAY
         * DAY 2-> TUESDAY
         * DAY 3-> WEDNESDAY
         * DAY 4-> THURSDAY
         * DAY 5-> FRIDAY
         * DAY 6 AND 7 -> WEEKEND
         */
        System.out.println("please enter a day");
        int days = scan.nextInt();

        switch (days) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
            case 7:
                System.out.println("it is weekend");
                break;
            default:
                System.out.println("it is in valid");
        }

        /**
         * char example with switch case
         */

        char character = 'A';

        switch (character) {
            case 65:
                System.out.println("it is a uppercase");
                break;
            case '5':
                System.out.println("it is a digit");
                break;
            case '$':
                System.out.println("it is a special");
                break;
            default:
                System.out.println("it is in valid");
        }


        System.out.println("tell me the greeting for the current time ");
        String greeting = scan.nextLine();

        switch (greeting) {
            case "Good morning":
                System.out.println("it is morning");
                break;
            case "Good afternoon":
                System.out.println("it is afternoon");
                break;
            case "Good evening":
                System.out.println("it is evening");
            default:
                System.out.println("it is in valid");

        }

    }
}

