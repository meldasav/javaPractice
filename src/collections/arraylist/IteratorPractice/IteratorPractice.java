package collections.arraylist.IteratorPractice;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorPractice {
    public static void main(String[] args) {
        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("Python");
        languages.add("C++");
        Iterator<String> iterator = languages.iterator(); // I put all elements in a queue

        while(iterator.hasNext()){ // We are asking if there is an element in the queue
            String element = iterator.next(); // this gets an element from the queue
            if(element.startsWith("J")) { // if element came from the queue starts with J
                iterator.remove(); // Remove
            }
        }

        System.out.println(languages);

    }
}
