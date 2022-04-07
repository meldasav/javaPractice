package stringMethods;

public class _05toLowerCase_toUpperCase {
    public static void main(String[] args) {


        // not  static
        //we can call them with object of string class
        //they return the modified string of object.
        //they don't take any arguments
        //2nd way
        /*
        Method Task: These methods are used to convert letters of a String to uppercase or lowercase
        -They are non-static methods that you can call them with objects of String class
        -They are return type methods, and they return the modified String object back
        -They don't take any argument
         */

        String s1 = "HELLO world 10$";

        System.out.println(s1); // HELLO world 10$
        System.out.println(s1.toLowerCase()); // hello world 10$
        System.out.println(s1.toUpperCase()); // HELLO WORLD 10$

        System.out.println("DFGSJJdfgk jdhfgsdflghis EW$TW%hjfij4856 erigldfk ".toUpperCase());


        String sentence = "I paid $100.99 to buy airpods";

        String s2 = sentence.toLowerCase(); // i paid $100.99 to buy airpods
        String s3 = sentence.toUpperCase(); // I PAID $100.99 TO BUT AIRPODS

        System.out.println(s3.toLowerCase().toUpperCase().toLowerCase()); //  i paid $100.99 to buy airpods
    }
}





