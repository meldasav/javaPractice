package exceptions;

public class UnderstandingException {
    public static void main(String[] args) {
        /**
         * unchecked exceptions are the ones you get when you run a program
         * unchecked exceptions=Runtime exceptions
          */


        String name = "John";

        try {
            System.out.println(name.charAt(10));//.StringIndexOutOfBoundsException
        }
        catch (StringIndexOutOfBoundsException exception){
            System.out.println("An exception is here!!!");
        }
        System.out.println("End of the program");


    }
}