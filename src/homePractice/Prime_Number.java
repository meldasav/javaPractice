package homePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.println(countPrime(new int[]{-3, 5, 4, 0, 11}));
        System.out.println(removeDup(new ArrayList(Arrays.asList(-3, 0, 0, 5, 5, 4, 0, 11, 11))));
        System.out.println(removeDuplicates(new ArrayList(Arrays.asList("foo", "bar", "foo", "123", "bar"))));
        fibonacci(8);
        System.out.println(minValue(new int[]{2,5,7,9,34,5,9,2,89,6,1}));
        System.out.println(secondMin1(new int[]{-2,-3, 1, 4, 7, 8,23}));
    }


    public static boolean IsPrime(int number) {
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int countPrime(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i == 2 || i == 3) count++;
            else if (i > 3) {
                boolean isPrime = true;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> numbers) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer integer : numbers) {
            if (!myList.contains(integer)) myList.add(integer);
        }
        return myList;
    }

    public static ArrayList<String> removeDuplicates(ArrayList<String> str) {
        ArrayList<String> myList = new ArrayList<>();
        for (String s : str) {
            if (myList.contains(s)) {
                continue;
            }
            myList.add(s);
        }
        return myList;

    }

    public static void fibonacci(int number) {
        StringBuilder sb = new StringBuilder();
        int n1 = 0, n2 = 1, n3 ;
        for (int i = 0; i < number; i++) {
            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.println(sb.substring(0, sb.length() - 1));
    }

    public static int countVowels(String str) {
        int count = 0;
        Pattern p = Pattern.compile("[AEOUIaeoui]");
        for (char c : str.toCharArray()) {
            Matcher m = p.matcher(String.valueOf(c));
            if (m.matches()) count++;
        }
        return count;
    }

    public static int countVowels1(String str) {
        int count = 0;
        Pattern pattern = Pattern.compile("[aeiouAEIOU]");

        for (char c : str.toCharArray()) {
            Matcher matcher = pattern.matcher(String.valueOf(c));
            if (matcher.matches()) count++;
        }
        return count;
    }

    public static String removeExtraSpace(String str) {
        String[] split = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.toString().substring(0, sb.length() - 1);
    }

    public static String reversedEachWord(String str) {
        String[] split = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            for (int i = s.length() - 1; i >= 0; i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();
    }
    public static int maxInArray(int[] arr){
        TreeSet<Integer> numbers=new TreeSet<>();
        for (Integer number : arr) numbers.add(number);
        return numbers.last();
    }
    public static int minValue(int[] arr){
        TreeSet<Integer> numbers=new TreeSet<>();
        for (Integer number : arr) numbers.add(number);
        return numbers.first();
        }

    public static int secondMax(int [] array){
        TreeSet<Integer> numbers=new TreeSet<>();
        for (Integer number : array)numbers.add(number);
        return new ArrayList<>(numbers).get(numbers.size()-2);
    }

    public static int secondMax1(int [] array) {
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) max = number;
        }
        for (int number : array) {
            if (number > maxSecond && number != max) maxSecond = number;
        }
        return maxSecond;
    }
    public static int secondMin(int[] array) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int number : array) {
            if (number < min) min = number;
        }
        for (int number : array) {
            if (number < secondMin && number != min) secondMin = number;
        }
        return secondMin;

    }
        public static int secondMin1(int[] array){
        TreeSet<Integer> numbers=new TreeSet<>();
        for (Integer number:array)numbers.add(number);
        return new ArrayList<>(numbers).get(1);
        }




    }









