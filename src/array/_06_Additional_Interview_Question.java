package array;

import java.util.*;

public class _06_Additional_Interview_Question {
    public static void main(String[] args) {
        //Find the greatest and print it
        int[] numbers = {5, 3, 0, -5};
        /**
         * first way sort method
         */
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-1]);

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
            if (number == minValue) {
            }
            else if (number < minValue3) minValue3 = number;

        }
        double[] array1 = {2.5, 9, 10.25, 0.5, 0.5, 1.5, 10.25};
        double maxValue=Double.MIN_VALUE;
        double secondMaxValue=Double.MIN_VALUE;
        for(Double value : array1){
            if(maxValue<value)maxValue=value;
        }
        for (Double value : array1){
            if(secondMaxValue<value && value!=maxValue)secondMaxValue=value;
        }
        System.out.println(secondMaxValue);

        TreeSet<Double> set=new TreeSet<>();
        for (Double d : array1)set.add(d);
        ArrayList<Double> list=new ArrayList<>(set);
        System.out.println(list.get(list.size()-2));
    }
}
