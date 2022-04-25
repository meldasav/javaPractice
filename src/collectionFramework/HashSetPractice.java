package collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPractice {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(remove(new int[]{0, 5, 4, 0, 0})));
        HashSet<Integer> numbers = new HashSet<>();///there is no order you never know your elements go
        // it will take less memory//use it with uniqe element like sos number
        numbers.add(5);
        numbers.add(10);
        numbers.add(10);//does not allow duplicates
        numbers.add(10);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(-7);
        numbers.add(-55);
        numbers.add(null);
        numbers.add(null);//it allows only 1 null
        numbers.add(null);
        System.out.println(numbers);//[0, -3, 5, -7, 55, 10] that is output comes with different order
        System.out.println(numbers.contains(10));//return true or false
    }
 /**
    Write a method that takes an int array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    [0, 5, 4, 0, 0]
    EXPECTED OUTPUT:
    [0, 4, 5]
  * @return
  */
 public static Integer[] remove(int[] array){
     LinkedHashSet<Integer> set =new LinkedHashSet<>();
     for (int i = 0; i < array.length; i++) {
         set.add(array[i]);
     }
     return set.toArray(new Integer[0]);
 }


}
