package collections;

import java.util.*;

public class ConvertingListToEachOther {
    public static void main(String[] args) {
        //arraylist to LinkedList ,LinkedList to arraylist,

//        ArrayList<Integer> numbers=new ArrayList<>();
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(9);
//        System.out.println(numbers);
//       //converting Arraylist to LinkList
//        LinkedList<Integer> numbers2=new LinkedList<>(numbers);
//        System.out.println(numbers2);
//
//        //converting LinkedList to ArrayList
//        ArrayList<Integer> numbers3=new ArrayList<>(numbers2);
//        System.out.println(numbers3);
//
//
//        String [] namesArr={"Kaly","Torrie","Taylor"};
//        Vector<Integer> names3=new Vector<>();

  //      System.out.println(names3);
         /*
        ArrayList - LinkedList
        LinkedList - ArrayList
        Vector - ArrayList
        ArrayList - Vector
        .
        .
         */

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);

        System.out.println("The ArrayList is = " + numbers);

        //Converting ArrayList to a LinkedList
        LinkedList<Integer> numbers2 = new LinkedList<>(numbers);
        System.out.println("The LinkedList is = " + numbers2);


        //Converting LinkedList to an ArrayList
        ArrayList<Integer> numbers3 = new ArrayList<>(numbers2);


        String[] namesArr = {"Kaly", "Torrie", "Taylor"};

        List<String> names = new Vector<>();
        Collections.addAll(names, namesArr);

        System.out.println(names);


    }
}
