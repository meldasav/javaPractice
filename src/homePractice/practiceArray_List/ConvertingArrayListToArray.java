package homePractice.practiceArray_List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ConvertingArrayListToArray {
    public static void main(String[] args) {
        //Object[] array = arrayList.toArray();
        List<String> names=new LinkedList<>();
        names.add("Melda");
        names.add("Kerem");
        names.add("Tarik");
        names.add("Osman");
        System.out.println(names);
    }
}
