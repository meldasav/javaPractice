package homePractice;

import java.util.Arrays;
import java.util.TreeSet;

public class FindSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum(new int[]{1,2,3})));
        System.out.println(findMin1(new int[]{5,3,4}));

    }

    public static int[] sum(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]+=3;
        }
        return numbers;
    }
    public static int findMax(int[] numbers){
        int max=Integer.MIN_VALUE;
        for (int number : numbers) {
            if(number>max)max=number;
        }
        return max;
    }
    public static int findMin1(int[] numbers){
        TreeSet<Integer> number=new TreeSet<>();
        for (int i : numbers) number.add(i);
         return number.first();
        }
    }







