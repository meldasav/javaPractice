package homePractice;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String string = "Java is fun ok";
        String[] arr = string.split(" ");
        for (String s : arr) {
            for (int j = s.length() - 1; j >= 0; j--) {
                System.out.print(s.charAt(j));
            }
            System.out.print(" ");
        }


        }
    }

