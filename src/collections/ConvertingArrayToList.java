package collections;

import java.util.*;

public class ConvertingArrayToList {
    public static void main(String[] args) {

//        List<String> countries=new LinkedList<>();
//        countries.add("USA");
//        countries.add("Brasilia");
//        countries.add("France");
//        countries.add("Belgium");
//        countries.add("Germany");
//        countries.add("Portugal");
//        System.out.println(countries);
//
//        Collections.addAll(countries);
//        System.out.println(countries);
        /*
        Create a List and store below data - countries

        USA
        Brasilia
        Argentina
        France
        Belgium
        Germany
        Portugal

        Print your list

        RESULT:
        [USA, Brasilia, Argentina, France, Belgium, Germany, Portugal]
         */

        String[] countries = {"USA", "Brasilia", "Argentina", "France", "Belgium", "Germany", "Portugal"};

        //WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);

        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        System.out.println(countries3);
        System.out.println(countries4);

    }
}
