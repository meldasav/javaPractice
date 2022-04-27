package exceptions;

public class Example03_checkedException {
    public static void main(String[] args) throws InterruptedException {

//        try {
//            for (int i = 0; i < 10; i++) {
//                Thread.sleep(1000);//hold it 2 seconds
//                System.out.println(i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //second way is adding exception to the method signature using throws keyword

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);//hold it 2 seconds
            System.out.println(i);
        }
        Thread.sleep(3000);
        System.out.println("End of the program");
    }
}