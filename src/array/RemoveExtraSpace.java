package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveExtraSpace {
    public static void main(String[] args) {
        System.out.println(countVowels("   java      is     fun   "));
        //   System.out.println(Arrays.toString(removeDuplicateStrings1(new String[]{"foo", "bar", "foo", "123", "bar"})));
        System.out.println(Arrays.toString(remove(new int[]{1, 1, 2, 3, 4, 4,})));
    }

    public static String removeExtraSpace(String str) {
        StringBuilder sb = new StringBuilder();
        for (String s : str.split(" ")) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.toString();
    }

    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'i' ||
                    c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'I') count++;
        }
        return count;
    }

    public static String[] removeDuplicateStrings(String[] str) {
        HashSet<String> str1 = new HashSet<>(Arrays.asList(str));
        return str1.toArray(new String[0]);
    }

    public static int[] remove(int[] numbers) {
        ArrayList<Integer> uniques = new ArrayList<>();
        for (Integer i : numbers) {
            if (!uniques.contains(i)) uniques.add(i);
        }
        int[] arr = new int[uniques.size()];
        for (int i = 0; i < uniques.size(); i++) {
            arr[i] = uniques.get(i);
        }
        return arr;
    }


}


