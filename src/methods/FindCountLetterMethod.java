package methods;

public class FindCountLetterMethod {
    public static void main(String[] args) {
        System.out.println(countLetters("melda"));
    }
    public static int countLetters(String str){
        int counter=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
            counter++;
        }
       return counter;
    }

}
