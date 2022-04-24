package collections.arraylist.IteratorPractice;

import java.util.*;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");
        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while (iterator.hasNext()) { // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if (element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }

        System.out.println(languages);

        /**
         * remove all negative numbers in array
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(-3);
        numbers.add(5);
        numbers.add(-9);
        numbers.add(2);
        Iterator<Integer> iterator1 = numbers.iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next() < 0) iterator1.remove();
        }
        System.out.println((numbers));
    }
}
