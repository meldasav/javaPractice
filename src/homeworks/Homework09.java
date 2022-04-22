package homeworks;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Homework09 {
    public static void main(String[] args) {

        //TASK1//
        String name = ScannerHelper.getNameFromUser();
        System.out.println("The length of the name is = " + name.length());
        System.out.println("The first character in the name is = " + name.charAt(0));
        System.out.println("The last characters in the name is = " + (name.charAt(name.length() - 1)));
        System.out.println("The first 3 characters in the name are = " + name.substring(0, 3));
        System.out.println("The last 3 characters in the name are = " + name.substring(name.length() - 3));
        System.out.println(name.startsWith("A") || name.startsWith("a") ? "You are in the club!" : "Sorry, you are not in the club");

        //TASK2//
        String address = ScannerHelper.getAddressFromUser();
        if (address.toUpperCase().contains("CHICAGO")) System.out.println("You are in the club");
        else if (address.toUpperCase().contains("DES PLAINES"))
            System.out.println("You are welcome to join to the club");
        else System.out.println("Sorry, you will never be in the club");


        //TASk 3//
        String colors = ScannerHelper.getColorFromUser().toLowerCase() + ",";
        colors += ScannerHelper.getColorFromUser().toLowerCase() + ",";
        colors += ScannerHelper.getColorFromUser().toLowerCase() + ",";
        colors += ScannerHelper.getColorFromUser().toLowerCase();
        System.out.println("Selected colors : " + colors);
        String favoriteColor1 = "red";
        String favoriteColor2 = "green";


        // green and red
        if (colors.contains(favoriteColor1) && colors.contains(favoriteColor2)) System.out.println("Green and red are in the list");
            //  green
        else if (colors.contains(favoriteColor2)) System.out.println("Green is in the list");
            //red
        else if (colors.contains(favoriteColor1)) System.out.println("Red is in the list");
        else System.out.println("Green and red are not in the list");


        /**
         * 2.way
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user! Please enter 4 colors");
        String colorS = scanner.nextLine().toLowerCase();

        if (!colorS.isEmpty()) {
            //Check if it has green or red or both
            if (colorS.contains("red") && colorS.contains("green")) {
                System.out.println("Green and red are in the list");
            } else if (!colorS.contains("red") || !colorS.contains("green")) {
                System.out.println("Green and red are not in the list");
            } else if (colorS.contains("green")) {
                System.out.println("Green is in the list");
            } else {
                System.out.println("Red is in the list");
            }
        } else {
            System.out.println("Well, you did not enter some colors");


            String str = "   Java is FUN   ";
            String str1 = str.trim().toLowerCase();

            System.out.println("The first word in the str is = " + str1.substring(0, str1.indexOf(' ')));
            System.out.println("The second word in the str is = " + str1.substring(str1.indexOf(' ') + 1, str1.lastIndexOf(' ')));
            System.out.println("The third word in the str is = " + str1.substring(str1.lastIndexOf(' ') + 1));


        }


    }


}
