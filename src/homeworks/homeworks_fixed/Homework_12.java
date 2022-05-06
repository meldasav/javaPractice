package homeworks.homeworks_fixed;

import java.util.Arrays;
import java.util.Map;

public class Homework_12 {
    public static void main(String[] args) {
        /**-Create a String array that stores cartoon dogs below
         Scooby Doo, Scooby Doo, Blue, Pluto, Dino, Sparky
         -Print the entire array
         -Then, check if it contains Pluto
         if it contains Pluto, then print true
         if it does not contain Pluto, print false
         */
        String[] arr = {"Scooby Doo", "Scooby Doo", "Blue", "Pluto", "Dino", "Sparky"};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, "Pluto") >= 0);
        /**
         * -Create a String array that stores cartoon cats below
         * Garfield, Tom, Sylvester, Azrael
         * -Print the entire array sorted lexicographically
         * -Then, check if it contains Garfield and Felix
         * 	if it contains both, then print true
         * 	if it does not contain both, print false
         */
        String[] cartoon = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(cartoon);
        System.out.println(Arrays.binarySearch(cartoon, "Garfield") >= 0 && Arrays.binarySearch(cartoon, "Felix") >= 0);

        /**
         * Create a char array that stores characters below
         * A, b, G, H, 7, 5, &, *, e, @, 4
         * -Print the entire array
         * -Print the total count of the letters
         * -Print the total count of lowercase letters
         * -Print the total count of uppercase letters
         * -Print the total count of digits
         * -Print the total count of special characters
         */
        char[] chars = {'A', 'b', 'G', 'H', 7, 5, '&', '*', 'e', '@', 4};
        int letter = 0, lowerCase = 0, uppercase = 0, digits = 0, special = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar)) {
                letter++;
                if (Character.isLowerCase(aChar)) lowerCase++;
                else uppercase++;
            } else if (Character.isDigit(aChar)) digits++;
            else special++;
        }
        System.out.println("the total count of the letters " + letter);
        System.out.println("the total count of lowercase letters " + lowerCase);
        System.out.println("the total count of uppercase letters " + uppercase);
        System.out.println("the total count of digits " + digits);
        System.out.println("the total count of special characters " + special);

        /**
         * Create a String array that stores objects below
         * Pen, notebook, Book, paper, bag, pencil, Ruler
         * -Print the entire array
         * -Print how many elements starts with uppercase
         * -Print how many elements starts with lowercase
         * -Print how many elements starts with B or P, ignoring cases
         * -Print how many elements has “book” or “pen” in it, ignoring cases
         */
        String[] supplies = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upperCase = 0, lowerCase1 = 0, bOrp = 0, hasBookOrPen = 0;
        for (String supply : supplies) {
            if (Character.isUpperCase(supply.charAt(0))) upperCase++;
            else if (Character.isLowerCase(supply.charAt(0))) lowerCase1++;
            if (supply.toLowerCase().startsWith("b") || supply.toLowerCase().startsWith("p")) hasBookOrPen++;
            if (supply.toLowerCase().contains("book") || supply.toLowerCase().contains("pen")) bOrp++;
        }
        System.out.println(upperCase + " elements starts with uppercase");
        System.out.println(lowerCase1 + " elements starts with lowercase");
        System.out.println(bOrp + " elements starts with B or P ");
        System.out.println(hasBookOrPen + " elements has “book” or “pen” in it");
        /**
         * -Create an int array that stores numbers below
         * 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
         * -Print the entire array
         * -Print how many elements are more than 10
         * -Print how many elements are less than 10
         * -Print how many elements are 10
         */
        int[] numbers = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        int countMore10 = 0, countLess10 = 0, count10 = 0;
        for (int number : numbers) {
            if (number > 10) countMore10++;
            else if (number < 10) countLess10++;
            else count10++;
        }
        System.out.println(countMore10 + " elements are more than 10");
        System.out.println(countLess10 + " elements are less than 10");
        System.out.println(count10 + " elements are 10");
        /**
         * -Create 2 int arrays that stores numbers below
         * First -> 5, 8, 13, 1, 2
         * Second -> 9, 3, 67, 1, 0
         * -Print both arrays
         * –Then, create a new array called that will take greatest of same index from first 2 arrays
         * -Print third array as well
         */
        int[] num1 = {5, 8, 13, 1, 2};
        int[] num2 = {9, 3, 67, 1, 0};
        int[] num3 = new int[5];
        for (int i = 0; i < num3.length; i++) {
            num3[i] = Math.max(num1[i], num2[i]);
        }
        System.out.println(Arrays.toString(num3));
    }
}