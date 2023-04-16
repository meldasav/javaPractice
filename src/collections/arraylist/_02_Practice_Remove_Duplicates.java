package collections.arraylist;

import java.util.*;

public class _02_Practice_Remove_Duplicates {
    public static void main(String[] args) {
        int[] arr = {-4, 0, -7, 0, 5, 10, 45, 45};
        findFirstDuplicate((arr));



        List<String> objects = new ArrayList<>();
        objects.add("Cup");
        objects.add("Book");
        objects.add("Pen");
        objects.add("Cup");
        objects.add("Book");
        objects.add("Book");
        objects.add("Pencil");

        List<String> uniques = new ArrayList<>();
        for (String object : objects) {
            if (!uniques.contains(object)) {
                uniques.add(object);
            }
        }
        System.out.println(uniques);

        List<Integer> numbers = new ArrayList<>();
//        TASK-3
//        Print true if the list has 30, 35, 40, 45, 50 as elements
//        false otherwise
//
//        RESULT:
//        false


        List<Integer> elementsToBeChecked = new ArrayList<>();
        elementsToBeChecked.add(30);
        elementsToBeChecked.add(35);
        elementsToBeChecked.add(40);
        elementsToBeChecked.add(45);
        elementsToBeChecked.add(50);


        System.out.println(numbers.containsAll(elementsToBeChecked)); // false
        System.out.println(numbers.contains(30) && numbers.contains(35) && numbers.contains(40) && numbers.contains(45) && numbers.contains(50));// false



        int[] number1 = {-4, -7, 0, 5, 10, 45};


    }

    public static int findFirstDuplicate(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (seen.contains(arr[i])) {
                return arr[i];
            }
            seen.add(arr[i]);
        }

        return -1; // no duplicates found
    }

}

