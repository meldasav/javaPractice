package collectionFramework;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise02_findSecondMin {
    public static void main(String[] args) {
        AbstractList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(5);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(3);
        numbers.add(1);

        TreeSet<Integer> uniques=new TreeSet<>(numbers);
        System.out.println(uniques);
        ArrayList<Integer> uniquesList=new ArrayList<>(uniques);
        System.out.println(uniquesList.get(uniquesList.size()-2));
        System.out.println(uniquesList.get(1));
    }
}
