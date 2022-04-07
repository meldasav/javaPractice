package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {

         /*
        Write a Java program that asks user to enter 2 different integers
        between 0 to 10 ( 0 and 10 are included)
        Print all the numbers between given 2 integers starting
        from smallest to biggest (given numbers are included)
        HOWEVER, do not print the number of 5

          */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = input.nextInt();

        System.out.println("Please enter number 2");
        int num2 = input.nextInt();


        //First way - without continue
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i != 5) System.out.println(i);
        }

        //Second way - using continue
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if(i == 5) continue;
            System.out.println(i);



        }



    }
}
