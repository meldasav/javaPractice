package homeworks;

import java.util.Arrays;

public class CodingBatArray3 {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
        System.out.println(Arrays.toString(fix45(new int[]{5, 4, 9, 4, 9, 5})));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println((linearIn(new int[]{1, 2, 4, 6},new int[]{5, 4})));
    }

    //maxSpan([1, 2, 1, 1, 3]) → 4 first number is 1 appear on the 4 place
    public static int maxSpan(int[] numS) {
        int ans = 0;
        for (int i = 0; i < numS.length; i++) {
            for (int j = 0; j < numS.length; j++) {
                if (numS[i] == numS[j]) {
                    int temp = i - j + 1;
                    temp = numS[i];
                    if (temp > ans) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }

    public static int[] fix34(int[] numS) {
        for (int i = 0; i < numS.length; i++) {
            if (numS[i] == 3) {
                int temp = numS[i + 1];
                numS[i + 1] = 4;
                for (int j = i + 2; j < numS.length; j++) {
                    if (numS[j] == 4) {
                        numS[j] = temp;
                    }
                }
            }
        }
        return numS;
    }

    public static int[] fix45(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = 0; j < nums.length; j++) {
                    if ((j == 0 && nums[j] == 5) || (j != 0 && nums[j - 1] != 4 && nums[j] == 5)) {
                        int temp = nums[i + 1];
                        nums[i + 1] = 5;
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }

    public static boolean canBalance(int[] numS) {
        for (int i = 0; i <= numS.length; i++) {
            if (sum1(numS, 0, i) == sum1(numS, i, numS.length)) {
                return true;
            }
        }
        return false;
    }
    public static int sum1(int[] num, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += num[i];
        }
        return sum;
    }
    public static boolean linearIn(int[] outer, int[] inner) {
        for (int j : inner) {
            if(Arrays.binarySearch(outer,j)<0)return false;
        }
        return true;
    }

}


