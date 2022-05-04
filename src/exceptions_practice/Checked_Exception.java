package exceptions_practice;

public class Checked_Exception {
    public static void main(String[] args) {

        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);//2 second
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(3/0);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("end of program");

    }

}
