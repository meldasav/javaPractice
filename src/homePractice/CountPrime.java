package homePractice;

import java.util.Arrays;

public class CountPrime {

    public static void main(String[] args) {
        System.out.println(countPrime(new int[]{1, 4, 7}));
        System.out.println(sumOfGivingString("melda123"));
        System.out.println(hasBoard1(new String[]{"board", "Mouse", "table"}));
    }

    public static int countPrime(int[] array) {

        int countPrime = 0;
        for (int number : array) {
            if (number > 1 && number % 2 != 0 || number == 2) countPrime++;
        }
        return countPrime;
    }

    public static int sumOfGivingString(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt("" + c);
            }                         //String.valueOf(c)
        }
        return sum;
    }

    public static boolean hasBoard(String[] str) {
        Arrays.sort(str);
        return (Arrays.binarySearch(str, "board") >= 0);
    }

    public static boolean hasBoard1(String[] str) {
        boolean hasBoard = false;
        for (String s : str) {
            if (s.equals("board")) {
                hasBoard = true;
                break;
            }
        }
        return hasBoard;
    }

    public static boolean validPassword(String str) {
        if (str.contains(" ") || str.length() < 8 || str.length() > 16) return false;
        boolean uppercase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specials = false;
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) uppercase = true;
            else if (Character.isLowerCase(c)) lowerCase = true;
            else if (Character.isDigit(c)) digit = true;
            else specials = true;
        }
        return uppercase && lowerCase && digit && specials;
    }
}