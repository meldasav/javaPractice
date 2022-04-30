package homePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class Friday_Mock_Practice {
    public static int secondMin(int[] number) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i : number) numbers.add(i);
        return new ArrayList<>(numbers).get(1);
    }

    public static int secondMin1(int[] number) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i : number) {
            if (i < min) min = i;
        }
        for (int i : number) {
            if (i != min && i < secondMin) secondMin = i;
        }
        return secondMin;
    }

    public static int secondMax(int[] number) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i : number) numbers.add(i);
        return new ArrayList<>(numbers).get(numbers.size() - 2);
    }

    public static int secondMax1(int[] number) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : number) {
            if (i > max) max = i;
        }
        for (int i : number) {
            if (i != max && i > secondMax) secondMax = i;
        }
        return secondMax;
    }

    public static int minValue(int[] number) {
        Arrays.sort(number);
        return number[0];
    }

    public static int minValue1(int[] number) {
        int min = Integer.MAX_VALUE;
        for (int i : number) {
            if (i < min) min = i;
        }
        return min;
    }

    public static int minValue2(int[] number) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i : number) numbers.add(i);
        return new ArrayList<>(numbers).get(0);
    }

    public static int maxValue(int[] number) {
        int max = Integer.MIN_VALUE;
        for (int i : number) {
            if (i > max) max = i;
        }
        return max;
    }

    public static int maxValue1(int[] number) {
        Arrays.sort(number);
        return number[number.length - 1];

    }

    public static int maxValue2(int[] number) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i : number) numbers.add(i);
        return new ArrayList<>(numbers).toArray().length - 1;
    }

    public static int[] factorial(int[] number) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == 0 || number[i] == 1) number[i] = 1;
            else {
                int num = number[i];
                for (int j = 2; j < num; j++) {
                    number[i] *= j;

                }
            }

        }
        return number;

    }

    public static int factorial1(int number) {
        if (number == 0 || number == 1) return 1;
        else {
            int num = number;
            for (int i = 0; i < num; i++) {
                number *= i;
            }
        }
        return number;
    }

    public static String reverseEachWord(String str) {
        StringBuilder result = new StringBuilder();
        for (String word : str.split(" ")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
        }
    public static String removeExtraSpace(String str){
        StringBuilder sb=new StringBuilder();
        for (String s : str.trim().split(" ")) {
            if(!s.isEmpty())sb.append(s).append(" ");
        }
        return sb.substring(0,sb.length()-1);
    }
    public static String removeExtraSpace1(String str){
        return str.trim().replaceAll("\\s+"," ");
    }
    public static String removeConsonants(String str){
        return str.trim().replaceAll("[a-zA-Z && [^AEOUIaeoui]]","");
    }



    public static void main(String[] args) {
        System.out.println(maxValue2(new int[]{0, 1, 2, 3, 4, 5}));
        System.out.println(removeConsonants("       Java is      fun     "));
    }

}