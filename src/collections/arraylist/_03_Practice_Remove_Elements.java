package collections.arraylist;

import java.util.*;

public class _03_Practice_Remove_Elements {
    public static void main(String[] args) {

        List<String> languages = new LinkedList<>();

        languages.add("Java");
        languages.add("JavaScript");
        languages.add("C#");
        languages.add("python");
        languages.add("C++");

        //[Java, JavaScript, C#, Python, C++]

        /*
        Remove Python from the list and print it

        [Java, JavaScript, C#, C++]
         */
        languages.remove("python");
        System.out.println(languages);

        List<String> element = new LinkedList<>();
        languages.removeIf(x -> x.startsWith("J"));
        System.out.println(languages);

        languages.removeIf(x -> x.toLowerCase().startsWith("p"));
        System.out.println(languages);
        languages.removeIf(x -> x.charAt(0) == 'C');
        System.out.println(languages);


        // 2.way use iterator
        Iterator<String> iterator = languages.iterator();//we put all elements in a queue
        while (iterator.hasNext()) { //we are asking if there is element in the queue
            String element1 = iterator.next();//this gets an element from queue
            if (element1.charAt(0) == 'a') {//if element comes from queue start with 'a'
                iterator.remove();
            }
        }

        System.out.println(languages);
        while (iterator.hasNext()) {

        }
    }
        static int getMaxLength ( boolean arr[], int n){


            int count = 0; //initialize count
            int result = 0; //initialize max

            for (int i = 0; i < n; i++) {

                // Reset count when 0 is found
                if (!arr[i])
                    count = 0;

                    // If 1 is found, increment count
                    // and update result if count becomes
                    // more.
                else {
                    count++;//increase count
                    result = Math.max(result, count);
                }
            }

            return result;
        }


    }




