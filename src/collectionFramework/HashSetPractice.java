package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetPractice {
    public static void main(String[] args) {
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
}
