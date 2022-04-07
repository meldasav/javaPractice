package homePractice;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class PracticeStringToptoBottom {
    public static void main(String[] args) {
//        String fullName = "Melda SAV";
//        for (int i = 0; i < fullName.length(); i++) {
//            System.out.println(fullName.charAt(i));
//        }
//        String str = "TechGlobal School";
//        int strAll=str.length();
//        String rep=str.replace("o","");
//        int afterRep=rep.length();
//        System.out.println(strAll-afterRep);
//
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
//        }
//        int number = 1;
//        while (number <= 5) {
//            System.out.println(number);
//            number++;
//        }


        }
    }

}