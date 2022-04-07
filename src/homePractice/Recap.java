package homePractice;

import java.util.Scanner;

public class Recap {
    public static void main(String[] args) {



//        double myBalance = 100.00;
//        System.out.println("what is the first transaction?");
//        double first = scan.nextDouble();
//
//        System.out.println("what is the second transaction?");
//        double second = scan.nextDouble();
//
//        System.out.println("what is the third transaction?");
//        double third = scan.nextDouble();
//
//        double myBalance1 = myBalance - first;


//
//        System.out.println("What is the first number?");
//        double first = scan.nextDouble();
//
//        System.out.println("What is the second number?");
//        double second = scan.nextDouble();
//
//        System.out.println("The sum of the given numbers is = " + (first+second) + "\n" +
//                "The product of the given numbers is = " + (first*second) + "\n" +
//                "The subtraction of the given numbers is = " + (first-second) + "\n" +
//                "The division of the given numbers is = " + (first/second) + "\n" +
//                "The remainder of the given numbers is = " + (first%second));

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number a number?");
        int num1 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num2 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num3 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num4 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num5 = scan.nextInt();
        int maxOf5 = Math.max(num1, Math.max(Math.max(num2, num3), Math.max(num4, num5)));
        int minOf5=Math.min(num1,Math.min(Math.min(num2, num3), Math.min(num4, num5)));
        System.out.println("Max value = " +maxOf5);
        System.out.println("Min value = " +minOf5);
    }
}