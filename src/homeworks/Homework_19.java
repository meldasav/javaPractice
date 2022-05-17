package homeworks;

import java.util.Arrays;

public class Homework_19 {
    public static void main(String[] args) {
        System.out.println("*******TASK1*******");
        System.out.println(noDigit(""));
        System.out.println(noDigit("java"));
        System.out.println(noDigit1("123Hello"));
        System.out.println(noDigit2("123Hello World149"));
        System.out.println(noDigit2("123Tech456Global149"));
        System.out.println("*******TASK2*******");
        System.out.println(noVowel(""));
        System.out.println(noVowel("xyz"));
        System.out.println(noVowel("JAVA"));
        System.out.println(noVowel("125$"));
        System.out.println(noVowel("TechGlobal"));
        System.out.println("*******TASK3*******");
        System.out.println(sumOfDigits(""));
        System.out.println(sumOfDigits("java"));
        System.out.println(sumOfDigits("John’s age is 29"));
        System.out.println(sumOfDigits("125.0"));
        System.out.println("*******TASK4*******");
        System.out.println(hasUpperCase(""));
        System.out.println(hasUpperCase("java"));
        System.out.println(hasUpperCase("John’s age is 29"));
        System.out.println(hasUpperCase("$125.0"));
        System.out.println("*******TASK5*******");
        System.out.println(middleInt(1, 1, 1));
        System.out.println(middleInt(1, 2, 2));
        System.out.println(middleInt(5, 5, 8));
        System.out.println(middleInt(5, 3, 5));
        System.out.println(middleInt(-1, 25, 10));
        System.out.println("*******TASK6*******");
        System.out.println(Arrays.toString(no13(new int[]{13, 2, 3})));
        System.out.println(Arrays.toString(no13(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(no13(new int[]{13, 13, 13, 13, 13})));
        System.out.println("*******TASK7*******");
        System.out.println(Arrays.toString(arrFactorial(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{0, 2, 4, 1})));
        System.out.println(Arrays.toString(arrFactorial(new int[]{5, 0, 6})));
        System.out.println("*******TASK8*******");
        System.out.println(Arrays.toString(categorizeCharacters("abc123$#%")));

    }

    /**
     * -Create a method called noDigit()
     * -This method will take one String argument And it will
     * return a new String with all digits removed from the
     * original String
     */
    public static String noDigit(String str) {
        return str.trim().replaceAll("[0-9]", "");
    }

    //2.way
    public static String noDigit1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    //3.way
    public static String noDigit2(String str) {
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!(c >= 65 && c <= 90
                    || c >= 97 && c <= 122)) {
                continue;
            }
            sb.append(c);
        }
        return sb.toString().trim();
    }

    /**
     * -Create a method called noVowel()
     * -This method will take one String argument And it will
     * return a new String with all vowels removed from the
     * original String
     */
    public static String noVowel(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' ||
                    c == 'o' || c == 'u' ||
                    c == 'i' || c == 'A' ||
                    c == 'O' || c == 'U' ||
                    c == 'E' || c == 'I') {
                continue;
            }
            sb.append(c);
        }
        return sb.toString().trim();
    }

    /**
     * -Create a method called sumOfDigits()
     * -This method will take one String argument
     * And it will return an int sum
     * of all digits from the original String.
     */
    public static int sumOfDigits(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(c + "");
            }
        }
        return sum;
    }

    /**
     * -Create a method called hasUpperCase()
     * -This method will take one String argument
     * And it will return boolean
     * true if there is an uppercase letter and false otherwise
     */
    public static boolean hasUpperCase(String str) {
        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) return true;
        }
        return false;
    }

    /**
     * -Create a method called middleInt()
     * -This method will take three int arguments
     * And it will return the middle int
     */
    public static int middleInt(int a, int b, int c) {
        if (a == b || b == c) return b;
        else if (a == c) return a;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }

    /**
     * -Create a method called no13()
     * -This method will take an int array as argument
     * And it will return a new
     * array with all 13 replaced with 0.
     */
    public static int[] no13(int[] numS) {
        int[] array = new int[numS.length];
        for (int i = 0; i < numS.length; i++) {
            if (numS[i] == 13) {
                numS[i] = 0;
                array[i] = numS[i];
            }
        }

        for (int i = 0; i < numS.length; i++) {
            array[i] = numS[i];
        }
        return array;
    }

    /**
     * -Create a method called arrFactorial()
     * -This method will take an int array as argument
     * And it will return the
     * array with every number replaced with their factorials.
     */
    public static int[] arrFactorial(int[] number) {
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

    /**
     * Create a method called categorizeCharacters()
     * -This method will take String as an argument and return a String array as
     * letters at index of 0, digits at index of 1 and specials at index of 2.
     * NOTE: IGNORE SPACES
     */
    public static String[] categorizeCharacters(String str) {
        String[] arr = new String[3];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isLetter(c)) {
                    arr[0] += String.valueOf(c);
                } else if (Character.isDigit(c)) {
                    arr[1] += String.valueOf(c);
                } else {
                    arr[2] += String.valueOf(c);
                }
            }
        return arr;
        }
    }

