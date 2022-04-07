package homeworks;

import java.util.Scanner;

public class Homework05 {

                   //  TASK1
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter number a number?");
        int nbr1= scan.nextInt();
        System.out.println("Please enter number a number?");
        int nbr2= scan.nextInt();
        System.out.println("Please enter number a number?");
        int nbr3= scan.nextInt();
        System.out.println("Max value = "+ Math.max (Math.max(nbr1,nbr2),nbr3));
        System.out.println("Min value = "+ Math.min (Math.min(nbr1,nbr2),nbr3)+"\n\n");

               // TASK2//

        System.out.println("Please enter number a number?");
        int num1 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num2 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num3 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num4 = scan.nextInt();
        System.out.println("Please enter number a number?");
        int num5 = scan.nextInt();
        int maxOf5 = Math.max(num1, Math.max(Math.max(num2, num3), Math.max(num4, num5)));
        int minOf5=Math.min(num1,Math.min(Math.min(num2, num3), Math.min(num4, num5)));
        System.out.println("Max value = " +maxOf5);
        System.out.println("Min value = " +minOf5);
                  //TASK3//

        System.out.println("Please enter number a number?");
        int enter1= scan.nextInt();
        System.out.println("Please enter number a number?");
        int enter2=scan.nextInt();
        int enter12=Math.abs(enter1-enter2);
        System.out.println("The difference between numbers is = " +enter12+"\n\n");

                 //TASK4//
        int rnd1=(int)((Math.random()*51)+50);//numbers between 50-100
        int rnd2=(int)((Math.random()*51)+50);
        int rnd3=(int)((Math.random()*51)+50);
        int sum_Randoms=(rnd1+rnd2+rnd3);
        System.out.println( "The sum of numbers is = " +sum_Randoms);


                // TASK5//
        double alex=125.00,mike=220;
        double alexNewMoney=alex-25.5;
        double mikeNewMoney=mike+25.5;
        System.out.println("Alex's money is : $"+alexNewMoney+"\n"+
                "Mike's money is : $"+mikeNewMoney+"\n\n");
                 //TASK//
        double saveAll=390.00,saveDaily=15.60;
        int howManyDays=(int)(saveAll/saveDaily);
        System.out.println(howManyDays);


       // int maxOf5 = Math.max(num1, Math.max(Math.max(num2, num3), Math.max(num4, num5)));
       // int minOf5=Math.min(num1,Math.min(Math.min(num2, num3), Math.min(num4, num5)));




    }
}
