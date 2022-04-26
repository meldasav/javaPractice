package homePractice;

import java.util.Arrays;
import java.util.HashSet;

public class _TuesdayMock_Practice {

    public static void main(String[] args) {
        System.out.println(countPositive(new int[]{1,-3,5,9,5,6,}));
    }

    public static String reversed1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reversed2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String removeDigits1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeDigits2(String str) {
        return str.replaceAll("[0-9]", "");
    }

    public static String removeSpace1(String str) {
        return str.replaceAll(" ", "");
    }

    public static String removeSpace2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isSpaceChar(c)) sb.append(c);
        }
        return sb.toString();

    }

    public static String removeSpace3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 32) sb.append(c);
            //c!=' '
        }
        return sb.toString();
    }

    public static String removeLetters1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeLetters2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 65 && c <= 90 || c >= 97 && c <= 122)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeLetters3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeLetters4(String str) {
        return str.replaceAll("[A-Za-z]", "");
    }

    public static String removeSpecials1(String str) {
        return str.replaceAll("[^A-Za-z0-9]", "");
    }

    public static String removeSpecials2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c) || Character.isDigit(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeSpecials3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 65 && c <= 90 || c >= 97 &&
                    c <= 122 || c >= 48 && c <= 57)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeVowels1(String str) {
        return str.replaceAll("[AEOUIaeuio]", "");
    }

    public static String removeVowels2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c == 'A'
                    || c == 'E'
                    || c == 'O'
                    || c == 'U'
                    || c == 'I'
                    || c == 'a'
                    || c == 'e'
                    || c == 'i'
                    || c == 'o'
                    || c == 'u')) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeConsonants1(String str) {
        return str.replaceAll("[^AEOUIaeoui\\d\\W]", "");
    }

    public static String removeConsonants2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'A'
                    || c == 'E'
                    || c == 'O'
                    || c == 'U'
                    || c == 'I'
                    || c == 'a'
                    || c == 'e'
                    || c == 'i'
                    || c == 'o'
                    || c == 'u'
                    || c >= 48 && c <= 57) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeUpperCase1(String str) {
        return str.replaceAll("[A-Z]", "");
    }

    public static String removeUpperCase2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isUpperCase(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeUpperCase3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 65 && c <= 90)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeUpperCase4(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'A' && c <= 'Z')) sb.append(c);
        }
        return sb.toString();
    }

    public static int sumOfGivingString(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
                // c + " "
            }
        }
        return sum;
    }

    public static void printNumber1To(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.println(i);
        }
    }

    public static void printEvenNumber1To(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }

    public static void printOddNumber1To(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) System.out.println(i);
        }
    }

    public static void fizzBaz(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 15 == 0) System.out.println("FizzBazz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Baz");
            else System.out.println(i);
        }
    }

    public static int[] sumOfArray(int[] number) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return new int[]{sum};
    }

    public static int productOfArray(int[] number) {
        int product = 1;
        for (int num : number) product *= num;
        return product;
    }
    public static int averageOfNumbers(int[] number) {
        int average=0;
        for (int i : number) {
            average+=i;
        }
        return average/number.length;
    }
    public static int countZero(int[] number) {
        int count=0;
        for (int i : number) {
            if(i==0)count++;
        }
        return count;
    }
    public static int countPositive(int[] number) {
        int count=0;
        for (int i : number) {
            if(i>0)count++;
        }
        return count;
    }
    public static int countNegative(int[] number) {
        int count=0;
        for (int i : number) {
        if(i<0)count++;
        }
        return count;
    }
    public static int countNumbersGreaterThen10(int[] number) {
        int count=0;
        for (int i : number) {
            if(i>10)count++;
        }
        return count;
    }
    public static int countEven(int[] number) {
        int count=0;
        for (int i : number) {
            if(i%2==0)count++;
        }
        return count;
    }

    }
