package collectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapPractice {
    public static void main(String[] args) {
        //Map stores data with key-value pairs
        //keys are always unique but values could be duplicates
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Ukraine", "Kiev");
        capitals.put("Spain", "Madrid");
        capitals.put("Portugal", "Lisbon");
        capitals.put("Italy", "Rome");
        capitals.put("Us", "DC");
        capitals.put("Canada", "Ottawa");

        System.out.println(capitals);
        /**{Canada=Ottawa, Ukraine=Kiev, Italy=Rome, Portugal=Lisbon, Us=DC, Spain=Madrid}
         *
         */
        LinkedHashMap<String, String> capitals1 = new LinkedHashMap<>();
        capitals1.put("Ukraine", "Kiev");
        capitals1.put("Spain", "Madrid");
        capitals1.put("Portugal", "Lisbon");
        capitals1.put("Italy", "Rome");
        capitals1.put("Us", "DC");
        capitals1.put("Canada", "Ottawa");

        System.out.println(capitals1);
        /**
         * {Ukraine=Kiev, Spain=Madrid, Portugal=Lisbon, Italy=Rome, Us=DC, Canada=Ottawa}
         */

        TreeMap<String, String> capitals2 = new TreeMap<>();
        capitals2.put("Ukraine", "Kiev");
        capitals2.put("Spain", "Madrid");
        capitals2.put("Portugal", "Lisbon");
        capitals2.put("Italy", "Rome");
        capitals2.put("Us", "DC");
        capitals2.put("Canada", "Ottawa");

        System.out.println(capitals2);
        /**
         * {Canada=Ottawa, Italy=Rome, Portugal=Lisbon, Spain=Madrid, Ukraine=Kiev, Us=DC}
         */
        //all the map provides you get method
        //how to get a particular key-value pair
        System.out.println(capitals.get("Spain"));//Madrid
        System.out.println(capitals.get("Germany"));//null
        System.out.println(capitals.get("us"));//null

        System.out.println("........Understanding HashMap.........");
        HashMap<Integer,String> students=new HashMap<>();
        students.put(1,"Alona");
        students.put(2,"Abdullah");
        students.put(3,"Abdullah");
        students.put(4,"Data");
        students.put(null,"John");//it accepts null
        students.put(null,"Alex");//this will replace john with Alex
        students.put(1,"Daria");//it replaces Alona with Daria
        students.put(5,null);
        students.put(6,null);
        students.put(7,null);
        students.put(null,null);//Line 61 Alex out null in /size same


        System.out.println(students.size());//8
        System.out.println(students);
        /**
         * Hashmap allows only 1 null because keys must be unique
         * Hashmap allows as many null value you need
         */


    }
}
