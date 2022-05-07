package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Project_07 {
    public static void main(String[] args) {
        findGreatestAndSmallestWithSort(new int[]{1, 2, 3, 4});
        findGreatestAndSmallest(new int[]{10, 7, 7, 10 - 3, 10, -3});
        findSecondGreatestAndSmallestWithSort(new int[]{10, 5, 6, 7, 8, 5, 15, 15});
        findDuplicatedElementsInAnArray(new String[]{"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"});
        findMostRepeatedElementInAnArray(new String[]{"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"});
    }

    /**
     * TASK-1 - findGreatestAndSmallestWithSort() method
     * Write a method that takes an int array that has at least one element.
     * Find the greatest and smallest elements from the array and print them. Complete task using sort() method.
     * Test data:
     * [10, 7, 7, 10 -3, 10, -3]
     * Expected output:
     * Smallest = -3
     * Greatest = 10
     *
     * @return
     */
    public static void findGreatestAndSmallestWithSort(int[] number) {
        if (number.length >= 1) {
            Arrays.sort(number);
            System.out.println("Smallest number " + number[0]);
            System.out.println("Greatest number " + number[number.length - 1]);

        }
    }

    /**
     * TASK-2 findGreatestAndSmallest() method
     * Write a method that takes an int array that has at least one element.
     * Find the greatest and smallest elements from the array and print them.
     * DO NOT sort the array and complete task without sorting.
     * Test data:
     * [10, 7, 7, 10 -3, 10, -3]
     * Expected output:
     * Smallest = -3
     * Greatest = 10
     */
    public static void findGreatestAndSmallest(int[] number) {
        TreeSet<Integer> numS = new TreeSet<>();
        for (int i : number) numS.add(i);
        System.out.println("smallest elements " + numS.first());
        System.out.println("the greatest " + numS.last());

    }

    /**
     * TASK-3 - findSecondGreatestAndSmallestWithSort() method
     * Write a method that takes an int array that has at least one element.
     * Find the second greatest and second Smallest elements from the array and print them.
     * Complete task using sort() method.
     * Test data:
     * [10, 5, 6, 7, 8, 5, 15, 15]
     * Expected output:
     * Second Smallest = 6
     * Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallestWithSort(int[] number) {
        if (number.length >= 1) {
            TreeSet<Integer> numbers = new TreeSet<>();
            for (Integer i : number) numbers.add(i);
            ArrayList<Integer> num = new ArrayList<>(numbers);
            System.out.println("second smallest " + num.get(1));
            System.out.println("second biggest " + num.get(num.size() - 2));
        }
    }

    /**
     * TASK-4 - findSecondGreatestAndSmallest() method
     * Write a method that takes an int array that has at least one element.
     * Find the second greatest and second smallest elements from the array and print them.
     * DO NOT sort the array and complete task without sorting.
     * Test data:
     * [10, 5, 6, 7, 8, 5, 15, 15]
     * Expected output:
     * Second Smallest = 6
     * Second Greatest = 10
     */
    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > max) number = max;
        }
        for (int number : numbers) {
            if (number != max && number > secondMax) secondMax = number;
        }
        for (int number : numbers) {
            if (number < min) min = number;
        }
        for (int number : numbers) {
            if (number != min && number < secondMin) secondMin = number;
        }
        System.out.println("Second smallest " + secondMin);
        System.out.println("Second greatest " + secondMax);
    }

    /**
     * TASK-5 - findDuplicatedElementsInAnArray() method
     * Write a method that takes a String array. Find all duplicated elements and print them.
     * NOTE: It is case-sensitive!
     * Test data:
     * [“foo”, “bar”, “Foo”, “bar”, “6”, “abc”, “6”, “xyz”]
     * Expected output:
     * bar
     * 6
     */
    public static void findDuplicatedElementsInAnArray(String[] array) {
        StringBuilder dup = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) && !dup.toString().contains(array[i])) {
                    dup.append("\n").append(array[i]).append(" ");
                }
            }
        }
        System.out.println(dup);
    }

    /**
     * TASK-6 findMostRepeatedElementInAnArray() method
     * Write a method that takes a String array. Find the most repeated element and print it.
     * [“pen”, “eraser”, “pencil”, “pen”, “123”, “abc”, “pen”, “eraser”]
     */
    public static void findMostRepeatedElementInAnArray(String[] array) {
        String str = "";
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            String mostRepeated = array[i];
            int mostCounted = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i].equals(array[j])) mostCounted++;
            }
            if (mostCounted > count) {
                str = mostRepeated;
                count = mostCounted;
            }
        }
        System.out.println(str);
    }
}

