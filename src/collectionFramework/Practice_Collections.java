package collectionFramework;

import java.util.*;

public class Practice_Collections {
    public static void main(String[] args) {
        LinkedList<String> myCollection = new LinkedList<>();
        myCollection.add("Phone");
        myCollection.add("Computer");
        myCollection.add("Airpods");
        myCollection.add("Screen");
        myCollection.add("Screen");
        myCollection.add(null);
        myCollection.add(null);
        myCollection.add(null);
        myCollection.add(null);
        System.out.println(myCollection.getLast());
        System.out.println(myCollection.stream().filter(Objects::isNull).count());
        System.out.println(myCollection.stream().filter(x -> Objects.equals(x, "Screen")).count());
        System.out.println(myCollection.stream().filter(x -> Objects.equals(x, "Computer")).count());
        System.out.println(myCollection.stream().filter(x -> Objects.equals(x, "Airpods")).count());

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(-10);
        numbers.add(8);
        numbers.add(4);
        numbers.add(9);

        System.out.println(numbers);
        System.out.println(numbers.stream().filter(x -> x == 4).count());
        LinkedHashSet<String> words = new LinkedHashSet<>();
        words.add("Foo");
        words.add("Bar");
        words.add("Fizz");
        words.add("FizzBaZz");
        System.out.println(words);
        System.out.println(words.stream().filter(x -> x.equals("Foo")).count());
        System.out.println(words.stream().filter(x -> x.equals("Fizz")).count());

        TreeSet<Integer> myList = new TreeSet<>(numbers);
        System.out.println(myList.first());
        System.out.println(myList);
        System.out.println(myList.stream().filter(x -> x == 5).count());

        TreeSet<String> names = new TreeSet<>(Arrays.asList("Melda", "Tarik", "Kerem", "Osman", "Volkan", "Hatice", "Meryem"));
        System.out.println(names);
        System.out.println(names.stream().filter(x -> x.toString().startsWith("M")).count());
        System.out.println(names.stream().filter(x -> x.toString().toLowerCase().contains("m")).count());
        System.out.println(names.stream().filter(x -> x.toString().length() > 5).count());
        System.out.println(names.stream().filter(x -> x.toString().toLowerCase().equals("melda")).count());

        /**
         * create Arraylist remove duplicates
         */

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("pen");
        objects.add("pen");
        objects.add("Phone");
        //1.way keep the insertion order and remove dup
        LinkedHashSet<String> myList1 = new LinkedHashSet<>(objects);
        System.out.println(myList1);
        System.out.println(myList1.stream().filter(x -> x.contains("pen")).count());
        //2.way sort the array and remove duplicates
        TreeSet<String> noDuplicates = new TreeSet<>(objects);
        System.out.println(noDuplicates);
        System.out.println(noDuplicates.stream().filter(x -> x.toLowerCase().length() > 3).count());

        //find second-greatest number
        TreeSet<Integer> myNumbers = new TreeSet<>(numbers);
        ArrayList<Integer> neWNumber = new ArrayList<>(myNumbers);
        System.out.println(neWNumber);
        System.out.println(neWNumber.get(neWNumber.size() - 2));
        //find second min
        System.out.println(neWNumber.get(1));

        HashMap<String, String> countries = new HashMap<>();
        countries.put("Turkey", "Ankara");
        countries.put("America", "Washington DC");
        countries.put("Spain", "Madrid");
        countries.put("Italy", "Roma");
        System.out.println(countries);//{Turkey=Ankara, America=Washington DC, Italy=Roma, Spain=Madrid}
        //No insertion order it is random

        LinkedHashMap<String, String> country = new LinkedHashMap<>(countries);
        System.out.println(country);//keeps insertion order

        //TreeMap sorts the Key value
        TreeMap<String, String> countries1 = new TreeMap<>(country);
        System.out.println(countries1);//{America=Washington DC, Italy=Roma, Spain=Madrid, Turkey=Ankara}
        System.out.println(countries1.get("Spain"));//always use "KEY" with get method it will print Madrid

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Melda");
        students.put(2, "Vita");
        students.put(3, "Data");
        students.put(4, "Regina");
        students.put(null, "natallia");
        students.put(null, "Abe");//it allows only 1 null value over here replacing natalia with abe

        System.out.println(students);
        System.out.println(students.size());

        TreeMap<String, Integer> studentsAges = new TreeMap<>();//Sort the key values
        studentsAges.put("Melda", 39);
        studentsAges.put("Vita", 28);
        studentsAges.put("Natalia", 31);
        studentsAges.put("Kerem", 19);
        //  studentsAges.put(null,null);NullPointerException NO null key you got exception
        studentsAges.put("Data", null);
        studentsAges.put("Regina", null);//no null key but many null value
        System.out.println(studentsAges);

        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("color", "purple");
        favorites.put("city", "Florida");
        favorites.put("food", "taco");
        System.out.println(favorites);

        //keySet() returns set that's why we can store them in a set
        Set<String> keys = favorites.keySet();//we can put them in a set because set are carries unique keys
        System.out.println(keys);
        //values() returns Collections that's why we can store them in a Collection
        Collection<String> value = favorites.values();
        System.out.println(value);

        System.out.println(value.stream().filter(x -> x.length() > 5).count());
        System.out.println(keys.stream().filter(x -> x.startsWith("c")).count());

        Set<Map.Entry<String, String>> entries = favorites.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
        }
        for (Map.Entry<String, String> entry : entries) {
            System.out.println("My favorite " + entry.getKey() + " is = " + entry.getValue());
        }
        favorites.remove("Day");
        favorites.remove("color");
        favorites.replace("food", "pizza");
        System.out.println(favorites);

        System.out.println(favorites.containsKey("color"));
        System.out.println(favorites.containsKey("sport"));
        System.out.println(favorites.containsValue("pizza"));

        String word = "Chicago is a nice city";//{C=1, h=1, i=4, c=3, a=2, g=1, o=1,  =4, s=1, n=1, e=1, t=1, y=1}
        LinkedHashMap<Character, Integer> values = new LinkedHashMap<>();
        for (Character c : word.toCharArray()) {
            if (!values.containsKey(c)) values.put(c, 1);
            else {
                int count = values.get(c);
                values.put(c, count += 1);
            }
        }
        for (Map.Entry<Character, Integer> c : values.entrySet()) {
            System.out.println(c);
        }


    }

}