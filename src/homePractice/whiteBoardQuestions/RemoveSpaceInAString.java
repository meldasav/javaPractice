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
        return sentence.toString();
}
    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("java     is    fun     "));
    }
}
