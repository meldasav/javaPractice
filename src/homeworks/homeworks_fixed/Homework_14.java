package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Homework_14 {
    public static void main(String[] args) {
        /**
         * Write a program to find the first duplicated number in an int array
         * It should print “There is no duplicates” if there are no duplicate elements.
         * NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbers = {-4, 5, -7, -4, 5, 10, 45, 45};
        boolean isFirstDuplicatedNumberFound = false;
        int firsDuplicatedNumber;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!isFirstDuplicatedNumberFound && numbers[i] == numbers[j]) {
                    firsDuplicatedNumber = numbers[i];
                    isFirstDuplicatedNumberFound = true;
                    System.out.println(firsDuplicatedNumber);
                    break;
                }
            }
        }
        if (!isFirstDuplicatedNumberFound) System.out.println("There is no duplicates");

        /**
         * Write a program to find the first duplicated String in a String array, ignore cases.
         * It should print “There is no duplicates” if there are no duplicate elements.
         * NOTE: Make your code dynamic that works for any given String array.
         */
        String[] words = {"Z", "abc", "z", "123", "#"};
        String firstDup = "";
        boolean duplicateFound = false;
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !duplicateFound) {
                    firstDup = words[i];
                    duplicateFound = true;
                    System.out.println(firstDup);
                    break;
                }
            }

        }
        if (!duplicateFound) System.out.println("There is no Dup");
        /**
         * Write a program to find the all duplicates in an int array.
         * It should print “There is no duplicates” if there are no duplicate elements.
         * NOTE: Make your code dynamic that works for any given int array.
         */
        int[] numbersS = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        String s = "";
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !s.contains(numbers[i] + "")) {
                    s += numbers[i] + "\n";
                }
            }
        }
        System.out.println((s.isEmpty()) ? "There is no duplicates" : s);

        /**
         * Write a program to find the all duplicates in a String array, ignore cases.
         * It should print “There is no duplicates” if there are no duplicate elements.
         * NOTE: Make your code dynamic that works for any given String array.
         */
        String[] wordsS = {"A", "foo", "12" , "Foo", "bar", "a", "za", "java"};
        String str="";
        for (int i = 0; i < wordsS.length - 1; i++) {
            for (int j = i + 1; j < wordsS.length; j++) {
                if (wordsS[i].equalsIgnoreCase(wordsS[j]) && !str.contains(wordsS[i].toLowerCase())){
                    System.out.println(wordsS[i]);
                    str += wordsS[i].toLowerCase();
                }
            }
        }

        if (str.isEmpty()) System.out.println("There is no duplicates");

        /**
         * Write a program to reverse elements in an array, then print array.
         * NOTE: Make your code dynamic that works for any given array.
         * Test data 1:
         * String[] words1 = {“abc”, “foo”, “bar”};
         * Expected output 1:
         * [bar, foo, abc]
         */
        String[] words1 = {"abc", "foo", "bar"};
        List<String> reversed = new ArrayList<>();

        for (int i = words1.length - 1; i >= 0 ; i--) {
            reversed.add(words1[i]);
        }
        Object[] array = reversed.toArray();
        System.out.println(Arrays.toString(array));//[bar, foo, abc]

        /**
         * Write a program to reverse each word in a given String
         * NOTE: Make your code dynamic that works for any given String.
         */
        String str2 = "Java is fun";
        StringBuilder sb=new StringBuilder();
        for (String s1 : str2.split(" ")) {
            for (int i = s1.length()-1; i >=0 ; i--) {
                 sb.append(s1.charAt(i));
            }
            sb.append(" ");

            }
        System.out.println(sb);//avaJ si nuf
        }

    }
