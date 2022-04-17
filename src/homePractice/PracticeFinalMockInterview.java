package homePractice;

import java.util.Arrays;

public class PracticeFinalMockInterview {
    public static void main(String[] args) {
        System.out.println(greatestNumber2(3, 3, 9));
    }
    /*
   Write a method that takes 3 int arguments and returns the greatest number
   NOTE: 2 or 3 numbers being same is okay
   TEST DATA:
   3, 3, 5
   EXPECTED OUTPUT:
   5
    */
    public static int greatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //Second way
    public static int greatestNumber1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    // way 3
    public static int greatestNumber2(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
}
