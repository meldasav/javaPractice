package loops.whileLoop;

import utilities.ScannerHelper;

import java.util.Random;

public class GuessMyNumber {
    public static void main(String[] args) throws InterruptedException {
//        int myNumber = 7;
//        int userNumber = ScannerHelper.getNumberFromUser();
//        while (myNumber != userNumber) {
//            userNumber = ScannerHelper.getNumberFromUser();
//        }
//        System.out.println("finally you find the number !");
//
//        Random random = new Random();
//        int usersNumber = random.nextInt(10) + 1;
//
//        int attempt = 1;
//        while (myNumber != userNumber) {
//            usersNumber = random.nextInt(10) + 1;
//            attempt++;
//        }
//
//        System.out.println("Finally you could find the number!");
//        System.out.println("you could find it after " + attempt);


        int count = 1;
        while (count < 3) {
            for (int i = 0; i < 2; i++) {
                System.out.println("hello");
                Thread.sleep(3000);
            }

        count++;
        }
    }
}