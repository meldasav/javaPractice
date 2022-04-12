package homePractice.whiteBoardQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
    public static int _GreatestNumberOf3(int a,int b,int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        return c;
    }
    //WAY 4: Store the given ints in an array and return the last index of the array after sorting it
    public static int greatestNumberOf3(int a,int b,int c){
        int[] numbers={a,b,c};
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }
   //Find the smallest number of 3
    public static int smallestOfThree(int a,int b,int c){
        int[] number={a,b,c};
        Arrays.sort(number);
        return number[0];
    }
    //Find the middle number
    public static int findTheMiddleOf3(int a, int b,int c) {
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
        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);
        }
        return reversed;
    }
    //2.way
    public static String reversed1(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String reversedString(String str){
        StringBuilder r=new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            r.append(str.charAt(i));
        }
        return r.toString();
    }
    //palindrome
    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    //write a method takes string argument return sum of the digits in giving string

    public static int totalOfDigit(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            char c =str.charAt(i);
        if(Character.isDigit(c)){
            sum+=Integer.parseInt(String.valueOf(c));
        }
        }
        return sum;
    }
    public static void main (String[] args) {
        System.out.println(removeConsonants("$melda 19 83"));
    }
    //remove digits
    public static String removeDigits(String str){
        return str.replaceAll("[0-9]","");
    }
    //remove space
    public static String removeSpace(String str){
        return str.replaceAll(" ","");
    }
    public static String removeLetter(String str){
        return str.replaceAll("[A-Za-z]","");
    }
    //remove specials
    public static String removeSpecials(String str){
        return str.replaceAll("[^a-zA-Z0-9]","");
    }
    //REMOVE vowels
    public static String removeVowels(String str){
        return  str.replaceAll("[AEIOUaeuio]","");
    }
    public static String removeConsonants(String str){
        return str.replaceAll("[^AEIOUaeuio\\d\\W]","");
    }
    public  static String removeUpperCase(String str){
        return str.replaceAll("[A-Z]","");
        }
    public static String removeLowerCase(String str){
    return str.replaceAll("[a-z]","");
        }

    }







