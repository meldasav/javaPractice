package loops.doWhile;

import java.util.Scanner;

public class AskUser10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        do{
            System.out.println("please enter number");
            number=input.nextInt();
        }while(number<10);
        System.out.println("the number you entered is more than 10");
    }
}
