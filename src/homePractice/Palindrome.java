package homePractice;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));
        System.out.println("\nTASK2\n");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();
        String rWord = "";
        if (!word.isEmpty()) {
            for (int i = word.length() - 1; i >= 0; i--) rWord += word.charAt(i);
            if (rWord.equals(word)) System.out.println("this word is palindrome");
            else System.out.println("this word is not palindrome");
        } else {
            System.out.println("this word does not have 1 or more characters");
        }
    }


    public static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder();
        if(!str.isEmpty()){
            for (int i = str.length() - 1; i >= 0; i--) {
                StringBuilder s = sb.append(str.charAt(i));
                if (s.toString().equals(str)) return true;
            }
        }
        return false;
    }
    public static boolean isAnagram(String str){
        char[] array1=str.toCharArray();
        char[] array2=str.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }

}

