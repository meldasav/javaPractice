package homePractice;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Locale;
import java.util.Scanner;

public class PracticeProject {
    public static void main(String[] args) {

//        String str1= ScannerHelper.getStringFromUser();
//        String lastFour=str1.substring(4);
//        String st2=str1.substring(0,(str1.length()-lastFour.length()));
//        System.out.println(st2);
//        System.out.println(lastFour+st2);

//        if (nameTask4.length() < 2) {
//            System.out.println("Invalid input");
//        }
//         else if (nameTask4.length() % 2 == 0) {
//           System.out.println("" + nameTask4.charAt(nameTask4.length() / 2 - 1) + nameTask4.charAt(nameTask4.length() / 2));
//
//        } else if(nameTask4.length() % 2 == 1) {
//            System.out.println("" + nameTask4.charAt(nameTask4.length() / 2));

        //  }
//        String country=ScannerHelper.getCountryFromUser();
//        if (country.length() > 5) {
//            //  System.out.println(country.substring(country.charAt(0) + 1) + (country.length() - 2));
//            System.out.println(country.substring(2,country.length()-2));
//        } else {
//            System.out.println("Invalid input");
//        }
        String sentence = ScannerHelper.getStringFromUser();

        char space = ' ';
        int spaceCount = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (space == sentence.charAt(i)) {
                ++spaceCount;
                String lastWord=sentence.substring(sentence.indexOf(spaceCount+1));
                //String lastWord = sentence.substring(sentence.indexOf(" ") + 1);
                String firstWord = sentence.substring(0, sentence.indexOf(" "));
                System.out.println(lastWord + " " + firstWord);
            }else {

                System.out.println("This sentence does not have 2 or more words to swap");

            }
        /*
        String metin = "Merhaba dünya bu java örnekleri";
        char karakter = 'e';
        int tane = 0;

        for(int i = 0; i < metin.length(); i++) {
            if(karakter == metin.charAt(i)) {
                ++tane;
         */


        }


    }


}