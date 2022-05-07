package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Project_08 {
    public static void main(String[] args) {
        System.out.println(countMultipleWords(new String[]{"foo", "", " ", "foo bar", "java is fun", " ruby "}));
        System.out.println(removeNegatives(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
        System.out.println(removeNegatives1(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
        System.out.println(removeNegatives2(new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15))));
    }

    /**
     * TASK-1 - countMultipleWords() method
     * Write a method that takes a String[] array as an argument and counts how many strings in the array has multiple words
     * This method will return an int which is the count of multiple words
     * NOTE: be careful about these as they are not multiple words ->“”,    “   “,    “    abc”,  “abc   “
     * [“foo”, “”, “ “, “foo bar”, “java is fun”, “ ruby ”]
     */
    public static int countMultipleWords(String[] array) {
        int count = 0;
        for (String s : array) {
            if (s.trim().contains(" ")) count++;
        }
        return count;
    }

    /**
     * TASK-2 - removeNegatives() method
     * Write a method that takes an “ArrayList<Integer> numbers” as an argument and removes all negative numbers from the given list if there are any
     * This method will return an ArrayList with removed negatives
     */
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers) {
        numbers.removeIf(x -> x < 0);
        return numbers;
    }

    public static ArrayList<Integer> removeNegatives1(ArrayList<Integer> numbers) {
        ArrayList<Integer> num = new ArrayList<>();
        for (Integer number : numbers) {
            if (!(number < 0)) num.add(number);
        }
        return num;
    }

    public static ArrayList<Integer> removeNegatives2(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer x = iterator.next();
            if (x < 0) iterator.remove();
        }
        return numbers;
    }

    /**
     * TASK-3 - validatePassword() method
     * Write a method that takes a “String password” as an argument and checks if the given password is valid or not
     * This method will return true if given password is valid, or false if given password is not valid
     * A VALID PASSWORD:
     * -should have length of 8 to 16 (length of 7 or 17 should return false)
     * -should have at least 1 digit, 1 uppercase, 1 lowercase and 1 special char
     * -should NOT have any space
     */
    public static boolean validatePassword(String password) {
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean special = false;
        for (char c : password.toCharArray()) {
            if (password.contains(" ") || password.length() < 8 || password.length() > 16) return false;
            if (Character.isUpperCase(c)) upperCase = true;
            else if (Character.isLowerCase(c)) lowerCase = true;
            else if (Character.isDigit(c)) digit = true;
            else special = true;
        }
        return upperCase && lowerCase && digit && special;
    }

    /**
     * TASK-4 - method
     * Write a method that takes a “String email” as an argument and checks if the given email is valid or not
     * This method will return true if given email is true, or false if given email is not valid
     * -should NOT have any space
     * -should not have more than one “@” character
     * -should be in the given format <2+chars>@<2+chars>.<2+chars>
     */

    public static boolean validateEmail(String str) {
        if (str.contains(" ") || !str.contains("@") || str.length() < 8 || !str.contains(".") ||
                str.indexOf("@") != str.lastIndexOf("@")) return false;
        return str.substring(0, str.indexOf("@")).length() >= 2 &&
                str.substring(str.indexOf("@") + 1, str.indexOf(".")).length() >= 2 &&
                str.substring(str.lastIndexOf(".") + 1).length() >= 2;
    }


}
