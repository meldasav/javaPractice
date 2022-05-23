package homeworks;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

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
        System.out.println((Arrays.deepToString(numberAndSquare(new int[]{1, 2, 3}))));
        System.out.println("~~~~~~TASK4~~~~~~");
        System.out.println(containsValue(new String[]{"abc","def","123", "Java","Hello"},"123"));
    }

    /**
     * -Create a method called hasLowerCase()
     * -This method will take a String argument,
     * and it will return boolean true if there is lowercase letter and false if it does not
     */
    public static boolean hasLowerCase(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                return true;
            }
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

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int[] arr = {numbers[i], numbers[i] * numbers[j]};

                return new int[][]{arr};
            }
        }
        return new int[0][];
    }
    /**
     * -Create a method called containsValue()
     * -This method will take a String array and a String argument,
     * and it will return a boolean. Search the variable inside of
     * the array and return true if it exists in the array. If it does not exist, return false.
     * NOTE: Assume that array size is at least 1.
     * NOTE: The method is case-sensitive
     */
    public static boolean containsValue(String[] str,String string){
        Arrays.sort(str);
        return Arrays.binarySearch(str,string)>0;
    }
}



