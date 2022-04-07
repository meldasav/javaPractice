package collections.arraylist;

import java.util.*;

public class SortingArrayList {
    public static void main(String[] args) {
        //how to sort Array
        int[] numbersArray={3,7,0,4};
        System.out.println("My array before sort " + Arrays.toString(numbersArray));
        Arrays.sort(numbersArray);
        System.out.println("My array after sort  " + Arrays.toString(numbersArray));

        // how to sort Arraylist

        AbstractList<Integer> numberList=new ArrayList<>();
        numberList.add(3);
        numberList.add(7);
        numberList.add(3);
        numberList.add(4);
        System.out.println("My array before sort " + numberList);
        Collections.sort(numberList);
        System.out.println("My array after sort " + numberList );

    }
}
