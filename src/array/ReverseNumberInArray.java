package array;

import java.util.Arrays;

public class ReverseNumberInArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(contain2or3(new int[]{1, 2, 3, 6}));
        System.out.println(Arrays.toString(makeMiddle(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(maxEnd3SecondWay(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(makeLast(new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(new int[]{start1(new int[]{1, 2, 3}, new int[]{1, 2, 3})}));
        System.out.println(stringE("hello"));
    }

    public static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }

    public static boolean contain2or3(int[] numbers) {
        Arrays.sort(numbers);
        return Arrays.binarySearch(numbers, 2) < 0 && Arrays.binarySearch(numbers, 3) < 0;
    }

    public static int[] makeMiddle(int[] numS) {
        if (numS.length % 2 == 1) {
            return new int[]{numS[numS.length / 2]};
        } else {
            return new int[]{numS[numS.length / 2 - 1], numS[numS.length / 2]};
        }
    }

    public static int[] maxEnd3(int[] numS) {
        if (numS[0] > numS[numS.length - 1]) return new int[]{numS[0], numS[0], numS[0]};
        return new int[]{numS[numS.length - 1], numS[numS.length - 1], numS[numS.length - 1]};
    }

    public static int[] maxEnd3SecondWay(int[] numS) {
        int max = Math.max(numS[0], numS[numS.length - 1]);
        Arrays.fill(numS, max);
        return numS;
    }

    public static int[] makeLast(int[] nums) {
        int[] arr = new int[nums.length * 2];
        arr[arr.length - 1] = nums[nums.length - 1];
        return arr;
    }

    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length > 0 && a[0] == 1) count++;
        if (b.length > 0 && b[0] == 1) count++;
        return count;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] array = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            array[i + a.length] = b[i];
        }
        return array;
    }

    public static boolean stringE(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }
        return count >= 1 && count <= 3;
    }
}

