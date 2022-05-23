package homeworks.homeworks_fixed;

import java.util.Arrays;

public class Homework_19SalihSolution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrFactorial(new int[]{1,2,3,4})));
        System.out.println(middleInt(1,3,2));
    }
    /**
     * Create a method called middleInt()
     * -This method will take three int arguments And it will return the middle int.
     */
    public static int middleInt(int n1, int n2, int n3) {
      int[] number={n1,n2,n3};
      Arrays.sort(number);
      return number[1];
    }
        /**
         * Create a method called arrFactorial()
         * -This method will take an int array as argument And
         * it will return the array with every number replaced with their factorials.
         */

        public static int[] arrFactorial ( int[] numbers){
            for (int i = 0; i < numbers.length; i++) {
                int factorial = 1;
                for (int j = 2; j <= numbers[i]; j++) {
                    factorial *= j;
                    numbers[i] = factorial;
                }
            }
            return numbers;
        }
    }
