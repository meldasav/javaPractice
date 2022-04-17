package homePractice;

import java.util.Arrays;

public class PracticeFinalMockInterview {
    public static void main(String[] args) {
        System.out.println(removeLetters1(("89mel  78da12")));
    }

    /*
   Write a method that takes 3 int arguments and returns the greatest number
   NOTE: 2 or 3 numbers being same is okay
   TEST DATA:
   3, 3, 5
   EXPECTED OUTPUT:
   5
    */
    public static int greatestNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    //Second way
    public static int greatestNumber1(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }

    // way 3
    public static int greatestNumber2(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    /*
    Write a method that takes 3 int arguments and returns the middle number
    NOTE: 2 or 3 numbers being same is okay
    TEST DATA:
    4, 4, 5
    EXPECTED OUTPUT:
    4
     */
    public static int middleNumber(int a, int b, int c) {
        int[] numbers = {a, b, c};
        Arrays.sort(numbers);
        return numbers[1];
    }

    //way 2
    public static int middleNumber1(int a, int b, int c) {
        if (a == b || a == c) return a;
        else if (b == c) return b;

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));

        if (a != max && a != min) return a;
        else if (b != max && b != min) return b;
        else return c;
    }
     /*
    Write a method that takes a String and returns reversed String
    TEST DATA:
    Hello
    EXPECTED OUTPUT:
    olleH
     */

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
     /*
    Write a method that takes a String and return String back with all digits removed
    TEST DATA:
    a1b2c3
    EXPECTED OUTPUT:
    abc
     */

    //1.way
    public static String removeDigit(String str){
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isDigit(str.charAt(i))){
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
    //2.way
    public static String removeDigit1(String str){
        return str.replaceAll("[0-9]","");
    }
    /*
    Write a method that takes a String and return String back with all spaces removed
    TEST DATA:
    Java is fun
    EXPECTED OUTPUT:
    Javaisfun
     *///first way
    public static String removeExtraSpace1(String str){
        String[] str1=str.trim().split(" ");
        String s1="";
       for (String s : str1){
           if(!s.isEmpty()) s1+=s+" ";
       }
       return s1.substring(0,s1.length()-1);
    }
    //second way
    public static String removeExtraSpace2(String str) {
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : str1) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }
   //FIRST WAY
    public static String removeAllSpace3(String str) {
        return str.replaceAll(" ","");
    }
    //SECOND WAY
    public static String removeAllSpace4(String str){
        String s="";
        for (int i = 0; i < str.length(); i++) {
            if(!Character.isSpaceChar(str.charAt(i))){
                s+=str.charAt(i);
            }
        }
        return s;
    }
    /*
    Write a method that takes a String and return String back with all letters removed
    TEST DATA:
    Time is 8 PM.
    EXPECTED OUTPUT:
    [  8 .]
     */
    //First way
    public static String removeLetters(String str){
        return str.replaceAll("[A-Za-z]","");
    }
    public static String removeLetters1(String str){
        String s="";
        for (int i = 0; i < str.length(); i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c) ||  !Character.isLetter(c)){
                s+=c;
        }
    }
        return s;
  }
}