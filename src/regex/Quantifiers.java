package regex;

import java.util.regex.Pattern;

public class Quantifiers {
    public static void main(String[] args) {
    System.out.println(Pattern.matches("[a-z]+","hello"));//1 or more times//true
    System.out.println(Pattern.matches("[a-z]+","h"));//1 or more times//true
    System.out.println(Pattern.matches("[a-z]+","1"));//1 or more times//false
    System.out.println(Pattern.matches("[a-zA-Z]{3,}","hello class"));//1 or more times//false//last one include space that's why it is wrong
    System.out.println(Pattern.matches("[a-zA-Z ]{3,}","hello class"));//1 or more times//false
 //this one is true because we add space after Z


    }
}
