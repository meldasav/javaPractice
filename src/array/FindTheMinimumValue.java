package array;

import java.util.Arrays;

public class FindTheMinimumValue {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 7, 8, 15, 15};
        int secondMax = findSecondGreatestAndSmallest(arr, true, findSecondGreatestAndSmallest(arr, true, Integer.MAX_VALUE));
        int secondMin = findSecondGreatestAndSmallest(arr, false, findSecondGreatestAndSmallest(arr, false, Integer.MIN_VALUE));
        System.out.println("secondMax: "+secondMax+" secondMin: "+secondMin);
    }

    public static int  findSecondGreatestAndSmallest(int[] numbers, boolean isMax, int first) {
        int value = numbers[0];
        for (int number : numbers) {
            if (isMax)
                if (number > value && first != number)
                    value = number;
                else if (number < value && first != number)
                    value = number;
        }
        return value;
    }
}
