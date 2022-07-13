package methods;

public class ReversedStringMethod {
    public static void main(String[] args) {

        System.out.println(reverseString2("  MELDA   "));
        System.out.println(reverseEachWord("   I went to picnic today"));
    }

    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static String reverseString1(String str) {
        return new StringBuilder(str).reverse().toString().trim();
    }

    public static String reverseString2(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString().trim();
    }

    public static String reverseEachWord(String str) {
        StringBuilder sb = new StringBuilder();
        for (String split : str.split(" ")) {
            for (int i = split.length() - 1; i >= 0; i--) {
                sb.append(split.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString().trim();

    }
}
