package homePractice;

import java.util.Scanner;

public class WriteNamePrettyWithLoops {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your first name?");
        String firstName = scan.nextLine();
//        for (int i = 0; i <= firstName.length(); i++) {
//            System.out.println(firstName.substring(0, i));
//
//        }
        for (int i = firstName.length() - 1; i > 0; i--) {
            System.out.println(firstName.substring(0, i));

        }

        String s2 = "abcdef";

        for (int i = 0; i < s2.length(); i++) {
            System.out.println(s2.substring(i));
        }




    }

}