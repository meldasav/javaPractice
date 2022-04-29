package homePractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println(validPassword("Abcd123!"));
        System.out.println(remove(new ArrayList(Arrays.asList("melda", "melda", "kerem", "tarik"))));
        System.out.println(longestWord(new String[]{"yellow","blue","red"}));
    }

    public static boolean validPassword(String str) {
        if (str.contains(" ") || str.length() < 8 || str.length() > 16) return false;
        boolean upperCase = false;
        boolean lowerCase = false;
        boolean digit = false;
        boolean specials = false;

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) upperCase = true;
            else if (Character.isLowerCase(c)) lowerCase = true;
            else if (Character.isDigit(c)) digit = true;
            else specials = true;
        }
        return upperCase && lowerCase && digit && specials;
    }

    public static ArrayList<String> remove(ArrayList<String> names) {
        LinkedList<String> nameList = new LinkedList<>(names);
        nameList.removeIf(name -> name.startsWith("m"));
        return new ArrayList<>(nameList);
    }

    public static String longestWord(String[] str) {
        String longest = "";
        for (String s : str) {
            if (s.length() > longest.length()) longest = s;
        }
        return longest;
    }
}
