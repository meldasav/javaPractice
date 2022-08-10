package HomeworkRecap.methods;

public class Method_Replace_First_Last {
    public static void main(String[] args) {
        System.out.println(replaceFirstLast("   Melda SAV   "));
    }

    /**
     * Create a method called replaceFirstLast()
     * -This method will take one String argument and it will return a new
     * String with first and last characters replaced
     * NOTE: if the length is less than 2, then return empty String
     * NOTE: Ignore all before and after spaces (get actual String only)
     */
    public static String replaceFirstLast(String sentence) {
        sentence = sentence.trim();
        if (sentence.length() < 2) {
            return "";
        } else {
            return sentence.charAt(sentence.length() - 1) + sentence.substring(1, sentence.length() - 1) + sentence.charAt(0);
        }
    }
}
