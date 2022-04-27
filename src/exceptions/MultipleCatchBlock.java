package exceptions;

public class MultipleCatchBlock {
    public static void main(String[] args) {
        try{
            System.out.println(3/0);
            System.out.println("Hello".charAt(1000));
        }catch (Exception se){
            se.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
