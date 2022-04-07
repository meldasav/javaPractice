package casting;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        //Autoboxing primitive-->object(wrapper class)
        float num=45.6F;
        Float numFloat=num;
        //unboxing
        //object(wrapper class)-->primitive
        Character character='D';
        char characterPrimitive=character;
        int number=45;
       Integer numberInt=number;
       System.out.println(numberInt);

       int myInt=32;
       long myInt1=myInt;
       int myInt2=(int)myInt1;

       String num1="23";
       int num1Int=Integer.parseInt(num1);
    }
}
