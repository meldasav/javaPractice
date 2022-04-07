package ifElseStatements;

import java.util.Scanner;

public class FindTheSmallestOf2numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Write a program that asks user to enter 2 numbers
Find the smallest and print it

EXAMPLE PROGRAM:
Program: Please enter 2 numbers
User: 5 7

Program: 5


         */
        System.out.println("Please enter 2 numbers!");
        int a = scan.nextInt();
        int b = scan.nextInt();

        if(a < b)System.out.println("The smallest number between " + a + " and " + b + " is : " + a);
        else System.out.println("The smallest number between " + a + " and " + b + " is : " + b);

        System.out.println("End of the program!");

        // int smallestNumber = num1 < num2 ? num1 : num2;  -----> this formula is equivalent to if else
        //int ageKaly =19; int ageKaycee=20;
        //String oldest = ageKaly>agakayce?"KALY :KAYCE



        }
    }
