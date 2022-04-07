package homePractice.practiceArray_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        String[] names = {"Rahul", "Utkarsh",
                "Shubham", "Neelam"};
        List<String> a1= Arrays.asList(names);
        System.out.println(a1);
        //now our Array becomes ArrayList we can add more elements
        //create new arrayList
        List<String> all=new ArrayList<>(a1);
        all.add("Melda");
        all.add("Kerem");
        System.out.println(all);
        /*
        Collections.addAll() method.
•This method takes 2 parameters (arrayList
and array) and converts given array into
the ArrayList
         */
        Collections.addAll(all);
        System.out.println(all);

        int [] numa={1,2,3};
        List<Integer>numList=new ArrayList<>();
        for (int integer : numList) {
            numList.add(integer);
        }
        System.out.println(numList);



        }

        }


