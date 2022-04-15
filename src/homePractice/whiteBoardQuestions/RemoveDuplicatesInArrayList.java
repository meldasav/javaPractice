package homePractice.whiteBoardQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesInArrayList {

    public static ArrayList<String> removeDuplicates(ArrayList<String> words) {
        ArrayList<String> myList = new ArrayList<>();
        for (String w : words) {
            if (myList.contains(w)) {
                continue;
            }
            myList.add(w);
        }
        return myList;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(Arrays.asList("apple", "banana", "apple", "watermelon", "banana"))));
    }
}
