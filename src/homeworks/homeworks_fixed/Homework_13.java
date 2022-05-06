package homeworks.homeworks_fixed;

import java.util.Arrays;

public class Homework_13 {
    public static void main(String[] args) {
        /**
         * Write a program that prints all the numbers from 1 to 10 (1 and 10 are included)
         *
         * If the number is dividable by 2, then print “Foo” instead of number itself
         * If the number is dividable by 5, then print “Bar” instead of number itself
         * If the number is dividable by both 2 and 5, then print “FooBar” instead of number itself
         * Else print number itself
         */
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 5 == 0) System.out.println("Bar");
            else if (i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }
        /**
         Write a program to find the first positive and negative numbers in an int array
         */
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        boolean isPos = false;
        boolean isNe = false;
        for (int number : numbers) {
            if (number > 0 && !isPos) {
                System.out.println("First positive number is " + number);
                isPos = true;
            } else if (number < 0 && !isNe) {
                System.out.println("First negative number is " + number);
                isNe = true;
            }
        }
        if (!isPos) System.out.println("Positive number was not found");
        if (!isNe) System.out.println("Negative number was not found");
        /**
         * Write a program to generate 5 random numbers between 1 to 10 (1 and 10 are included) and store those numbers in an int array.
         * Check if int array contains 2 or 3 as elements
         * If it contains 2 or 3, then return true
         * If it does not contain either 2 or 3, then return false
         */
        int num1 = (int) (Math.random() * 10) + 1;
        int num2 = (int) (Math.random() * 10) + 1;
        int num3 = (int) (Math.random() * 10) + 1;
        int num4 = (int) (Math.random() * 10) + 1;
        int num5 = (int) (Math.random() * 10) + 1;

        int[] numS = {num1, num2, num3, num4, num5};
        Arrays.sort(numS);
        System.out.println(Arrays.toString(numS));
        System.out.println(Arrays.binarySearch(numS, 2) >= 0 || Arrays.binarySearch(numS, 3) >= 0);

        /**
         * Write a program to find if String array contains “apple” as an element, ignore cases.
         */
        String[] list = {"banana", "orange", "Apple"};
        System.out.println(Arrays.toString(list).toLowerCase().contains("apple"));
        /**
         * Write a program to find the all-matching elements between 2  int arrays
         */
        int[] numbers1 = {10, 20, 30, 50, 70};
        int[] numbers2 = {20, 50, 70, 100, 300};
        boolean duplicates = false;
        for (int i = 0; i < numbers1.length; i++) {
            for (int j = 0; j < numbers2.length; j++) {
                if (numbers1[i] == numbers2[j]) {
                    System.out.println(numbers1[i]);
                    duplicates = true;
                    break;
                }
            }
        }
        if (!duplicates) System.out.println("There is no matching numbers");
        /**
         * Write a program to print duplicated characters in a String, ignore cases
         * */
        String str = "baNana";
        StringBuilder dup = new StringBuilder();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j) &&
                        !dup.toString().contains(str.toLowerCase().substring(i, i + 1))) {
                    dup.append(str.charAt(i));
                    System.out.println(str.charAt(i));
                    break;
                }
            }

        }


    }
}

