package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = scan.nextInt();
        System.out.println("how many pounds are you?");
        double weight = scan.nextDouble();
        if (age >= 18) {
            System.out.println("you are old enough to drive");
        } else {
            System.out.println("You are not old enough for driving");
        }
            if (weight > 150.0) {
                System.out.println("You are heavier than 150 pounds");
            } else if(weight==150.0) {
                System.out.println("you are 150 pounds");
            }else{
                System.out.println("You are lighter than 150 pounds");
            }



    }
    }