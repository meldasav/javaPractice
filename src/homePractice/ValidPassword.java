package homePractice;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println(validPassword("Abcd123!"));
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
}
