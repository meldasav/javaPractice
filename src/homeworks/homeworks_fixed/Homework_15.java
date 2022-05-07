package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_15 {
    public static void main(String[] args) {
        /**
         * Create an ArrayList and store below objects
         * Desk, Laptop, Mouse, Monitor, Mouse-Pad, Adapter
         * -Print the entire list
         * -Print the entire list sorted lexicographically
         * -Count objects that starts with M or m
         * -Count objects that does not have A or a or E or e
         */
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        int countStartWithM = (int) list.stream().filter(x -> x.toLowerCase().startsWith("m")).count();
        System.out.println(countStartWithM);
        int countDoesNotHave = (int) list.stream().filter(x -> !x.toLowerCase().startsWith("a")).filter(x -> !x.toLowerCase().startsWith("e")).count();
        System.out.println(countDoesNotHave);
        /**
         * Create an ArrayList and store below kitchen objects
         * Plate, spoon, fork, Knife, cup, Mixer
         * -Print the entire list-
         * -Print how many elements starts with uppercase
         * -Print how many elements starts with lowercase
         * -Print how many elements has P or p
         * -Print how many elements starts or ends with P or p
         */
        ArrayList<String> itemS = new ArrayList<>(Arrays.asList("Plate", "spoon", " fork", " Knife", "cup", " Mixer"));
        int uppercase = 0, lowercase = 0, haspOrP = 0, endsWithP = 0;
        for (String item : itemS) {
            if (Character.isUpperCase(item.charAt(0))) uppercase++;
            else lowercase++;
            if (item.toLowerCase().contains("p")) haspOrP++;
            if (item.toLowerCase().startsWith("p") || item.toLowerCase().endsWith("p")) endsWithP++;
        }
        System.out.println(uppercase + " elements starts with uppercase");
        System.out.println(lowercase + " elements starts with lowercase");
        System.out.println(haspOrP + " elements has P or p");
        System.out.println(endsWithP + " elements starts or ends with P or p");
        /**
         * -Create an ArrayList and store below numbers
         * 3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78
         * -Print the entire list
         * -Print how many element can be divided by 10
         * -Print how many even numbers are greater than 15
         * -Print how many odd numbers are less than 20
         * -Print how many elements are less than 15 or greater than 50
         */
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        int divided10 = 0, greater15 = 0, oddLes20 = 0, less15greater50 = 0;
        for (Integer number : numbers) {
            if (number % 10 == 0) divided10++;
            if (number % 2 == 0 && number > 15) greater15++;
            if (number % 2 == 1 && number < 20) oddLes20++;
            if (number < 15 || number > 50) less15greater50++;
        }
        System.out.println(divided10 + " element can be divided by 10");
        System.out.println(greater15 + " even numbers are greater than 15");
        System.out.println(oddLes20 + "  odd numbers are less than 20");
        System.out.println(less15greater50 + " elements are less than 15 or greater than 50");
    }
}
