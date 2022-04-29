package homePractice;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String string = "Java is fun ok";
        String[] arr = string.split(" ");
        for(int i = 0; i < arr.length; i ++){
            for (int j = arr[i].length()-1; j >=0; j-- ){
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
    }
}