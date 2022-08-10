package HomeworkRecap.methods;

public class Method_No_Space {
    public static void main(String[] args) {
        System.out.println(noSpace("     Hello      world    "));
        System.out.println(noSpace(""));
    }


    /**
     * Requirement:
     * -Create a method called noSpace()
     * -This method will take one String argument and it will
     * return a new String with all spaces removed from the
     * original String
     */

    public static String noSpace(String sentence) {
        StringBuilder sb = new StringBuilder();
        if (!sentence.isEmpty()) {
            for (int i = 0; i < sentence.length(); i++) {
                if (!Character.isSpaceChar(sentence.charAt(i))) {
                    sb.append(sentence.charAt(i));
                }
            }
            return sb.toString().trim();
        } else {
            return "It is empty";
        }

    }

}
