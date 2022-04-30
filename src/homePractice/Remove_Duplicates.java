package homePractice;

import java.util.*;

public class Remove_Duplicates {
    public static void main(String[] args) {

    }

    public static int[] removeDuplicateNumbers(int[] numbers) {
        HashSet<Integer> uniques = new HashSet<>();
        for (int i : numbers) uniques.add(i);
          int[] arr = new int[uniques.size()];

        int index = 0;
        for (int i : uniques)arr[index++] = i;

        return arr;


    }
}
