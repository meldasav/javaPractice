package homePractice;

public class ArrayStringHowManyDigitMethod {
    public static void main(String[] args) {
        int[] numbers={1,5,89,0,9};
        int counter=0;
        for(int number:numbers){
           char c=(char)number;
            if(Character.isDigit(c)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
