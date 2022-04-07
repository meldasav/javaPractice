package homePractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
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
}
