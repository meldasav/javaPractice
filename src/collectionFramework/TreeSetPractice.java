package collectionFramework;

import javax.swing.event.TreeSelectionEvent;
import java.util.TreeSet;

public class TreeSetPractice {
    public static void main(String[] args) {
        TreeSet<Integer> numbers=new TreeSet<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
      //   numbers.add(null);//you can not have null/ nullPointerException
        System.out.println(numbers);// numbers sorted

        TreeSet<String> names=new TreeSet<>();
        names.add("John");
        names.add("John");// no duplicates
        names.add("Joe");
        names.add("Alex");
        names.add("ali");
        System.out.println(names);


    }
}
