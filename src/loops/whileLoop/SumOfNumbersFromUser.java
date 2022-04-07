package loops.whileLoop;

import java.util.Scanner;

public class SumOfNumbersFromUser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("please enter how many number you want to enter");
        int times= input.nextInt();
        int count=1;
        int sum2=0;
        while(count<=times){
            System.out.println("please enter number" + count);
            sum2+=input.nextInt();
            count++;
        }
        System.out.println(sum2);
    }
}
