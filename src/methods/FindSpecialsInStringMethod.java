package methods;

public class FindSpecialsInStringMethod {
    public static void main(String[] args) {
        System.out.println(countSpecials("melda@45L"));
    }
    public static int countSpecials(String str) {

        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(str.charAt(i)) && !Character.isDigit(str.charAt(i)) && !Character.isWhitespace(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }
}
