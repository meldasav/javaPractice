package homePractice.whiteBoardQuestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Day1 {
    public static void main(String[] args) {
        System.out.println(secondMax1(new int[]{-5, 4, 1, 10, 2}));
        System.out.println(reversedEachWord("melda at home"));
        System.out.println(removeExtraSpace1("melda      sav    "));
        System.out.println(removeDup(new ArrayList<>(Arrays.asList("foo", "bar", "foo", "123", "bar"))));
        System.out.println(countPrime(new int[]{-3, 5, 4, 0, 11,13}));
    }

    //second min value
    public static int secondMin(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int number : numbers) set.add(number);
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        return arrayList.get(1);
    }

    public static int secondMin1(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) min = number;
        }
        for (int number : numbers) {
            if (number != min && number < secondMin) secondMin = number;
        }
        return secondMin;
    }

    public static int secondMax(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int number : numbers) set.add(number);
        ArrayList<Integer> arrayList = new ArrayList<>(set);
        return arrayList.get(arrayList.size() - 2);
    }

    public static int secondMax1(int[] numbers) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) max = number;
        }
        for (int number : numbers) {
            if (number != max && number > secondMax) secondMax = number;
        }
        return secondMax;
    }

    public static String reversedEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        str = str.trim();
        if (!str.isEmpty()) {
            for (String s : str.split(" ")) {
                if (!s.contains(" ")) sb.append(s).append("");
            }
        }
        return sb.substring(0, sb.length() - 1);
    }

    public static String removeExtraSpace1(String str) {
        return str.trim().replaceAll(" ", "");
    }

    public static ArrayList<String> removeDup(ArrayList<String> str) {
        return new ArrayList<>(new HashSet<>(str));
    }

    public static int countPrime(int[] numbers) {
        int countPrime = 0;
        for (int number : numbers) {
            if (number == 2 || number == 3) countPrime++;
            else if (number > 3) {
                boolean isPrime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) countPrime++;
            }
        }
        return countPrime;
    }

}






