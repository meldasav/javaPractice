package methods;

public class FindDigitInStringMethod {
    public static void main(String[] args) {
        System.out.println(countDigits("23kl"));

    }
    public static int countDigits(String str){
        int counter=0;
        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                counter++;
            }
        }
        return counter++;
    }
}
