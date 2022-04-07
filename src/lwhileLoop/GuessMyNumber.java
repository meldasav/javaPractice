package lwhileLoop;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;
import java.util.Random;
public class GuessMyNumber {
    public static void main(String[] args) {
        int myNumber = 7;
        int usersNumber = ScannerHelper.getNumberFromUser();
        while (usersNumber != myNumber) {
            usersNumber = ScannerHelper.getNumberFromUser();
        }
        System.out.println("you find the number");


        int random = RandomNumberGenerator.getRandomNumber(1, 10);

        int tries = 0;
        for (int i = 1; random <= 10; i++) {

            int guess = ScannerHelper.getNumberFromUser();
            if (guess == random) {
                System.out.println("you got in " + tries + "attempts");
                i = 10;
            } else if (guess > random) {
                System.out.println("your guess is larger ");
                tries++;
            } else {
                System.out.println("your guess is too small");
                tries++;
            }


            int myNumber1 = 7;

            System.out.println("The random number is = " + myNumber);
            Random random1 = new Random();
            int usersNumber1 = random1.nextInt(10) + 1;

            int attempt = 1;

            while (usersNumber != myNumber) {
                System.out.println("My random attempt number is = " + usersNumber);
                usersNumber = random1.nextInt(10) + 1;
                attempt++;
            }


            System.out.println("Finally you could find the number!");
            System.out.println("You could find it after " + attempt + " times!!!");
        }
    }
}