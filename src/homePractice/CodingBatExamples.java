package homePractice;

import java.util.Arrays;
import java.util.Random;

public class CodingBatExamples {
    public static void main(String[] args) {
        System.out.println(removeCon("today is Thursday"));//test your method
       int[] numbers= getArray(5,50);
        System.out.println(Arrays.toString(numbers));
        /*
        create a method
        1.Check the word contain more than 1 word and the length of word is less than 3
        return empty string
        2.if word contain "con" remove it and return string
        3.else return the word
         */
    }
        public static String removeCon(String word){
        word=word.toLowerCase().trim();
        if(word.contains(" ") || word.length()<3){
            System.out.println("invalid data");
            return "";
        }
        if(word.contains("con")){
            String s=word.replace("con","");
            return s;
        }
        else{
            return word;
        }
        }
        /* create a method that takes integer size ,integer bound and return array of integer
           create list of integer assign random number between zero and given bound
         */
        public static int[] getArray(int size,int bound){
            int[] numS=new int[size];
            Random random=new Random();
            for (int i = 0; i < numS.length; i++) {
                numS[i]=random.nextInt(bound);
            }
            return numS;
        }

}
