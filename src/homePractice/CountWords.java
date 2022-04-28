package homePractice;

public class CountWords {
    public static void main(String[] args) {
        System.out.println(countWords1("Mock is sunday"));

    }

    /**
     * Write a method countWords() that takes a String as an argument,
     * and returns how many words there are in the  given String
     */

    public static int countWords(String str) {
        String[] split = str.trim().split(" ");
        return str.length();
    }

    public static int countWords1(String str) {
        int countWords = 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') countWords++;
        }
        return countWords;
    }

    public static int countWords2(String str) {
        String trimmed = str.trim();
        int spaces = 0;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) == ' ') spaces++;
        }
        return spaces + 1;

    }


}