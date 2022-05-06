package homeworks.homeworks_fixed;

import java.io.FileWriter;
import java.util.Scanner;

public class Homework_11 {
    public static void main(String[] args) {
        /**
         * Write a program that prints all the numbers that are dividable by 7
         * starting from 1 to 100 (1 and 100 are included)
         */
        StringBuilder str = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) str.append(i).append("-");
        }
        System.out.println(str.substring(0, str.length() - 1));

        /**
         * Write a program that prints all the numbers that are
         * dividable by both 2 and 3 starting from 1 to 50 (1 and 50 are included)
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) sb.append(i).append("-");
        }
        System.out.println(sb.substring(0, sb.length() - 1));

        /**
         * Write a program that prints all the numbers that are dividable by
         * 5 starting from 100 to 50 (100 and 50 are included)
         */
        StringBuilder sb1 = new StringBuilder();
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) sb1.append(i).append("-");
        }
        System.out.println(sb1.substring(0, sb.length() - 2));
        /**
         * Write a program that prints the squares
         * of all numbers starting from 0 to 7 (0 and 7 are included)
         */
        for (int i = 0; i <= 7; i++) {
            System.out.println("square number " + i + " = " + i * i);
        }
        /**
         * Write a program that finds sum of the numbers starting from 1 to 10
         * Calculation => 1+2+3+4+5+6+7+8+9+10
         */
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        /**
         * Write a program that asks user to enter a positive number
         * And find the factorial of the number
         * 0! = 1
         * 1! = 1
         * 2! = 1*2 = 2
         * 3! = 1*2*3 = 6
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");
        int num = scan.nextInt();
        int fac = 1;
        for (int i = num; i > 0; i--) {
            fac *= i;
        }
        System.out.println(fac);

        /**
         * Write a program that asks user to enter their first and last name
         * And count how many vowel letters they have in their first and last name
         * Vowel letters = a, e, i, o, u
         */
        System.out.println("please enter your name");
        String name = scan.nextLine();
        name = name.toLowerCase();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                count++;
            }
        }
        System.out.println(count);
        /**
         * Write a program that asks user to enter a number
         * If number is less than 100, then ask user to enter another number and find sum of entered 2 numbers.
         * Keep asking user to enter numbers until the sum of all entered numbers is at least 100.
         * If first number entered by user more than or equal to 100, print message
         * “This number is already more than 100” and do not ask user to enter any other numbers
         */
        int num1 = 0;
        int sum1 = 0;
        int attempt = 1;

        do {
            System.out.println("please enter a number");
            num1 = scan.nextInt();
            if (attempt == 1 && num1 >= 100) {
                System.out.println("this number more than 100");
                break;
            } else {
                sum1 += num1;
                if (sum1 >= 100) {
                    System.out.println("sum of the numbers at least 100");
                }
            }
            attempt++;
        } while (sum1 < 100);

        /**
         * Assume that you are given a number and you are asked to find series of Fibonacci numbers
         * What is Fibonacci numbers: a series of numbers in which each number
         * ( Fibonacci number ) is the sum of the two preceding numbers
         * It always starts with 0 and 1
         * EX: 0, 1, 1, 2, 3, 5, 8, 13, 21
         */
        int n1 = 0, n2 = 1, n3 = 0;
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            sb2.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb2.substring(0, sb2.length() - 1));

        /**
         * Write a program that asks user to enter a name
         * If name starts with j or J, then finish the program
         * But, if the name does not start with j or J, then keep asking until
         * user gives a name that starts with j or J.
         */
        String firstName = "";
        do {
            System.out.println("please enter your name");
            firstName = scan.nextLine();

        } while (!firstName.toLowerCase().startsWith("j"));
        System.out.println("end of the program");

    }
}


