package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeArrayList {
    public static void main(String[] args) {

         /*
        WRITE UNIQUE ELEMENTS IN ARRAY
        REMOVE DUPLICATES IN ARRAY
         */

     int[] numbers = {1,1,2,2,3,3,4,4,5,5};
     // Create empty list
      List<Integer> list = new ArrayList<>();
     // Create a loop and check if our list does not contain the number add to the list

        for (int i = 0; i < numbers.length; i++) {
             if(!list.contains(numbers[i])){
                 list.add(numbers[i]);
             }
        }
        // now all the unique elements are in the list but we need to return as a array.
        // Create empty array our list size and add the all the unique numbers in the array using a loop

        int[] uniqueNumbers = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueNumbers[i]=list.get(i);
        }
        System.out.println(Arrays.toString(uniqueNumbers));
    }
}
