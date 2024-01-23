package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChangingArraySize {
    public static void main(String[] args) {
        // add number 5 to the array
        int[] array = {1,2,3,4};
        // create new array in our array size
        int[] newArray = new int[array.length+1];
       // add numbers to our new array with for loop
        for (int i = 0; i < array.length; i++) {
             newArray[i] = array[i];
        }
        // add 5 to our new array
        newArray[newArray.length-1] = 5;
        // re = assign new array to our old array
        array = newArray;
        System.out.println(Arrays.toString(array));

        // convert array to array list
        List<Integer> arraylist = new ArrayList<>();
        for(Integer newList : array){
             arraylist.add(newList);
        }
        System.out.println(arraylist);
        // after converting our array to arraylist changing the size of the arraylist is easy we use add method
        arraylist.add(6);
        System.out.println(arraylist);
    }


}
