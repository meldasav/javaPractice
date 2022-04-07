package homePractice;



import utilities.MathHelper;

import java.util.Scanner;

public class Melda_Random {
    public static void main(String[] args) {

        //TASK 1

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int nb1= scan.nextInt();
        int nb2= scan.nextInt();
        int nb3= scan.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(nb1,nb2),nb3));
        System.out.println("Min value = " + Math.min(Math.min(nb1,nb2),nb3));

        //TASK 2
        System.out.println("Please enter 5 numbers");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int n3= scan.nextInt();
        int n4= scan.nextInt();
        int n5= scan.nextInt();
        int nMax=Math.max(n5,Math.max(((Math.max(n1,n2))),Math.max(n3,n4)));
        int nMin=Math.min(n1,Math.min(((Math.min(n2, n3))), Math.min(n4, n5)));
        System.out.println("Max value = " + nMax);
        System.out.println("Min value = " + nMin);
        //TASK  3

        System.out.println("Please enter 2 numbers");
        int nR1= scan.nextInt();
        int nR2= scan.nextInt();
        int dif=Math.abs(nR1-nR2);
        System.out.println("The difference between numbers is = " +dif);

        //TASK  4
        int random=(int)((Math.random()*51)+50);
        int rnd2=(int)((Math.random()*51)+50);
        int rnd3=(int)((Math.random()*51)+50);
        int sum=(random+rnd2+rnd3);
        System.out.println("Number 1 = " + random);
        System.out.println("Number 2 = " + rnd2);
        System.out.println("Number 3 = " + rnd3);
        System.out.println("The sum of numbers is = "+(random+rnd2+rnd3));
        //TASK 5
        double alex=125,mike=220;
        double mikeNew=(mike+25.5);
        double alexNew=(alex-25.5);
        System.out.println("Alex’s money: " + alexNew);
        System.out.println("Mike’s money: " + mikeNew);
        //task6
        double davSave=390,day=15.60;
        int howMany=(int)(davSave/day);
        System.out.println(howMany);



        int mathRandom=(int)((Math.random()*54)+45);//end point-start point+1+start point numbers between 45/98
        System.out.println(mathRandom);

        int rnd1=(int)((Math.random()*19)+67);
        int rnd21=(int)((Math.random()*19)+67);
        int rnd33=(int)((Math.random()*19)+67);

        System.out.println( "max number " + Math.max(Math.max(rnd1,rnd2),rnd3));
        System.out.println( "max number " + Math.min(Math.min(rnd1,rnd2),rnd3));

        System.out.println(MathHelper.maxOf5(2, 3, 4, 5, 6));
        System.out.println(MathHelper.minOf5(2, 4, 6, 8, 1));
    }


    }

