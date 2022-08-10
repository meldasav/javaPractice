package HomeworkRecap.methods;

import java.util.Arrays;

public class Method_No_A {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(noA(new String[]{"appium", "hello", "a123", "xyz"})));
    }

    /**
     * Create a method called noA()
     * -This method will take a String array argument and it
     * will return a new array with all elements starting with A
     * or a replaced with “###”
     */

    public static String[] noA(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].toLowerCase().startsWith("a")) {
                array[i] = "###";
            }
        }
        return array;
    }
}
