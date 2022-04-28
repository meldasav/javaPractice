package homePractice;

import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumOfTwoArray(new int[]{1, 2, 3, 4,5}, new int[]{1, 2, 3, 4,5})));
    }
    /**
     * Write a method add() that takes 2 int[] arrays as arguments and
     * returns a new array with sum of given arrays elements.
     */

    public static int[] sumOfTwoArray(int[] num1,int[] num2){
        for (int i = 0; i < Math.min(num1.length,num2.length); i++) {
            if(num1.length>num2.length)num1[i]+=num2[i];
            else num2[i]+=num1[i];
        }
        return (num1.length>num2.length) ? num1:num2;
    }



    }

