package javaMemoryManagement;

public class ReverseExercises {

    public static void main(String[] args) {
        System.out.println(reversedString("melda"));
        System.out.println(reversed2("MELDA"));
        System.out.println(palindrome("Madam"));
    }
    public static String reversedString(String str){
        StringBuilder reversed= new StringBuilder();
        for (int i = str.length()-1; i >=0; i--) {
             reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
    public static String reversed2(String str1){
        StringBuilder sb=new StringBuilder();
        sb.reverse();
        return sb.toString();
    }
    public static String reverse1(String str){
        return  new StringBuilder(str).reverse().toString();
    }

    //palindrome

    public static boolean palindrome(String str){
        return str.equals( new StringBuilder(str).reverse().toString());
    }








}
