package dowhileLoop;

import java.util.Random;

public class UnderstandingDoWhile {
    public static void main(String[] args) {
        Random random=new Random();
        boolean b=random.nextBoolean();
        while(b){
            System.out.println("it is true");
        }
        System.out.println("end of program");


    }
}
