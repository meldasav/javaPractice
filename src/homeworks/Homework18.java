package homeworks;

import utilities.CharacterHelper;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

public class Homework18 {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<<Task1>>>>>>>>>>>");
        System.out.println(noSpace2("     hello world      "));
        System.out.println("<<<<<<<<<<Task2>>>>>>>>>>>");
        System.out.println(replaceFirstLast1("   Hello    "));
        System.out.println("<<<<<<<<<<Task3>>>>>>>>>>>");
        System.out.println(hasVowel1("ABC"));
        System.out.println("<<<<<<<<<<Task4>>>>>>>>>>>");
        checkAge(1983);
        System.out.println("<<<<<<<<<<Task5>>>>>>>>>>>");
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println("<<<<<<<<<<Task6>>>>>>>>>>>");
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123", "ABC", "java"})));
        System.out.println("<<<<<<<<<<Task7>>>>>>>>>>>");
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
        System.out.println("<<<<<<<<<<Task8>>>>>>>>>>>");
        System.out.println(countPrimes(new int[]{7, 4, 11, 23, 17}));
    }

    /**
     * -Create a method called noSpace()
     * -This method will take one String argument And
     * it will return a new String with all spaces removed from the original String
     */
    public static String noSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    //2.way
    public static String noSpace1(String str) {
        return str.trim().replaceAll(" ", "");
    }

    //3.way
    public static String noSpace2(String str) {
        StringBuilder sb = new StringBuilder();
        if (!str.isEmpty()) {
            for (char c : str.toCharArray()) {
                if (c != 32) sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * -Create a method called replaceFirstLast()
     * -This method will take one String argument And
     * it will return a new String with first and last characters replaced
     * NOTE: if the length is less than 2, then return empty String
     * NOTE: Ignore all before and after spaces (get actual String only)
     */
    public static String replaceFirstLast(String str) {
        if (str.length() < 2) return "";
        else {
            char firstChar = str.charAt(0);
            char lastChar = str.charAt(str.length() - 1);
            str = str.trim();
            return "" + lastChar + str.substring(1, str.length() - 1) + firstChar;
        }
    }

    // less code best code but less readable
    public static String replaceFirstLast1(String str) {
        if (str.length() < 2) return "";
        str = str.trim();
        return "" + str.trim().charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
    }

    /**
     * -Create a method called hasVowel()
     * -This method will take one String argument And
     * it will return a boolean checking if String has any vowel or not
     */
    public static boolean hasVowel(String str) {
        if (str.isEmpty()) return false;
        str = str.trim().toLowerCase();
        boolean isVowel = false;
        for (char c : str.toCharArray()) {
            if (c == 'e' ||
                    c == 'a' ||
                    c == 'o' ||
                    c == 'u' ||
                    c == 'i') {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }

    public static boolean hasVowel1(String str) {
        if (str.isEmpty()) return false;
        else {
            for (int i = 0; i < str.length(); i++) {
                if (CharacterHelper.isVowel(str.charAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * -Create a method called checkAge()
     * -This method will take an int yearOfBirth as  argument And it will print message below based on the entry
     * If the age is less than 16, then print “AGE IS NOT ALLOWED”
     * If the age is 16 or more, then print “AGE IS ALLOWED”
     * If the age is more than 100 or a future year entered, print “AGE IS NOT VALID”
     * NOTE: Calculate the age taking base year as current year in a dynamic way. You can use Date class.
     */
    public static void checkAge(int yearOfBirth) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int yourAge = (currentYear - yearOfBirth);
        if (yourAge < 16)
            System.out.println("AGE IS NOT ALLOWED");
        else if (yourAge > 100) {
            System.out.println("AGE IS NOT VALID");
        } else System.out.println("AGE IS ALLOWED");
    }

    /**
     * -Create a method called averageOfEdges()
     * -This method will take three int arguments And it will return average of min and max numbers
     */
    public static int averageOfEdges(int n1, int n2, int n3) {
        int[] numbers = {n1, n2, n3};
        Arrays.sort(numbers);
        return (numbers[0] + numbers[numbers.length - 1]) / 2;
    }

    /**
     * -Create a method called noA()
     * -This method will take a String array argument And
     * it will return a new array with all elements starting with A or a replaced with “###”
     */
    public static String[] noA(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().startsWith("a")) {
                str[i] = "###";
            }
        }
        return str;
    }

    /**
     * -Create a method called no3or5()
     * -This method will take an int array argument And
     * it will return a new array with some elements replaced as below
     * If element can be divided by 5, replace it with 99
     * If element can be divided by 3, replace it with 100
     * If element can be divided by both 3 and 5, replace it with 101
     */

    public static int[] no3or5(int[] numbers) {
        if (numbers.length == 0) return numbers;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 15 == 0) {
                numbers[i] = 101;
            } else if (numbers[i] % 3 == 0) {
                numbers[i] = 100;
            } else if (numbers[i] % 5 == 0) {
                numbers[i] = 99;
            }
        }
        return numbers;
    }

    /**
     * Create a method called countPrimes()
     * -This method will take an int array argument And
     * it will return how many elements in the array are prime numbers
     */
    public static int countPrimes(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number == 2 || number == 3) count++;
            else if (number > 3) {
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }

}





