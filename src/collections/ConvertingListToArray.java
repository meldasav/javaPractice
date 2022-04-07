package collections;

import java.util.*;

public class ConvertingListToArray {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rami");
        names.add("Naim");
        names.add("Reem");
        LinkedList<Integer> ages = new LinkedList<>();
        ages.add(25);
        ages.add(26);
        ages.add(27);
        ages.add(30);

        Vector<Boolean> booleans =new Vector<>();
        booleans.add((true));
        booleans.add((false));
        booleans.add((false));
        booleans.add((false));
        //Converting lists to Array
        String [] namesArr = new String[names.size()];
        for (int i = 0; i < names.size(); i++) {
            namesArr[i]= names.get(i);
        }
        System.out.println(Arrays.toString(namesArr));

        //2.nd way
        Object[] namesArr2= names.toArray();//if you use Array method it should be Object
        Object [] agesArr= ages.toArray();
        Object[] booleans1=booleans.toArray();
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

        System.out.println("\n--------Way-1 of converting Array to List-------\n");
        //WAY - 1 to convert Array to List (ArrayList or LinkedList)
        List<String> countries1 = new ArrayList<>(Arrays.asList(countries));
        List<String> countries2 = new LinkedList<>(Arrays.asList(countries));
        System.out.println(countries1);
        System.out.println(countries2);


        System.out.println("\n--------Way-2 of converting Array to List-------\n");
        //WAY-2 to convert Array to List (ArrayList or LinkedList)
        List<String> countries3 = new ArrayList<>();
        List<String> countries4 = new LinkedList<>();

        Collections.addAll(countries3, countries); // this method is adding all array elements to the List collection
        Collections.addAll(countries4, countries); // this method is adding all array elements to the List collection

        System.out.println(countries3);
        System.out.println(countries4);



        //3rd way - manual way
        System.out.println("\n--------Way-3 of converting Array to List-------\n");
        int[] numbers = {1, 2, 3, 4, 5};

        List<Integer> numbersList = new LinkedList<>(); // or ArrayList

        for(int i : numbers){
            numbersList.add(i);
        }

        System.out.println(numbersList);


    }
}
