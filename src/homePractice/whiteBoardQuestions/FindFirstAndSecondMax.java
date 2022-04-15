package homePractice.whiteBoardQuestions;

import java.util.Arrays;

import static java.lang.Integer.MIN_VALUE;

public class FindFirstAndSecondMax {
    // write a method Find second max in Array
    public static int findSecondMax(int[] numbers) {
        int firstMax = MIN_VALUE;
        for (Integer number : numbers) {
            if (firstMax < number) firstMax = number;
        }
        int secondMax = MIN_VALUE;
        for (Integer number : numbers) {
            if (number != firstMax && secondMax < number) secondMax = number;
        }
        return secondMax;
    }
    public static void main(String[] args) {
        System.out.println(findSecondMax(new int[]{5, 3, 0, -5, 10}));
    }
}
