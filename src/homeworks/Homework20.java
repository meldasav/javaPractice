package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework20 {
    public static void main(String[] args) {
        System.out.println("~~~~~~TASK1~~~~~~");
        System.out.println(hasLowerCase(""));//false
        System.out.println(hasLowerCase("JAVA"));//false
        System.out.println(hasLowerCase("125$"));//false
        System.out.println(hasLowerCase("hello"));//true
        System.out.println("~~~~~~TASK2~~~~~~");
        System.out.println(noZero1(new ArrayList<>(Arrays.asList(1))));//[1]
        System.out.println(noZero1(new ArrayList<>(Arrays.asList(1, 1, 10))));//[1,1,10]
        System.out.println(noZero1(new ArrayList<>(Arrays.asList(0, 1, 10))));//[1,10]
        System.out.println(noZero1(new ArrayList<>(Arrays.asList(0, 0, 0))));//[]
        System.out.println("~~~~~~TASK3~~~~~~");
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{0, 3, 6})));
        System.out.println(Arrays.deepToString(numberAndSquare(new int[]{1, 4})));
        System.out.println("~~~~~~TASK4~~~~~~");
        System.out.println(containsValue(new String[]{"abc", "foo", "java"}, "hello"));
        System.out.println(containsValue(new String[]{"abc", "def", "123"}, "Abc"));
        System.out.println(containsValue(new String[]{"abc", "def", "123", "Java", "Hello"}, "123"));
        System.out.println("~~~~~~TASK5~~~~~~");
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("This is a sentence"));
        System.out.println(reverseSentence("Java is fun"));
        System.out.println(reverseSentence("Hello"));
        System.out.println("~~~~~~TASK6~~~~~~");
        System.out.println((removeStringSpecialsDigits("123Java #$%is fun")));
        System.out.println((removeStringSpecialsDigits("Selenium")));
        System.out.println((removeStringSpecialsDigits("Selenium 123#$%Cypress")));
        System.out.println("~~~~~~TASK7~~~~~~");
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"123Java", "#$%is", "fun"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123$%", "###"})));
        System.out.println(Arrays.toString(removeArraySpecialsDigits(new String[]{"Selenium", "123#$%Cypress"})));
        System.out.println("~~~~~~TASK8~~~~~~");
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")), (new ArrayList<>(Arrays.asList("abc", "xyz", "123")))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "C#", "C#")), (new ArrayList<>(Arrays.asList("Python", "C#", "C++")))));
        System.out.println(removeAndReturnCommons(new ArrayList<>(Arrays.asList("Java", "is", "fun")), (new ArrayList<>(Arrays.asList("Java", "C#", "Python")))));
        System.out.println("~~~~~~TASK9~~~~~~");
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("abc", "x123", "#$%"))));// [abc, 123, #$%]
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyz", "123", "#$%"))));//[yz, 123, #$%]
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"))));//[yyy, , ABC]
        System.out.println(noXInVariables(new ArrayList<>(Arrays.asList("x", "123", "#$%"))));
    }

    /**
     * -Create a method called hasLowerCase()
     * -This method will take a String argument,
     * and it will return boolean true if there is lowercase letter and false if it does not
     */
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) return true;
        }
        return false;
    }

    /**
     * -Create a method called noZero()
     * -This method will take one Integer ArrayList argument And it will return an
     * ArrayList with all zeros removed from the original Integer ArrayList.
     */
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers) {
        numbers.removeIf(x -> x == 0);
        return numbers;
    }

    //2.way
    public static ArrayList<Integer> noZero1(ArrayList<Integer> numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer number : numbers) {
            if (number == 0) {
                continue;
            }
            list.add(number);
        }
        return list;
    }

    /**
     * -Create a method called numberAndSquare()
     * -This method will take an int array argument And
     * it will return a multidimensional array with all numbers squared.
     */
    public static int[][] numberAndSquare(int[] numbers) {
        int[][] arr = new int[numbers.length][2];
        for (int i = 0; i < numbers.length; i++) {
            arr[i][0] = numbers[i];
            arr[i][1] = numbers[i] * numbers[i];
        }
        return arr;
    }

    /**
     * -Create a method called containsValue()
     * -This method will take a String array and a String argument,
     * and it will return a boolean. Search the variable inside of
     * the array and return true if it exists in the array. If it does not exist, return false.
     * NOTE: Assume that array size is at least 1.
     * NOTE: The method is case-sensitive
     */
    public static boolean containsValue(String[] str, String string) {
        Arrays.sort(str);
        return Arrays.binarySearch(str, string) >= 0;
    }


    /**
     * -Create a method called reverseSentence()
     * -This method will take a String argument And
     * it will return a String with changing the place of every word.
     * All words should be in reverse order. Make sure that there are two words inside the sentence at least.
     * If there is no two words return “There is not enough words!”.
     */
