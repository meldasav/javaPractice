package collections;

import java.util.LinkedList;
import java.util.List;

public class Exercise_01 {
    public static void main(String[] args) {
        //create string store below data
        List<String> city=new LinkedList<>();
        city.add("Berlin");
        city.add("Chicago");
        city.add("Miami");
        city.add("Brugge");
        city.add("Kiev");

        //remove miami and dallas
        city.removeIf(x-> x.contains("Miami"));
        System.out.println(city);


    }
}
