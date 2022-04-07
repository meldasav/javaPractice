package homePractice;

import java.util.Scanner;

public class CountTheLetterFromString {
    public static void main(String[] args) {
         String str="Abraham";
         int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.toLowerCase().charAt(i)=='a')counter++;
        }
        System.out.println(counter);
            }
        }






