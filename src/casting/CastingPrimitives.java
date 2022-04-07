package casting;

public class CastingPrimitives {
    public static void main(String[] args) {
        int myInt=32;
        long myLong=myInt;    // implicit casting

          myInt=(int) myLong ;   //explicit casting   int=char

        int mySecondInt ='B';   // implicit casting
        char myChar =(char)56;   // you don't have to cast they are equal cast=int
        char mySecondChar=56;
        int myThirdInt= (int) 45.5; //take my number double number return to int whole number
        short myShort=(short) myChar;
        char myThirdChar=(char) myShort;
    }
}
