package homePractice.whiteBoardQuestions;

import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class FindFirstAndSecondMax {
    //   write a method Find second max in Array
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

    public static int findSecondMinValue(int[] numbers) {
        int firstMin = MAX_VALUE;
        for (Integer number : numbers) {
            if (firstMin > number) firstMin = number;
        }
        int secondMin = MAX_VALUE;
        for (Integer number : numbers) {
            if (number != firstMin && secondMin > number) secondMin = number;
        }
        return secondMin;
    }

    public static void main(String[] args) {
        System.out.println(findSecondMinValue(new int[]{5, 3, 2, 10}));
    }
}
