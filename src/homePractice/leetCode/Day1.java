package homePractice.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(removeDup(new int[]{1, 1, 2, 2, 4, 5, 6}));//out put is 5 basically return the length
        System.out.println(Arrays.toString(twoSum1(new int[]{2, 7, 11, 15}, 9)));
    }

    /**
     * Remove Dup in sorted Array
     */
    public static int removeDup(int[] number) {//requirement is not allowing you to create new array do it in same place
        int index = 1;//Represent where we should replace our new number
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] != number[i + 1]) { //if they are not equal we want to place that current number what ever index we are on
                number[index++] = number[i + 1];//we want to go through next iteration of Loop
            }
        }
        return index;
    }

    /**
     * two sum
     */
    public static int[] twoSum(int[] numS, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numS.length; i++) {
            int difference = target - numS[i];//difference between target and what number we are on
            if (map.containsKey(difference)) {
                result[0] = i;//that's the first index
                result[1] = map.get(difference);
                return result;
            }
            map.put(numS[i], i);
        }
        return result;
    }

    //better solution
    public static int[] twoSum1(int[] numS, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numS.length; i++) {
            int cur = numS[i];
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[]{map.get(x), i};
            }
            map.put(cur, i);
        }
        return null;
    }

    /**
     * remove element
     */
    public int removeElement(int[] numS, int val) {
        int index = 0;
        for (int i = 0; i < numS.length; i++) {
            if (numS[i] != val) {
                numS[index] = numS[i];
                index++;
            }
        }
        return index;
    }

    }
