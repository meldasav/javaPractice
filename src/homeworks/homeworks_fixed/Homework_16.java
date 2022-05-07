package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Homework_16 {
    public static void main(String[] args) {
        System.out.println(countWords("      Java is fun       "));
        System.out.println("<<<<<<<<<TASK2>>>>>>>>");
        System.out.println(countA("MELDasavA"));
        System.out.println(countPos(new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67))));
        System.out.println(removeDuplicateNumbers(new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60))));
        System.out.println(removeDuplicateElements(new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"))));
        System.out.println(removeExtraSpaces("     java              is          fun     "));
    }

    /**
     * Write a method countWords() that takes a String as an argument,
     * and returns how many words there are in the given String
     */
    public static int countWords(String str) {
        int count = 1;
        str = str.trim();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') count++;
        }
        return count;
    }

    /**
     * Write a method countA() that takes a String as an argument,
     * and returns how many A or a there are in the given String
     */
    public static int countA(String str) {
        int countA = 0;
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') countA++;
        }
        return countA;
    }

    /**
     * Write a method countPos() that takes an ArrayList of Integer as an argument,
     * and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> number) {
        int countPos = 0;
        for (Integer integer : number) {
            if (integer > 0) countPos++;
        }
        return countPos;
    }

    /**
     * Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
     * and returns it back with removed duplicates
     */
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(numbers);
        return new ArrayList<>(set);
    }

    /**
     * Write a method removeDuplicateElements() that takes an ArrayList of String as an argument,
     * and returns it back with removed duplicates
     */
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> str) {
        LinkedHashSet<String> set = new LinkedHashSet<>(str);
        return new ArrayList<>(set);
    }

    /**
     * Write a method removeExtraSpaces() that takes a String as an argument,
     * and returns a String with removed extra spaces
     */
    public static String removeExtraSpaces(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.trim().split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * Write a method add() that takes 2 int[] arrays as arguments
     * and returns a new array with sum of given arrays elements.
     *
     * @return
     */
    public static int[] add(int[] num1, int[] num2) {
        int sum = 0;
        for (int i = 0; i < Math.min(num1.length, num2.length); i++) {
            if (num1.length > num2.length) num1[i] += num2[i];
            else num2[i] += num1[i];
        }
        return num1.length > num2.length ? num1 : num2;
    }

    /**
     * Write a method findClosestTo10() that takes an int[] array as an argument,
     * and returns the closest element to 10 from given array
     * Test data 1:
     * int[] numbers = {10, -13, 5, 70, 15, 57};
     * Expected output 1:
     * 5
     */
    public static int findClosestTo10(int[] numbers) {
        Arrays.sort(numbers);
        int leftClosest = Integer.MIN_VALUE;
        int rightClosest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < 10 && number > leftClosest) leftClosest = number;
            else if (number > 10 && number < rightClosest) rightClosest = number;
        }
        if (10 - leftClosest <= rightClosest - 10) return leftClosest;
        return rightClosest;
    }

}
