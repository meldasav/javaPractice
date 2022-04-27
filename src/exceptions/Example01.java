package exceptions;

public class Example01 {
    public static void main(String[] args) {
        String[] names={"Alex","John","Max"};

        try {
            System.out.println(names[-5]);//ArrayIndexOutOfBoundsException
        }
              //Exception anyName YOU can also use this
        catch (Exception exception){
              exception.printStackTrace();

        }
        System.out.println("End of the program");
    }
}
