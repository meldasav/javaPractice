package swichStatements;

import java.util.Scanner;

public class WorkCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("please enter which day it is (1 to 5 ");
//        int nb1 = scan.nextInt();
//        if (nb1 == 1) {
//            System.out.println("blue");
//        } else if (nb1 == 2) {
//            System.out.println("red");
//        } else if (nb1 == 3) {
//            System.out.println("purple");
//        } else if (nb1 == 3) {
//            System.out.println("yellow");
//        } else if (nb1 == 4) {
//            System.out.println("orange");
//        }else if (nb1 == 5) {
//            System.out.println("it is weekend");
//        }

//        int random=(int)(Math.random()*10);
//        int random1=(int)(Math.random()*10);
//        System.out.println(random);
//        System.out.println(random1);
//        if(random>random1){
//            System.out.println("the greatest of " + random + "and" + random1 + " is " + random );
//
//        }
//        else{
//            System.out.println("the greatest of " + random + "and" + random1 + " is " + random1);
//        }


//        char myCharacter = 'K';
//        int myChar = myCharacter;
//        if (myChar >= 65 && myChar <= 90) {
//            System.out.println("The letter is uppercase");
//        } else if (myChar >= 97 && myChar <= 122) {
//            System.out.println("The letter is lowercase");
//        } else {
//            System.out.println("Invalid character detected!!!");
//        }

        char character='A';

            switch(character){
                case'A':
                    System.out.println("it is upper case and is the first letter in the alphabet");
                    break;
                case '5':
                    System.out.println("it is a digit");
                    break;
                case '$':
                    System.out.println("it is a dollar sign");
                break;
                default:
                    System.out.println("it is not A,5 or $ ");


            }

    }


}