package exceptions;

public class Example02 {
    public static void main(String[] args) {
        int number = 45;

        try {

            String s=null;
            System.out.println(s.startsWith("abc"));
            System.out.println(number / 0);
         //   System.out.println(number / 3);
           System.out.println("abc".charAt(15));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}