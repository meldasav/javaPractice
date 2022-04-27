package homePractice;

import java.util.ArrayList;
import java.util.Arrays;

public class Wednesday_Practice {
    public static int sum(int[] number){
        int sum=0;
        for (int i : number) {
            sum+=i;
        }
        return sum/number.length;
    }

   public static int countMultipleWords(String[] str){
        int count =0;
       for (String s : str) {
           if(s.trim().contains(" "))count++;
       }
       return count;
}


public static int countMulti(String[] str){
        int count=0;
    for (String s : str) {
         if(s.trim().contains(" "))count++;
    }
    return count;
}
  public static ArrayList<Integer> removeDup(ArrayList<Integer> numbers){
       numbers.removeIf(x->x<0);
       return numbers;
  }








    public static void main(String[] args) {
        System.out.println(countMulti(new String[]{"foo", "",  " ", "foo bar", "java is fun", " ruby "}));
        System.out.println(removeDup(new ArrayList<Integer>(Arrays.asList(2,-5,6,7,-10,-78,0,15))));
        }

        }





