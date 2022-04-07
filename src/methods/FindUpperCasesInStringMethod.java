package methods;

public class FindUpperCasesInStringMethod {
    public static void main(String[] args) {
        // System.out.println(countUpperCase("MeldA"));
    }

    public static int countUpperCase(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                counter++;
            }
        }
        return counter;
    }

}
