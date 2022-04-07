package methods;

public class FindSpaceInStringMethod {
    public static int countSpace(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isWhitespace(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}