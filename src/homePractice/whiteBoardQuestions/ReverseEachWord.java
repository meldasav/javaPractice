package homePractice.whiteBoardQuestions;

public class ReverseEachWord {

    //create string builder
    //create for each loop split from space
    //fori loop for reverse
    //add the sb each character
    //add space to sb
    //return sb and trim
public static String reverseEachWord(String str){
    StringBuilder sb =new StringBuilder();
    for (String s : str.split(" ") ) {
        for (int i = s.length()-1; i >=0 ; i--) {
            sb.append(s.charAt(i));
        }
        sb.append(" ");
    }
    return sb.toString().trim();
}

    public static void main(String[] args) {
        System.out.println(reverseEachWord(" java is fun"));
    }


}
