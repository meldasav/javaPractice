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
 */

        //1.way
        String s1="Today is Tuesday";
       String []str1= s1.split(" ");
       int counter=0;
        for (char  c : s1.toCharArray()) {
        if(c==' ')counter++;

        }
        /// 2.way
        System.out.println(counter);
        System.out.println(s1.split(" ").length);

        String s2="Some countries i visited were Argentina,Belgium and Malta";
        int count=0;
        String[] str= s2.split(" ");
        for (String s : str) {
            if(s.toLowerCase().startsWith("a")){
                count++;
            }
        }
        System.out.println(count);
        }

    }

