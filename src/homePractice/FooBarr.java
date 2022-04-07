package homePractice;

import java.util.Scanner;

public class FooBarr {
    public static void main(String[] args) {

        /*
        TASK-4
        Write a program that asks user to enter a positive number.
        Print all the number starting from 1 to given number. But, print “Foo” for the
        numbers divided by 2, “Bar” for the numbers divided by 3 and “FooBar” for
        the numbers divided by both 2 and 3.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if(i%6==0) System.out.println("FooBar");
            else if(i%2==0) System.out.println("Foo");
            else if(i%3==0) System.out.println("Bar");
            else System.out.println(i);
        }
    }
}
