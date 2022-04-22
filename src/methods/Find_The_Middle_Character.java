package methods;

public class Find_The_Middle_Character {
    public static String getTheMiddleChar(String str) {
        if (str.length() % 2 == 0) return " " + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);
        return " " + str.charAt(str.length() / 2);
    }
}