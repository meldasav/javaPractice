package forLoops;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        int sum=0;

        for (int i = 10; i <=15 ; i++) {
           sum+=i;
        }
        System.out.println(sum);

        for (int i = 1; i < 50; i++) {
            if(i%5==0) System.out.println(i);
        }
        String str = "TechGlobal School";
        for(int i=0;i<=16;i=i+1){
            System.out.println(str.charAt(i));
        }


        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers would you like to enter");
        int number=scan.nextInt();
        int sum1=0;

        for (int i = 0; i < number; i++) {
            System.out.println("Please enter your number");
            sum1+=scan.nextInt();
        }
        System.out.println(sum1);
    }
}
