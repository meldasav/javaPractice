package homePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Mock3Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(add3(new int[]{1, 2, 3,})));
        System.out.println(Arrays.toString(subtract5(new int[]{10, 15, 20,})));
        System.out.println(findMax((new ArrayList<>(Arrays.asList(10, 15, 20)))));
        System.out.println(findMax1((new ArrayList<>(Arrays.asList(10, 15, 20)))));
        System.out.println(findMin2(new ArrayList<>(Arrays.asList(5, 3, 9))));
        System.out.println(findDigitSum1("Melda1983"));
        System.out.println(findDigitSum2("Melda1983"));
    }

    /**
     * Write a public static method that takes an int array as an
     * argument and returns an int array.
     * -The method should add 3 to each element and return it
     * back.
     * -Method name can be called as add3
     */

    public static int[] add3(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] += 3;
        }
        return numbers;
    }

    /**
     * Write a public static method that takes an int array as an
     * argument and returns an int array.
     * -The method should subtract 5 from each element and
     * return it back.
     * -Method name can be called as subtract5
     */

    public static int[] subtract5(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] -= 5;
        }
        return numbers;
    }

    /**
     * Write a public static method that takes an int array as an
     * argument and returns an int array.
     * -The method should multiply each element with 2 and return
     * it back.
     * -Method name can be called as multiply2
     */

    public static int[] multiply2(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= 2;
        }
        return numbers;
    }

    /**
     * -Write a public static method that takes an Integer ArrayList
     * as an argument and returns an int.
     * -The method should find the max value from the list and
     * return it.
     * -Method name can be called as findMax
     */

    public static int findMax(ArrayList<Integer> numbers) {
        TreeSet<Integer> number = new TreeSet<>();
        for (int integer : numbers) number.add(integer);
        return number.last();
    }

    //2.way
    public static int findMax1(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer number : numbers) {
            if (number > max) max = number;
        }
        return max;
    }

    /**
     * Write a public static method that takes an Integer ArrayList
     * as an argument and returns an int.
     * -The method should find the min value from the list and return it.
     * -Method name can be called as findMin
     */
    public static int findMin1(ArrayList<Integer> numbers) {
        int min = Integer.MAX_VALUE;
        for (Integer number : numbers) {
            if (number < min) min = number;
        }
        return min;
    }

    public static int findMin2(ArrayList<Integer> numbers) {
        TreeSet<Integer> number = new TreeSet<>();
        for (Integer integer : numbers) number.add(integer);
        return number.first();
    }

    /**
     * Write a public static method that takes a String as an
     * argument and returns an int.
     * -The method should find the soMe of all digits in the String
     * and return it back.
     * -Method name can be called as findDigitSum
     */
    public static int findDigitSum1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static int findDigitSum2(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c + "");
            }
        }
        return sum;
    }
}



