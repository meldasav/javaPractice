package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Exercise01_removeDuplicates {
    public static void main(String[] args) {

        ArrayList<String> objects = new ArrayList<>();
        objects.add("Computer");
        objects.add("Phone");
        objects.add("Mouse");
        objects.add("Mouse");
        objects.add("Phone");
        objects.add("Pen");
/**
 * First WAY
 */
        ArrayList<String> uniques = new ArrayList<>();
        for (String object : objects) {
            if (!uniques.contains(object)) uniques.add(object);
        }
        System.out.println(uniques);

        //TreeSET it will sort
        //HasSet no orders

        LinkedHashSet<String> myUniques = new LinkedHashSet<>(objects);
        System.out.println(myUniques);
        System.out.println(new LinkedHashSet<>(objects));//you can do only 1 line
        System.out.println(new HashSet<>(objects));//not in order anywhere


        //  {"foo", "bar", "foo", "123", "bar"})

        /**
         Write a method that takes a String array argument and returns the array back with all duplicates removed
         NOTE: the order of elements returned is not an issue.
         TEST DATA:
         ["foo", "bar", "foo", "123", "bar"]
         EXPECTED OUTPUT:
         [bar, 123, foo]
         */
    }
         public static ArrayList<String> remove(ArrayList<String> str){
        ArrayList<String> neWList=new ArrayList<>();
             for (String s : str) {
                 if(neWList.contains(s)){
                     continue;
                 }
                 neWList.add(s);
             }
             return neWList;
        }




}
