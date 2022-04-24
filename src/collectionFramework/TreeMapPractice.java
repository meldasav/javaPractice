package collectionFramework;

import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapPractice {

    public static void main(String[] args) {
        TreeMap<String,Integer> studentAges=new TreeMap<>();
        studentAges.put("Kaly",17);
        studentAges.put("Torrie",20);
        studentAges.put("Alona",15);
        studentAges.put("andrei",25);
     //   studentAges.put(null,15);//nullPointerException
      //  studentAges.put("GuLiZar",null);
      //  studentAges.put("Melda",null);
      //  studentAges.put("ismail",null);

        System.out.println(studentAges);//{Alona=15, Kaly=17, Torrie=20, andrei=25}

    }
}
