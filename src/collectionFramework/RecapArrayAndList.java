package collectionFramework;

import sun.plugin.javascript.navig.Link;

import java.util.*;

public class RecapArrayAndList {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 9, 10, 10};//null is not allowed with primitives only with object
        System.out.println(Arrays.toString(numbers));

        System.out.println("\n-------String array-------\n");
        String[] cities = {"Tokyo", "Berlin", "Oslo", "Denver", null, null};
        System.out.println(Arrays.toString(cities));

        ArrayList<String> names1 = new ArrayList<>();//MOST POPULAR SYNTAX DO NOT USE OTHERS
        List<String> names2 = new ArrayList<>();//MOST POPULAR SYNTAX DO NOT USE OTHERS

        Collection<String> names3 = new ArrayList<>();
        Iterable<String> names4 = new ArrayList<>();
        Object names5 = new ArrayList<>();
        Cloneable names6 = new ArrayList<>();

        //convert to array
        ArrayList<String> cities2 = new ArrayList<>(Arrays.asList(cities));
        //2.way
        System.out.println("\n-------String ArrayList-------\n");
        Collections.addAll(cities2, cities);
        cities2.add("Tokyo");
        System.out.println(cities2);

        System.out.println(cities2.get(3));//Denver

        Vector<String> names = new Vector<>();
        names.add(null);
        names.add(null);
        names.add(null);
        names.add("Regina");
        names.add("Regina");
        names.add("Data");

        System.out.println(names.size());
        names.forEach(System.out::println);
        System.out.println("Name at index of 5 = " + names.get(5));

        System.out.println("\n-------String LinkedList-------\n");
        LinkedList<String> objects1 = new LinkedList<>();
        objects1.add("Phone");
        objects1.add("Computer");
        objects1.add("Airpods");
        objects1.add("Screen");
        objects1.add("Screen");
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);
        objects1.add(null);

        System.out.println(objects1.getLast());
        System.out.println(objects1);
        int countNull=0;
        for (String s : objects1) {
            if(s==null)countNull++;
        }
        System.out.println(countNull);

        System.out.println(objects1.stream().filter(Objects::isNull).count());//4



    }


}
