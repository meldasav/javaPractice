package homePractice.whiteBoardQuestions;

public class RemoveSpaceInAString {


    public static String removeSpace(String str) {
        String[] str1 = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : str1) {
            if (!s.isEmpty()) sb.append(s).append(" ");
        }
        return sb.substring(0, sb.length() - 1);
    }

    //second way
    public static String removeExtraSpaces(String s) {
        //String str = “I   am      learning     Java      ”;
        StringBuilder sentence = new StringBuilder(); // I am
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) sentence.append(s.charAt(i));
            else if (s.charAt(i) == ' ' && sentence.charAt(sentence.length() - 1) != ' ') sentence.append(" ");
        }
        return sentence.toString().trim();
    }

    public static String reverseEachWord(String str) {
        StringBuilder result = new StringBuilder();
        for (String word : str.split(" ")) {
            for (int i = word.length() - 1; i >= 0; i--) {
                result.append(word.charAt(i));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }


    //Testing method
    public static void main(String[] args) {
        System.out.println(reverseEachWord("Java is fun")); // avaJ si nuf
    }
}

