package homePractice;

import java.util.Arrays;

public class PrintLargestFromTwoArray {
    public static void main(String[] args) {
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third=new int[5];
        for (int i = 0; i < third.length; i++) {
            third[i] = Math.max(first[i], second[i]);

        }
            System.out.println(Arrays.toString(third));

    }
}