//    public static String reverseSentence(String sentence) {
//        if (sentence.indexOf(' ') < 0) return "There are not enough words";
//        else {
//            String lastWordFirst = sentence.toUpperCase().substring(sentence.lastIndexOf(' ') + 1, sentence.lastIndexOf(' ') + 2);
//            String lastWord = sentence.substring(sentence.lastIndexOf(' ') + 2);
//            String firstWord = sentence.substring(0, sentence.indexOf(' '));
//            String middle = sentence.substring(sentence.indexOf(' ') + 1, sentence.lastIndexOf(' '));
//            return (lastWordFirst + lastWord + " " + middle + " " + firstWord);
//
//        }
    public static String reverseSentence(String sentence) {
        if (sentence.indexOf(" ") <= 0) return "There is not enough words!";
        else {
            StringBuilder sb = new StringBuilder();
            String[] words = sentence.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                sb.append(words[i]).append(" ");
            }
            return sb.substring(0, 1).toUpperCase() + sb.substring(1, sb.lastIndexOf(" ") + 1).toLowerCase();
        }
    }

    /**
     * Create a method called removeStringSpecialsDigits()
     * This method will take a String as argument, and
     * it will return a String without the special characters or digits.
     * NOTE: Assume that String length is at least 1.
     * NOTE: Do not remove spaces.
     */
    public static String removeStringSpecialsDigits(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    //2.way
    public static String removeStringSpecialsDigits1(String str) {
        return str.replaceAll("[^A-Za-z ]", "");
    }

    /**
     * Create a method called removeArraySpecialsDigits()
     * This method will take a String array as argument, and it will return a
     * String array without the special characters or digits from the elements.
     * NOTE: Assume that array size is at least 1.
     */

    public static String[] removeArraySpecialsDigits(String[] str) {
        return Arrays.toString(str).replaceAll("[^A-Za-z ]", "").split(" ");
    }

    /**
     * Create a method called removeAndReturnCommons()
     * This method will take two String ArrayList And it will
     * return all the common words as String ArrayList.
     * NOTE: Assume that both ArrayList sizes are at least 1.
     */
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> words, ArrayList<String> word) {
        ArrayList<String> commonWords = new ArrayList<>();
        for (String w : words) {
            for (String w1 : word) {
                if (w.equals(w1) && !commonWords.contains(w1)) commonWords.add(w1);
            }
        }
        return commonWords;
    }

    /**
     * -Create a method called noXInVariables()
     * -This method will take an ArrayList argument, and it will return an ArrayList with all the x or X removed from elements.
     * If the element itself equals to x or X or contains only x letters, then remove that element.
     * NOTE: Assume that ArrayList size is at least 1.
     */
    public static ArrayList<String> noXInVariables(ArrayList<String> strings) {
        ArrayList<String> list = new ArrayList<>();
        for (String string : strings) {
            if (!string.equals("x")) {
                string = string.replaceAll("x", "");
                string = string.replaceAll("X", "");
                list.add(string);
            }
        }
        return list;
    }

}
