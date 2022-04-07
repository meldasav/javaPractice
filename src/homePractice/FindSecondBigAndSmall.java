package homePractice;

public class FindSecondBigAndSmall {
    public static void main(String[] args) {
        int[] arr={5,2,3,65,8};
        int firstMax = getMaxValue(arr, Integer.MAX_VALUE);
        int secondMax = getMaxValue(arr, firstMax);
        int firstMin = getMinValue(arr, Integer.MIN_VALUE);
        int secondMin = getMinValue(arr, firstMin);
        System.out.println(secondMax);
        System.out.println(secondMin);
    }
    public static int getMaxValue(int[] numbers, int first) {
        int maxValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue && first != numbers[i]) {
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }
    public static int getMinValue(int[] numbers, int firstMin) {
        int minValue = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue && firstMin != numbers[i]) {
                minValue = numbers[i];
            }
        }
        return minValue;
    }
}
