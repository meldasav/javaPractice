package collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LoopingThroughArrayListElements {
    public static void main(String[] args) {

        List<Character> chars=new ArrayList<>();
        chars.add('D');
        chars.add('A');
        chars.add('B');
        chars.add('C');
        System.out.println("My list before sort " + chars);
        Collections.sort(chars);
        System.out.println("My list after sort " + chars);

        for (int i = 0; i < chars.size(); i++) {
            System.out.println(chars.get(i));
            //2.way

        for(Character element : chars) {
            System.out.println(element);
        }
        }

    }
}
