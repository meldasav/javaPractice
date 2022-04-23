package array;

import java.util.Arrays;

public class _8_PracticeCount_Word {
    public static void main(String[] args) {
        /*
TASK-1
Assume you are given a String as below
Please find how many words you have in the given String

String s1 = "Today is Tuesday";

RESULT:
3
 */      //count the words
        String s4="Today is Tuesday";
        int countSpace=0;
        for(char c : s4.toCharArray()){
            if(c==' ')countSpace++;
        }
        System.out.println(countSpace+1);

        //1.way
        String s1="Today is Tuesday";
       String []str1= s1.split(" ");
       int counter=0;
        for (char  c : s1.toCharArray()) {
        if(c==' ')counter++;

        }
        System.out.println(counter);

        /// 2.way
        System.out.println(s1.split(" ").length);

        String s2="Some countries i visited were Argentina,Belgium and Malta";
        int count=0;
        String[] str= s2.split(" ");//First split by words loop through each element check if they are start with a
        for (String s : str) {
            if(s.toLowerCase().startsWith("a")){
                count++;
            }
        }
        System.out.println(count);
        }

    }

