package homePractice;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

public class Project5Helper {
    public static void main(String[] args) {
        //TASK7
         /*
        Write a program that generates 2 random numbers between 0 and 25 (0 and
        25 are included), Then print all numbers between 2 random numbers that
        cannot be divided by 5 in ascending order.

        Test data:
        int randomNumber1 = 12;
        int randomNumber1 = 4;
        Expected output:
        4 – 6 – 7 – 8 – 9 – 11 - 12
        Expected output: for 5 and 5
         */
        //How to generate random numbers
        ;
        int num1= RandomNumberGenerator.getRandomNumber(0,25); // 0-25
        int num2= RandomNumberGenerator.getRandomNumber(0,25);
        System.out.println("Random number 1 = " + num1);
        System.out.println("Random number 2 = " + num2);
        System.out.println("\nNumbers printed in ascending order\n");
        /*
        FIRST WAY
        if(num1 > num2){
            for (int i = num2; i <= num1; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }
        else{
            for (int i = num1; i <= num2; i++) {
                if(i % 5 != 0) System.out.println(i);
            }
        }

        /*
        SECOND WAY
        for(int i = minNumber; i <= maxNumber; i++){
            if(i % 5 != 0) System.out.println(i);
        }
         */
        String s = "";
        for(int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++){
            if(i % 5 != 0) s += i + " - ";
        }
        if(!s.isEmpty()) System.out.println(s.substring(0, s.length()-3));
        else System.out.println(s);

         /*
        Write a program that asks user to enter a String, and swaps first and last 4
        characters of this String and print the modified String

        Test data:
        TechGlobal   -> Tech + Gl + obal   -> obalGlTech

        Expected output:
        obalGlTech

        NOTE: Write a program that handles any String
        NOTE: First check if the length of String is at least 8, if the String's length is
        less than 8, then print message "This String does not have 8 characters"
         */
        String word = ScannerHelper.getStringFromUser(); //ab
        if(word.length() < 8){
            System.out.println("This String does not have 8 characters");
        }
        else{
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);
            System.out.println(last4 + middle + first4);
        }
        //Above if-else code can also be written as below
        /*
        if(word.length() >= 8){
            String first4 = word.substring(0, 4);
            String last4 = word.substring(word.length()-4);
            String middle = word.substring(4, word.length()-4);
            System.out.println(last4 + middle + first4);
        }
        else{
            System.out.println("This String does not have 8 characters");
        }
         */
    }
}
