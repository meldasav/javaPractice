package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework_06 {
    public static void main(String[] args) {
        System.out.println(hasLowerCase("melda"));
        System.out.println(noZero(new ArrayList<>(Arrays.asList(0, 0, 0))));
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "123"));
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x","abc","123","#$%","x"))));

    }

    /**
     * Create a method called hasLowerCase()
     * -This method will take a String argument, and it will return boolean true
     * if there is lowercase letter and false if it doesn’t.
     */
    public static boolean hasLowerCase(String str) {
        boolean hasLowerCase = false;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                hasLowerCase = true;
                break;
            }
        }
        return hasLowerCase;
    }

    /**
     * -Create a method called noZero()
     * -This method will take one Integer ArrayList argument and it will return an ArrayList with
     * all zeros removed from the original Integer ArrayList.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers) {
        numbers.removeIf(x -> x == 0);
        return numbers;
    }

    public static boolean containsValue(String[] array, String str) {
        Arrays.sort(array);
        return Arrays.binarySearch(array, str) >= 0;
    }

    /**
     * Create a method called reverseSentence()
     * -This method will take a String argument and it will return a String with changing the place of every word.
     * All words should be in reverse order. Make sure that there are two words inside the sentence at least.
     * If there is no two words return “There is not enough words!”.
     */
    public static String reverseSentence(String str) {
        String firstLetter = str.toLowerCase().substring(0, str.indexOf(' '));
        String lastLetter = str.toUpperCase().substring(str.lastIndexOf(' ') + 1, str.lastIndexOf(' ') + 2);
        String lastLetter1 = lastLetter + str.substring(str.lastIndexOf(' ') + 2);
        String middle = str.substring(str.indexOf(' ') + 1, str.lastIndexOf(' '));
        return lastLetter1 + " " + middle + " " + firstLetter;
    }
    public static String removeStringSpecialsDigits(String str){
        return str.replaceAll("[^a-zA-Z ]","");
    }
    public static ArrayList<String> noXInVariables(ArrayList<String> str){
        str.removeIf(x->x.equals("x"));
        return str;
    }



}

