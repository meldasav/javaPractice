package homePractice.CodingBadString1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ap_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEvens1(new int[]{1,3,4,6,8},2)));
        System.out.println(sumUp(5));
        System.out.println(factorial(5));
        System.out.println(average(new ArrayList<>(Collections.singletonList(20))));

    }

    public int wordsCount(String[] words ,int len){
        int count=0;
        for(String s : words){
            if(s.length()==len)count++;
        }
        return count;
    }

    public static int[] copyEvens1(int[] numS, int count) {
        int[] arr = new int[count];
        int index = 0;
        for(int i: numS){
            if(i % 2 == 0) {
                arr[index] = i;
                index++;
            }
            if(index == count) break;
        }
        return arr;
    }
    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     */
     public static int sumUp(int n){
         int sum=0;
         for(int i=0;i<=n;i++){
             if(i%3==0 || i%5==0){
                 sum+=i;
             }
         }
         return sum;
     }
    /**
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     */
    public static int factorial(int n){
        int factorial=n;
        for(int i=n-1;i>0;i--){
            factorial*=i;
        }
        return factorial;
    }
    public static double average(List<Integer> list){
        return list.stream().mapToInt(x->x).average().getAsDouble();
    }

    }

}
