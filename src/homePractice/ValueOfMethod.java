package homePractice;

import java.util.Locale;
import java.util.Scanner;

public class ValueOfMethod {
    public static void main(String[] args) {
        String name="melda";
        String lName= "sav";
        String fullName=name + " " .concat(lName);
        System.out.println(fullName);

    }
    public static void maxOf4(int a,int b,int c,int d){
        System.out.println(Math.max((Math.max(a,b)), (Math.max(c,d))));



    }
}