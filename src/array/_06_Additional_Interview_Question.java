package array;

import java.util.Arrays;

public class _06_Additional_Interview_Question {
    public static void main(String[] args) {
        //Find the greatest and print it
        int[] numbers = {5, 3, 0, -5};

        int max = numbers[0];
        for (int number : numbers) {
            max = Math.max(max, number);
        }
        System.out.println(max);
        //    double[] result=new double[7];
        double[] array = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double minValue = Double.MAX_VALUE;
        for (double number : array) {
            //if(number < minValue) minValue = number;
            minValue = Math.min(minValue, number);
        }
        //find the second min value
        double minValue2 = Double.MAX_VALUE;
        for (double number1 : array) {
            if (number1 != minValue && number1 < minValue2) minValue2 = number1;
        }
        System.out.println(minValue2);
        // Use above double array and find second minimum value

        //   RESULT:
        //   1.5


        double minValue3 = Double.MAX_VALUE;

        for (double number : array) {
            if (number == minValue) continue;
            else if (number < minValue3) minValue3 = number;


        }
    }
}
