package array;

public class FindBiggestDifference {
    public static void main(String[] args) {

        int[] numbers = {1, 5, 8, 20, 7};
        int maxDifference = findMaxDifference(numbers);
        System.out.println("The biggest difference is: " + maxDifference);

    }

    private static int findMaxDifference(int[] numbers) {
        if (numbers == null || numbers.length < 2) {
            // Not enough elements to compare
            return 0;
        }

        int maxDifference = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                int difference = Math.abs(numbers[i] - numbers[j]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
            }
        }
        return maxDifference;
    }
}



