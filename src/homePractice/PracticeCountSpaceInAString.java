package homePractice;

import methods.FindSpaceInStringMethod;

public class PracticeCountSpaceInAString {
    public static void main(String[] args) {
        String name = "MELDA SAV KEREM";
        int counter = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i)==' ') {
                counter++;
            }
        }
        System.out.println(counter);
    }
}