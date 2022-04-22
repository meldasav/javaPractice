package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //if the number dividable by 10 ask user enter a number

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scan.nextInt();
        if(number%10==0) System.out.println("The number you entered is dividable by 10");
        else System.out.println("The number you entered is not dividable by 10");

        }

    }

