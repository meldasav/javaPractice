package loops.controlStatements;

import java.util.Scanner;

public class UnderstandingControlStatements {
    public static void main(String[] args) {
        /* Write a program that prints all the number between 1 - 25.
But skip the numbers that can be divided by 10.
Now do not print any numbers that are more than 15.
*/
        for(int i=1; i<=25; i++){
            if(i%10==0)continue;
            else System.out.println(i);
            if(i==15)break;
        }
        System.out.println("end of the program");

        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a number");
        int num1=scan.nextInt();
        System.out.println("please enter a second number");
        int num2=scan.nextInt();
        for(int i=Math.max(num1,num2);i>=Math.min(num1,num2); i--){
            if(i==5)continue;
            System.out.println(i);
        }

    }
}
