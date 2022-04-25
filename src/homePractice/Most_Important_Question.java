package homePractice;

import java.util.*;

public class Most_Important_Question {

    /**
     * /*
     * Write a method that takes 3 int arguments and returns the greatest number
     * NOTE: 2 or 3 numbers being same is okay
     */
    public static int greatestNumber1(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int greatestNumber2(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    public static int greatestNumber3(int a, int b, int c) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        return numbers.last();
    }

    public static int greatestNumber4(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    public static int smallestNumber1(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static int smallestNumber2(int a, int b, int c) {
        if (a <= b && a <= c) return a;
        else if (b <= a && b <= c) return b;
        else return c;
    }

    public static int smallestNumber3(int a, int b, int c) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(a);
        numbers.add(b);
        numbers.add(c);
        return numbers.first();
    }

    public static int smallestNumber4(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[0];
    }

    public static int middleNumber1(int a, int b, int c) {
        if (a == b || a == c) return a;
        else if (b == c) return b;
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }

    public static int middleNumber2(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[1];
    }

    /**
     * Write a method that takes a String and returns reversed String
     */
    public static String reversed1(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reversed2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public static String reversed3(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Write a method that takes a String and return String back with all digits removed
     * TEST DATA:
     * a1b2c3
     * EXPECTED OUTPUT:
     * abc
     */
    public static String removeDigits1(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) str1 += str.charAt(i);
        }
        return str1;
    }

    public static String removeDigits2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isDigit(c)) sb.append(c);
        }
        return sb.toString();
    }

    //48 -57
    public static String removeDigits3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 48 && c <= 57)) sb.append(c);
        }
        return sb.toString();
    }

    public static String removeDigits4(String str) {
        return str.replaceAll("[0-9]", "");
    }

    /**
     * Write a method that takes a String and return String back with all spaces removed
     * TEST DATA:
     * Java is fun
     * EXPECTED OUTPUT:
     * Javaisfun
     */
    public static String removeSpace1(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 32) str1 += c;//c!=' '
        }
        return str1;
    }

    public static String removeSpace2(String str) {
        return str.replaceAll(" ", "");
    }

    public static String removeSpace3(String str) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : split) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /**
     * Write a method that takes a String and return String back with all letters removed
     * TEST DATA:
     * Time is 8 PM.
     * EXPECTED OUTPUT:
     * [  8 .]
     */
    public static String removeLetters1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) sb.append(c);
        }
        return sb.toString().trim();
    }

    public static String removeLetters2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 65 && c <= 90 || c >= 97 && c <= 122)) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String removeLetters3(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z')) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }

    public static String removeLetters4(String str) {
        return str.trim().replaceAll("[A-Za-z]", "");
    }

    /**
     * Write a method that takes a String and return String back with all specials removed
     * TEST DATA:
     * The price = 100.50$
     * EXPECTED OUTPUT:
     * The price  10050
     */
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

    /**
     * Write a method that takes a String and return String back with all vowels removed
     * TEST DATA:
     * Hello World!
     * EXPECTED OUTPUT:
     * Hll Wrld!
     */
    public static String removeVowel1(String str) {
        return str.trim().replaceAll("[AEOUIaeoui]", "");
    }

    public static String removeVowel2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((!(c == 'A' ||
                    c == 'E' ||
                    c == 'O' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'o' ||
                    c == 'u' ||
                    c == 'i'))) {
                sb.append(c);
            }
        }
        return sb.toString().trim();

    }

    /**
     * Write a method that takes a String and return String back with all consonants removed
     * TEST DATA:
     * Hello World!
     * EXPECTED OUTPUT:
     * eo o!
     */
    public static String removeConsonants1(String str) {
        return str.trim().replaceAll("[^AEOUIaeuio\\d\\W]", "");
    }

    public static String removeConsonants2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'A' ||
                    c == 'E' ||
                    c == 'O' ||
                    c == 'U' ||
                    c == 'I' ||
                    c == 'a' ||
                    c == 'e' ||
                    c == 'o' ||
                    c == 'u' ||
                    c == 'i')) {
                sb.append(c);
            }
        }
        return sb.toString().trim();
    }
 /**
    Write a method that takes a String and return String back with all uppercase letters removed
    TEST DATA:
    Hello World!
    EXPECTED OUTPUT:
    ello orld!
     */
    public static String removeUpperCase1(String str){
        return str.trim().replaceAll("[A-Z]","");
    }
    public static String removeUpperCase2(String str){
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
            if(!Character.isUpperCase(c))sb.append(c);
        }
        return sb.toString().trim();
    }
     /**
    Write a method that takes a positive int argument and prints all the numbers from 1 to given number
    However, it prints “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
    and “FizzBuzz” for the numbers divided by both 3 and 5
    TEST DATA:
    15
      */
     public static void fizzBaz(int num){
         for (int i = 1; i <=num; i++) {
             if(i%15==0) System.out.println("FizzBazz");
             else if(i%5==0) System.out.println("Buzz");
             else if(i%3==0) System.out.println("Fizz");
             else System.out.println(i);
         }
     }
      /**
    Write a method that takes an int array argument and returns the count of prime numbers
    NOTE: Prime number is a number that can be divided only by 1 and itself
    NOTE: Negative numbers cannot be prime
    NOTE: The smallest prime number is 2
    Examples: 2,3,5,7,11,13,17,19,23,29,31,37 etc.
    TEST DATA:
    [-3, 5, 4, 0, 11]
    EXPECTED OUTPUT:
    2
     */
    public static int prime(int[] numbers){
        int count = 0;
        for (int number : numbers) {
            if(number == 2 || number == 3) count++;
            else if (number > 3){
                boolean prime = true;
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) count++;
            }
        }
        return count;
    }

    /**
       Write a method that takes an int array argument and returns the array back with all duplicates removed
       NOTE: the order of elements returned is not an issue.
       TEST DATA:
       [0, 5, 4, 0, 0]
       EXPECTED OUTPUT:
       [0, 4, 5]
     * @return
     */
    public static int[] removeDuplicates(int[]number){
        LinkedHashSet<Integer> numbers=new LinkedHashSet<>();
        for (int i : number)numbers.add(i);
        int[] arr=new int[numbers.size()];
        int index=0;
        for (int i : numbers) arr[index++]=i;
        return arr;
        }

 /**
    Write a method that takes a String array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    ["foo", "bar", "foo", "123", "bar"]
    EXPECTED OUTPUT:
    [bar, 123, foo]
     */
 public static String[] removeDuplicates(String[] str){
     ArrayList<String> uniques=new ArrayList<>();
     for(String s : str){
         if(uniques.contains(s)){
             continue;
         }
         uniques.add(s);
     }

     return uniques.toArray(new String[0]);
 }
 //2.way
 public static String[] removeDuplicates1(String[] str) {
     return new HashSet<>(Arrays.asList(str)).toArray(new String[0]);
 }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new String[]{"foo", "bar", "foo", "123", "bar"})));
        System.out.println(Arrays.toString(removeDuplicates1(new String[]{"foo", "bar", "foo", "123", "bar"})));
    }


}

