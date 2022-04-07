package stringMethods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class _16_split {
    public static void main(String[] args) {
        String s="Banana is nice";
      String [] sSplitFromSpaces= s.split(" ");
        System.out.println(Arrays.toString(sSplitFromSpaces));
        String [] sSplitFromI=s.split("i");
        System.out.println(Arrays.toString(sSplitFromI));
        String[] sSplitFromA=s.split("a");
        System.out.println(Arrays.toString(sSplitFromA));


    }
}
