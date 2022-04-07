package homePractice;

public class ArrayIsLetter {
    public static void main(String[] args) {
        char[] c = {'#', '$', '5', 'A', 'b', 'H', 'z'};
        for (int i = 0; i < c.length; i++) {
            if (Character.isLetter(c[i])) {
                System.out.println(c[i]);
            }
        }
        for (char character : c) {
            if (Character.isLetter(character)) {
                System.out.println(character);
            }
        }
        for (char character : c) {
            if (character >= 'A' && character <= 'Z' || character >= 'a' && character <= 'z') {
                System.out.println(character);
            }
        }
    }
}
