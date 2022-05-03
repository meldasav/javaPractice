package homePractice.CodingBadString1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ap_1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(copyEvens1(new int[]{1, 3, 4, 6, 8}, 2)));
        System.out.println(sumUp(5));
        System.out.println(factorial(5));
        System.out.println(average(new ArrayList<>(Collections.singletonList(20))));
        System.out.println((scoreUp(new String[]{"a", "b", "c", "d"}, new String[]{"a", "b", "a", "a"})));
        System.out.println(wordsWithoutList(new String[]{"a", "bb", "b", "ccc"}, 1));
        System.out.println(scoresAverage((new int[]{2, 2, 4, 4})));
        System.out.println(sumHeight(new int[]{5, 3, 6, 7, 2}, 2, 4));
    }

    public int wordsCount(String[] words, int len) {
        int count = 0;
        for (String s : words) {
            if (s.length() == len) count++;
        }
        return count;
    }

    public static int[] copyEvens1(int[] numS, int count) {
        int[] arr = new int[count];
        int index = 0;
        for (int i : numS) {
            if (i % 2 == 0) {
                arr[index] = i;
                index++;
            }
            if (index == count) break;
        }
        return arr;
    }

    /**
     * Sum Multiples of Three and Five
     * Given a number n, write a method that sums all multiples of three and five up to n (inclusive).
     */
    public static int sumUp(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    /**
     * Write a method that calculates the factorial of a given number.
     * Factorial is the product of all positive integers less than or equal to n. For example, factorial(4) = 4x3x2x1 = 24.
     */
    public static int factorial(int n) {
        int factorial = n;
        for (int i = n - 1; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static double average(List<Integer> list) {
        return list.stream().mapToInt(x -> x).average().getAsDouble();
    }

    public static int[] multiply(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            array1[i] *= array2[i];
        }
        return array1;
    }

    public static int scoreUp(String[] key, String[] answers) {
        int score = 0;

        for (int i = 0; i < key.length; i++) {
            if (key[i].equals(answers[i])) score += 4;
            else if (answers[i].equals("?")) continue;
            else score -= 1;
        }
        return score;
    }

    public static List<String> wordsWithoutList(String[] words, int len) {
        List<String> neWList = new ArrayList<>(Arrays.asList(words));
        neWList.removeIf(x -> x.length() == len);
        return neWList;
    }

    public static int scoresAverage(int[] scores) {
        int average = average(scores, 0, scores.length / 2);
        int average3 = average(scores, scores.length / 2, scores.length);
        if (average > average3) {
        }
        return average3;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
        }
        int count = end - start;
        return (int) (sum / count);

    }

    public static int sumHeight(int[] heights, int start, int end) {
        int count = 0;
        for (int i = start; i < end; i++) {
            int temp = Math.abs(heights[i] - heights[i + 1]);
            count += temp;
        }
        return count;
    }

    public static int userCompare(String aName, int aid, String bName, int bid) {
        if (aName.equals(bName)) {
            if (aid == bid) return 0;
            else if (aid < bid) return -1;
        } else if (aName.compareTo(bName) < 0) return -1;
        return 1;
    }

    public static int[] copyEnds(int[] nums, int count) {
        int[] ans = new int[count];
        int j = 0;
        for (int i = 0; i < nums.length && j < ans.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] ans = new int[count];
        int j = 0;
        for (int i = 0; j < ans.length; i++) {
            if (isEndy(nums[i])) {
                ans[j] = nums[i];
                j++;
            }
        }
        return ans;
    }

    public static boolean isEndy(int n) {
        if (n <= 10 || (n >= 90 && n <= 100)) {
            return true;
        }
        
        return false;
    }


}

