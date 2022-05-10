package homeworks.homeworks_fixed;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class SumOfGivingString {
    public static void main(String[] args) {
        System.out.println(sumNumbers("abc123xyz"));
        System.out.println(reverse("melda"));
        System.out.println(noSpace("Tech Global"));
        System.out.println(replaceFirstLast("    MeldaSav     "));
        System.out.println(hasVowel("MeldaSav"));
        checkAge(2007);
        System.out.println(averageOfEdges(-2, -2, 10));
        System.out.println(Arrays.toString(noA(new String[]{"appium", "123", "ABC", "java"})));
        System.out.println(Arrays.toString(no3or5(new int[]{3, 4, 5, 6})));
    }

    public static int sumOfDigit1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static int sumOfDigit2(String str) {
        int sum = 0;                //[\\D]
        str = str.replaceAll("[A-Za-z]", "");
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    public static int sumOfDigit3(String str) {
        int sum = 0;
        str = str.replaceAll("[\\D]", "");
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }

    public static int sumOfDigit4(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt("" + c);
            }
        }
        return sum;
    }

    public static int sumOfDigit5(String str) {
        return str.chars().filter(Character::isDigit).map(c -> c - '0').sum();
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static int sumNumbers(String str) {
        int sum = 0;
        for (String s : str.split("(\\D+)")) {
            if (!s.isEmpty()) {
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }

    public String notReplace(String str) {
        StringBuilder result = new StringBuilder();
        str = " " + str + "  ";
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.startsWith("is", i) &&
                    !Character.isLetter(str.charAt(i - 1))
                    && !Character.isLetter(str.charAt(i + 2))) {
                result.append("is not");
                i++;
            } else result.append(str.charAt(i));
        }
        return result.toString().trim();
    }

    public static String noSpace(String str) {
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()) return "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String replaceFirstLast(String str) {
        if (str.length() < 2) return "";
        str = str.trim();
        return "" + str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);

    }

    public static boolean hasVowel(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return Arrays.binarySearch(c, 'a') >= 0 || Arrays.binarySearch(c, 'e') >= 0 || Arrays.binarySearch(c, 'i') >= 0 ||
                Arrays.binarySearch(c, 'o') >= 0 || Arrays.binarySearch(c, 'u') >= 0;
    }

    public static void checkAge(int yearOfBirth) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int currentAge = (currentYear - yearOfBirth);
        if (currentAge < 16) System.out.println("Age " + currentAge + " is not allowed");
        else if (currentAge > 16) System.out.println("Age " + currentAge + " is allowed");
        else System.out.println("Age " + currentAge + "is not valid");
    }

    public static int averageOfEdges(int a, int b, int c) {
        return (Math.min(a, Math.min(b, c)) + Math.max(a, Math.max(b, c))) / 2;
    }

    public static String[] noA(String[] str) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].toLowerCase().startsWith("a")) {
                str[i] = "###";
            }
        }
        return str;
    }

    public static int[] no3or5(int[] numbers) {
        int [] array=new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 15 == 0) numbers[i] = 101;
            else if (numbers[i]  % 5 == 0) numbers[i] = 99;
            else if (numbers[i]  % 3 == 0) numbers[i] = 100;
            else numbers[i]=array[i];
        }
        return numbers;
    }

}