package homePractice.practiceArray_List;

import java.util.ArrayList;

public class _PracticeArrList {             //PRIMITIVES TO OBJECT AUTOBOXING
    public static <Item> void main(String[] args) {//UNBOXING STORE OBJECT TO PRIMITIVES
        ArrayList<String> names=new ArrayList<String>();
        names.add("Melda");
        names.add("kerem");
        names.add("hatice");
        names.add("osman");
        names.add(1,"tarik");
        System.out.println(names);

        System.out.println(names.get(0));


        ArrayList<Integer>ages=new ArrayList<>();
        int age=45;
        Integer i=age;
        ages.add(23);
        ages.add(120);
        String s="34";
        Integer.valueOf(s);
        Integer.parseInt(s);

        String name;
        String address;
        int numOfItems;

















    }
}
