package homePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Count_How_Many_A {
    public static void main(String[] args) {
        System.out.println(countA1("Mock is sunday MELDA"));
        System.out.println(countPos(new ArrayList(Arrays.asList(1, -3, 4, -1, -2, 9))));
        System.out.println(countPrime(new int[]{-3, 5, 1, 4, 0, 11,8, 2,3}));
        System.out.println(removeDuplicateNumbers(new ArrayList(Arrays.asList(1, -3, 4, 1, -2, 9))));
        System.out.println(countPrime(new int[]{1,2,11,13,17,0}));
    }

    public static int countA(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'a') count++;
        }
        return count;
    }

    public static int countA1(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'a') count++;
        }
        return count;
    }

    /**
     * TASK 3
     * Write a method countPos() that takes an ArrayList of Integer as an argument,
     * and returns how many elements are positive
     */
    public static int countPos(ArrayList<Integer> numbers) {
        int countPos = 0;
        for (Integer number : numbers) {
            if (number > 0) countPos++;
        }
        return countPos;
    }

    /**
     * Write a method removeDuplicateNumbers() that takes an ArrayList of Integer as an argument,
     * and returns it back with removed duplicates
     */

    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer number : numbers) {
            if (!myList.contains(number)) myList.add(number);
        }
        return myList;
    }

    //2.way
    //   TreeSet<Integer> number=new TreeSet<>(numbers);
    //   return new ArrayList<>(number);
    // 3.way
    //  return new ArrayList<>(new TreeSet<>(numbers));

    public static Integer[] removeDup(int[] array) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i : array) numbers.add(i);
        return numbers.toArray(new Integer[0]);

    }

    public static Integer[] removeDup1(int[] array) {
        HashSet<Integer> numbers = new HashSet<>();
        for (Integer integer : array) numbers.add(integer);
        return numbers.toArray(new Integer[0]);

    }

    public static int countPrime(int[] array) {
        int countPrime = 0;
        for (int number : array) {
           if ( number>1 && number % 2 != 0 || number ==2 ) countPrime++;
        }
        return countPrime;

    }

}


