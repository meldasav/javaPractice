package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Basic_Regex {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(" ");
        Matcher matcher = pattern.matcher("I love TechGlobal");
        System.out.println(matcher.matches());//check if they are matches return true or false
        while(matcher.find()){//find the next matched pattern in the given string
            System.out.println( matcher.group());//print out the next matched pattern in the given string
            System.out.println("Start index" +matcher.start());//returns int print out where found pattern starts
            System.out.println("end index" +matcher.end());//returns int print out where found pattern ends

        }
        System.out.println(Pattern.matches("[xyz]","xyz"));//compare each
        System.out.println(Pattern.matches("[xyz]","xxxx"));
        System.out.println(Pattern.matches("[xyz]","x"));
        System.out.println(Pattern.matches("[^xyz]","y"));
        System.out.println(Pattern.matches("[^a-z]","123"));
    }
}
