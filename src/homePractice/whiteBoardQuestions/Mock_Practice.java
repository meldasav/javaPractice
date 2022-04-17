package homePractice.whiteBoardQuestions;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

public class Mock_Practice {

    /*
   Write a method that takes 3 int arguments and returns the greatest number
   NOTE: 2 or 3 numbers being same is okay
   TEST DATA:
   3, 3, 5
   EXPECTED OUTPUT:
   5
   Use if else statements to find max value of 3 int variables as below
    */
    public static int _GreatestNumberOf3(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        return c;
    }

    //WAY 4: Store the given ints in an array and return the last index of the array after sorting it
    public static int greatestNumberOf3(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    //Find the smallest number of 3
    public static int smallestOfThree(int a, int b, int c) {
        int[] number = {a, b, c};
        Arrays.sort(number);
        return number[0];
    }

    //Find the middle number
    public static int findTheMiddleOf3(int a, int b, int c) {
        if (a == b || b == c) return b;
        else if (a == c) return a;
        int greatest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));
        if (a != greatest && a != smallest) return a;
        else if (b != greatest && b != smallest) return b;
        else return c;
    }

    //reversed String 1.way
    public static String reversed(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    //2.way
    public static String reversed1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String reversedString(String str) {
        StringBuilder r = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            r.append(str.charAt(i));
        }
        return r.toString();
    }

    //palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    //write a method takes string argument return sum of the digits in giving string

    public static int totalOfDigit(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }


    //remove digits
    public static String removeDigits(String str) {
        return str.replaceAll("[0-9]", "");
    }

    //remove space
    public static String removeSpace(String str) {
        return str.replaceAll(" ", "");
    }

    public static String removeLetter(String str) {
        return str.replaceAll("[A-Za-z]", "");
    }

    //remove specials
    public static String removeSpecials(String str) {
        return str.replaceAll("[^a-zA-Z0-9]", "");
    }

    //REMOVE vowels
    public static String removeVowels(String str) {
        return str.replaceAll("[AEIOUaeuio]", "");
    }

    public static String removeConsonants(String str) {
        return str.replaceAll("[^AEIOUaeuio\\d\\W]", "");
    }

    public static String removeUpperCase(String str) {
        return str.replaceAll("[A-Z]", "");
    }

    public static String removeLowerCase(String str) {
        return str.replaceAll("[a-z]", "");
    }

    //write a method remove digits from giving string
    public static String removeDigit(String str) {
        StringBuilder s = new StringBuilder();
        for (char o : str.toCharArray()) {
            if (!Character.isDigit(o)) {
                s.append(o);
            }
        }
        return s.toString();
    }

    public static String removeSpecials1(String str1) {
        StringBuilder s = new StringBuilder();
        for (char o : str1.toCharArray()) {
            if (Character.isLetter(o) || Character.isDigit(o)) {
                s.append(o);
            }
        }
        return s.toString();

    }

    public static String removeSpecials2(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
                s.append(c);
            }
        }
        return s.toString();

    }



    //   Write a method that takes a String and return String back with all uppercase letters removed
    public static String _11_Remove_Uppercase_Letters_From_String(String str) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isUpperCase(c)) {
                s.append(str.charAt(i));
            }
        }
        return s.toString();
    }

    public static String noUpperCase(String str) {
        return str.replaceAll("[A-Z]", "");
    }

    /*
    Write a method that takes a positive int argument and prints all the numbers from 1 to given number
    However, it prints “Fizz” for the numbers divided by 3, “Buzz” for the numbers divided by 5,
    and “FizzBuzz” for the numbers divided by both 3 and 5
    */
    public static void printNumbersOneToGivenFizzBuzz(int a) {
        for (int i = 0; i <= a; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else System.out.println(i);
        }

    }

    public static int sum(int[] num) {
        int sum = 0;
        for (int number : num) {
            sum += number;
        }
        return sum;
    }

    public static int product(int[] product) {
        int pro = 1;
        for (int number : product) {
            pro *= number;
        }
        return pro;
    }

    public static int average(int[] average) {
        int sum = 0;
        for (int number : average) {
            sum += number;
        }
        return sum / average.length;
    }

    //is prime number
    public static int prime(int[] numbers) {
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

    public static int countOddNumbers(int[] numbers) {
        int count = 0;
        for (int number : numbers) {
            if (number % 2 == 1) count++;
        }
        return count;
    }
   /*Create containers
        create loop
        print out series
              n1   n2   n3
        i =0  0    1    1
        i =1  1    1    2
        i=3   1    2    3
        i=4   2    3    5
         */

    public static void _Fibonacci_Series_Of_Given_Number(int number) {
        int n1 = 0, n2 = 1, n3 = 2;
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < number; i++) {
            s.append(n1).append("-");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

        }
        System.out.print(s.substring(0, s.length() - 1));
    }
    //   Write a method that takes a String argument and returns the count of spaces as an int

    public static int _34_Count_Spaces_In_A_String(String str) {
        int countSpace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') countSpace++;
        }
        return countSpace;
    }

    public static int countSpaces(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (Character.isSpaceChar(c)) count++;
        }
        return count;
    }

    public static int countWords(String str) {
        int countWords = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') countWords++;
        }
        return countWords;
    }

    public static String removeSpace1(String str) {
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : str1) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    /*
    if number 0 or 1 return 1 else create temp variable asigned to number create fori loop starting from 2 until temp asigned number* to i return number
     */
    public static int numbersFactorial(int number) {
        if (number == 0 || number == 1) return 1;
        else {
            int temp = number;
            for (int i = 2; i < temp; i++) {
                number *= i;
            }
        }
        return number;
    }
    //create loop start from 0 goes until number.length()
     /*
       if number[i]==0 or 1 assign number[i]=1
       else
       create int variable called number asigned to numbers[i]
       create second loop start at 2 goes until number
       asigned number[i]*=j;
       return numbers
      */

    public static int[] factorial1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 || numbers[i] == 1) numbers[i] = 1;
            else {
                int number = numbers[i];
                for (int j = 2; j < number; j++) {
                    numbers[i] *= j;
                }
            }
        }
        return numbers;
    }
    //find the max number in array
    /*
    put max number in min value
    create a loop in arry length
    if array bigger than max asign meax to be array[i]
    return max
     */

    public static int maxValue(int[] array) {
        int max = MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) max = array[i];
        }
        return max;
    }

    public static int minValue(int[] array) {
        int min = MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }

    public static void main(String[] args) {
        //   _Fibonacci_Series_Of_Given_Number(13);
        //   System.out.println(numbersFactorial(5));
        System.out.println(Arrays.toString(factorial1(new int[]{0, 5, 4, 1, 3, 2})));
        System.out.println(minValue((new int[]{-5, 4, 1, 10, 2})));

    }
}




