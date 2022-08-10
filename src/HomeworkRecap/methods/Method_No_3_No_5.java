package HomeworkRecap.methods;

import java.util.Arrays;

public class Method_No_3_No_5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(no3or5(new int[]{10, 11, 12, 13, 14, 15})));
    }
    /**
     * -Create a method called no3or5()
     * -This method will take an int array argument and it will
     * return a new array with some elements replaced as below
     * If element can be divided by 5, replace it with 99
     * If element can be divided by 3, replace it with 100
     * If element can be divided by both 3 and 5, replace it with
     * 101
     */
    public static int[] no3or5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 15 == 0) array[i] = 101;
            else if (array[i] % 5 == 0) array[i] = 99;
            else if (array[i] % 3 == 0) array[i] = 100;
        }
        return array;
    }
}
