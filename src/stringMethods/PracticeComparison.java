package stringMethods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class PracticeComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 2 words");
        String word1 = scan.nextLine(), word2 = scan.nextLine();
        System.out.println(word1.equals(word2));
        if (word1.equals(word2))
            System.out.println("These strings are equal");
        else System.out.println("not equal");

    }

    public static String getAStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        return string;

        //2nd way
       // System.out.println("\n---------2nd-way---------\n");
      //  System.out.println(ScannerHelper.getAStringFromUser().equals(ScannerHelper.getAStringFromUser()) ? "These string are equal" : "These string are not equal");

    }
}