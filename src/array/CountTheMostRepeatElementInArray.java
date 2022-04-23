package array;

import java.util.ArrayList;
import java.util.Arrays;

public class CountTheMostRepeatElementInArray {

    // TASK-3 - findSecondGreatestAndSmallestWithSort() method
    /**
     * [10,5,6,7,8,5,15,15] before sort
     * [5,5,6,7,8,10,15,15] after sort
     * max=numS[numS.length-1];
     * min=numS[0];
     * for loop start from end to the beginning/max should not be first number
     * print number and break the loop
     * second loop start from beginning to the end /first number should not be first min
     * * print number and break the loop
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] numS) {
        Arrays.sort(numS);
        for (int i = numS.length - 1; i >= 0; i--) {
            if (numS[i] != numS[numS.length - 1]) {
                System.out.println("Second greatest " + numS[i]);
                break;
            }
        }
        for (int i = 0; i < numS.length; i++) {
            if (numS[i] != numS[0]) {
                System.out.println("Second smallest " + numS[i]);
                break;
            }
        }
    }

    /**
     * TASK-4 - findSecondGreatestAndSmallest() method
     * Write a method that takes an int array that has at least one element. Find
     * the second greatest and second smallest elements from the array and print
     * them. DO NOT sort the array and complete task without sorting.
     * Test data:
     * [10, 5, 6, 7, 8, 5, 15, 15]
     * Expected output:
     * Second Smallest = 6
     * Second Greatest = 10
     */

    public static void findSecondGreatestAndSmallest(int[] nums) {
        if (nums.length >= 1) {
            int smallest = Integer.MAX_VALUE;
            int greatest = Integer.MIN_VALUE;
            int secondSmallest = Integer.MAX_VALUE;
            int secondGreatest = Integer.MIN_VALUE;
            for (int element : nums) {
                if (element < smallest) smallest = element;
                if (element > greatest) greatest = element;
            }
            for (int element : nums) {
                if (element < secondSmallest && element != smallest) secondSmallest = element;
                if (element > secondGreatest && element != greatest) secondGreatest = element;

            }
            System.out.println("Second Smallest = " + secondSmallest);
            System.out.println("Second Greatest = " + secondGreatest);
        }
    }

        /**
         *  /*
         *     TASK-6 findMostRepeatedElementInAnArray() method
         *     Write a method that takes a String array. Find the most repeated element
         *     and print it.
         *
         *     Test data:
         *     ["pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"]
         *
         *     Expected output:
         *     pen
         *      */

            public static void findMostRepeatedElementInAnArray(String[] arr){
            String mostCountedWord = "";
            int mostCountedTimes = 0;

            ArrayList<String> countedElements = new ArrayList<>();

            for (int i = 0; i <= arr.length - 1; i++) {
                String word = arr[i];
                int countOfWord = 0;

                if (!countedElements.contains(word)) {
                    for (String w : arr) {
                        if (word.equals(w)) countOfWord++;
                    }

                    if (countOfWord > mostCountedTimes) {
                        mostCountedWord = word;
                        mostCountedTimes = countOfWord;
                    }
                    countedElements.add(word);
                }
            }

            System.out.println(mostCountedWord + " counted " + mostCountedTimes + " times in this array");
        }
    }

