package exceptions.custom_exceptions;

import java.util.Scanner;

public class Permission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hey user Please enter your age");
        int age = scan.nextInt();
        checkedAge(age);
        try {
            checkedAge(age);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("your age is = " + age);
        }
    }

    /**
     * Create a method that checks the age of user, takes an argument int age
     * if age is more than 16, "it is allowed to have driver licence"
     * if the age is less than 16, the method will throw an exception
     * "Age of {age} is not allowed to have driver licence"
     */
    public static void checkedAge(int age) {
        if (age >= 16) System.out.println("it is allowed to have driver licence");
        else throw new RuntimeException("Age of " + age + " is not allowed to have driver licence");
    }

    public static void checkIn(int day) {
        if (day == 1 || day == 7) System.out.println("user is allowed to check in 10 AM to 3 PM");
        else if (day < 1 || day > 7) throw new RuntimeException("The input does not represent any day!!!");
        else System.out.println("user is allowed to check in from 10 AM to 5 PM");


    }

    /**
     * Create a method that takes an int as an argument to state the day in the week
     * 1 - Sunday
     * 2 - Monday
     * 7 - Saturday
     * method name = checkIn()
     * if it is weekday user is allowed to check in from 10 AM to 5 PM
     * if it is weekend user is allowed to check in 10 AM to 3 PM
     * if the input is not in the range of 1-7, then throw an exception with message
     * "The input does not represent any day!!!"
     */

    public static void checkIn2(int day) {
        switch (day) {
            case 1:
            case 7:
                System.out.println("user is allowed to check in 10 AM to 3 PM");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("user is allowed to check in 10 AM to 5 PM");
                break;
            default:
                throw new RuntimeException("The input does not represent any day!!!");
        }
    }

}

