package stringMethods;

import utilities.ScannerHelper;

public class _11_startsWithEndWith {
    public static void main(String[] args) {
        /*
        Method Task: They are used to finding out if the string starts with or ends with another letter or string
        -They are non-static as we call them with objects
        -They return boolean
        -They take String as an argument
         */

//        String str = "Today is Sunday";
//
//        System.out.println(str.startsWith("Today")); // true
//        System.out.println(str.startsWith("today")); // false
//        System.out.println(str.endsWith("day")); // true
//
//        System.out.println(str.toUpperCase().endsWith("SUNDAY")); // true
//
//        System.out.println(str.startsWith("is", 6)); // true
//
//
//        //System.out.println("Hello".startsWith('H')); // compiler error

        String name="They return boolean";
        System.out.println(name.indexOf("return"));

        System.out.println(name.charAt(name.indexOf("return")));
    }
}
