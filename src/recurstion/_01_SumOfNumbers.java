package recurstion;

public class _01_SumOfNumbers {
    public static void main(String[] args) {

    }

    /**
     * Create a recursive method that finds the sum of the
     * numbers from 1 to 5
     * EXPECTED RESULT:15
     */

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += n;

        }
        return sum;
    }
    public static int recursiveSum(int n) {
        if(n>0) return  n + recursiveSum(n-1);
        return 0;
    }

    }












