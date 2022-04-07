package homePractice;

import java.util.Arrays;

public class Array_Max_Value_Of_Two {
    public static void main(String[] args) {
        int[] numbers = {23, 1, 34, 3, 54, 54, 51};
        Arrays.sort(numbers);
        int last = numbers.length - 1;
        System.out.println(numbers[last]);
        for (int i = last; i >= 0; i--) {
            if (numbers[last] != numbers[i]) {
                System.out.println(numbers[i]);
                break;
            }
        }
    }
}
