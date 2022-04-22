package projects;

import java.util.Scanner;

public class Project03 {
    public static void main(String[] args) {
        //TASK -1
        String s1 = "24", s2 = "5";

        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);

        System.out.println("The sum of 24 and 5 = " + (number1 + number2));
        System.out.println("The subtraction of 24 and 5 = " + (number1 - number2));
        System.out.println("The division of 24 and 5 = " + ((double) number1 / number2));
        System.out.println("The multiplication of 24 and 5  = " + (number1 * number2));
        System.out.println("The remainder of 24 and 5 = " + (number1 % number2) + "\n");

        //TASK -2
        int random = (int) (Math.random() * 35) + 1;
        System.out.println("Random number = " + random);
        if (random == 2 || random == 3 || random == 5 || random == 7 ||
                random == 11 || random == 13 || random == 17 || random == 19
                || random == 23 || random == 29 || random == 31) {
            System.out.println("THE NUMBER IS A PRIME NUMBER");
        } else {
            System.out.println("THE NUMBER IS NOT A PRIME NUMBER" + "\n");
        }
        //TASK -3
        int random1 = (int) (Math.random() * 50) + 1;
        int random2 = (int) (Math.random() * 50) + 1;
        int random3 = (int) (Math.random() * 50) + 1;
        System.out.println("Random number 1 = " + random1);
        System.out.println("Random number 2 = " + random2);
        System.out.println("Random number 3 = " + random3 + "\n");
        int maxNumber = Math.max(Math.max(random1, random2), random3);
        int minNumber = Math.min(Math.min(random1, random2), random3);
        int mid, min, max;
        if (random1 != maxNumber && random1 != minNumber) {
            min = random1;
        } else if (random2 != maxNumber && random2 != minNumber) {
            min = random2;
        } else {
            min = random3;
            System.out.println();
        }
        System.out.println("Lowest number is = " + minNumber);
        System.out.println("Middle number is = " + min);
        System.out.println("Greatest number is = " + maxNumber + "\n");

        // TASK 4
        char myCharacter = 'a';
        // int myChar = myCharacter;
        if (myCharacter >= 65 && myCharacter <= 90) {
            System.out.println("The letter is uppercase");
        } else if (myCharacter >= 97 && myCharacter <= 122) {
            System.out.println("The letter is lowercase");
        } else {
            System.out.println("Invalid character detected!!!" + "\n");
        }


        //TASK 5
        char c = 'm';

        if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) {
            if (c == 'a' || c == 'e' || c == 'I' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
                System.out.println("the letter is vowel");
            else System.out.println("the letter is consonant");
        } else System.out.println("Invalid character detected!!");

        //TASK 6
        char givenCharacter = '9';
        if (!(givenCharacter >= 65 && givenCharacter <= 90) && !(givenCharacter >= 97 && givenCharacter <= 122) && !(givenCharacter >= 48 && givenCharacter <= 57)) {
            System.out.println("it is a special character");
        }
        if ((givenCharacter >= 65 && givenCharacter <= 90) || (givenCharacter >= 97 && givenCharacter <= 122) || (givenCharacter >= 48 && givenCharacter <= 57)) {
            System.out.println("Invalid character detected!!!");
        } else System.out.println("Special character is = " + givenCharacter);
        // TASK 7
        char givenCharacter1 = '$';
        if ((givenCharacter1 >= 65 && givenCharacter1 <= 90) || (givenCharacter1 >= 97 && givenCharacter1 <= 122))
            System.out.println("Character is a letter");
        if (givenCharacter1 >= 48 && givenCharacter1 <= 57) System.out.println("Character is a digit");
        else System.out.println("Character is a special character");
    }
}

