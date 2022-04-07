package homePractice;

import java.util.Arrays;

public class Array_Even_Collector {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 4, -34, 55, 78, 90, 33, 10};
        int counter = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        int[] evens = new int[counter];
        int i = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                evens[i] = num;
                i++;
            }
        }
        System.out.println(Arrays.toString(evens));
    }
}