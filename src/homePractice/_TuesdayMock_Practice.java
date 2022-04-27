package homePractice;

import java.util.*;

public class _TuesdayMock_Practice {


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
        return str.replaceAll("[^AEOUIaeoui\\d\\W_]", "");
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
        int average = 0;
        for (int i : number) {
            average += i;
        }
        return average / number.length;
    }

    public static int countZero(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i == 0) count++;
        }
        return count;
    }

    public static int countPositive(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i > 0) count++;
        }
        return count;
    }

    public static int countNegative(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i < 0) count++;
        }
        return count;
    }

    public static int countNumbersGreaterThen10(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i > 10) count++;
        }
        return count;
    }

    public static int countEven(int[] number) {
        int count = 0;
        for (int i : number) {
            if (i % 2 == 0) count++;
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static boolean isPalindrome1(String str) {
        StringBuilder str1 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            str1.append(str.charAt(i));
        }
        return str.equals(str1.toString());
    }


    public static boolean isAnagram(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    public static ArrayList<Integer> removeDup1(ArrayList<Integer> numbers) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (Integer integer : numbers) {
            if (myList.contains(integer)) {
                continue;
            }
            myList.add(integer);
        }
        return myList;
    }

    public static ArrayList<Integer> removeDup2(ArrayList<Integer> numbers) {
        return new ArrayList<>(new HashSet<>(numbers));
    }

    public static ArrayList<String> removeDupInString(ArrayList<String> strings) {
        return new ArrayList<>(new HashSet<>(strings));
    }

    public static ArrayList<String> removeDupInString1(ArrayList<String> strings) {
        ArrayList<String> remove = new ArrayList<>();
        for (String s : strings) {
            if (remove.contains(s)) {
                continue;
            }
            remove.add(s);
        }
        return remove;
    }

    public static void fibonacciNumbers(int number) {
        StringBuilder sb = new StringBuilder();
        int n1 = 0, n2 = 1, n3 = 0;
        for (int i = 0; i < number; i++) {

            sb.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
        System.out.print(sb.toString().substring(0, sb.length() - 1));
    }

    public static int countSpace1(String str) {
        int count_space = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isSpaceChar(str.charAt(i))) count_space++;
        }
        return count_space;
    }

    public static int countSpace2(String str) {
        int countS = 0;
        for (Character c : str.trim().toCharArray()) {
            if (Character.isSpaceChar(c)) countS++;
        }
        return countS;
    }

    public static int countSpace3(String str) {
        return str.split(" ").length;
    }

    public static int countLetters(String str) {
        int countLetters = 0;
        for (Character c : str.toCharArray()) {
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122) countLetters++;
        }
        return countLetters;
    }

    public static int countVowels1(String str) {
        int countVowels = 0;
        for (Character c : str.toCharArray()) {
            if (!(c == 'A' ||
                    c == 'E' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'O' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'i' ||
                    c == 'o' ||
                    c == 'u'
            )) countVowels++;
        }
        return countVowels;
    }

    public static int countWords(String str) {
        int countWords = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') countWords++;
        }
        return countWords;
    }

    public static String removeExtraSpace(String str) {
        String[] split = str.trim().split(" ");
        StringBuilder s1 = new StringBuilder();
        for (String s : split) {
            if (!s.isEmpty()) s1.append(s).append(" ");
        }
        return s1.substring(0, s1.length() - 1);
    }

    public static String removeExtraSpace1(String str) {
        return str.trim().replaceAll("\\s+", " ");
    }

    public static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i)).append("");
        }
        return sb.toString().trim();
    }

    public static int[] maxNumberInTwoArray(int[] number1, int[] number2) {
        int[] result = new int[number1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(number1[i], number2[i]);
        }
        return result;
    }

    public static int secondMax(int[] number){
        TreeSet<Integer>numberInOrder=new TreeSet<>();
        for (int i : number )numberInOrder.add(i);
        return new ArrayList<>(numberInOrder).get(numberInOrder.size()-2);

        }
    public static int secondMax1(int[] number){
        int max1=Integer.MIN_VALUE;
        for (int i : number) {
            if (i > max1) max1 = i;
            int max2 = Integer.MIN_VALUE;
            for (int i1 : number) {
            if (i1 > max2 && i1 != max1) max2 = i1;
            }
            return max2;
        }
        return 0;
    }

    public static String removeConsonants4(String str) {
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
                    || c == 'u') sb.append(c);
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        System.out.println(removeDupInString1(new ArrayList(Arrays.asList("foo", "bar", "foo", "123", "bar"))));
        System.out.println(Arrays.toString(maxNumberInTwoArray(new int[]{1, 2, 3, 4, 5}, new int[]{4, 2, 6, 4, 9})));
        System.out.println((secondMax(new int[]{1, 2, 3, 4, 5})));
        System.out.println(removeConsonants1("melda127"));
    }

}
