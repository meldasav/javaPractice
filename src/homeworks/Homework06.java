package homeworks;

import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {

        // TASK  1
        String s1 ="5" ,  s2 = "10";
        int num1=Integer.parseInt(s1);//make your codes dynamic
        int num2=Integer.parseInt(s2);
        System.out.println("Sum of" + num1 + " and " + num2 + " is = " + (num1+num2));//instead of 5 and 10 use num1 num2
        System.out.println("Product of 5 and 10 is = " +(num1*num2));
        System.out.println("Division of 5 and 10 is = "+(num1/num2));
        System.out.println("Subtraction of  5 and 10 is = " +(num1-num2));
        System.out.println("Remainder of 5 and 10 is = " +(num1%num2)+"\n\n");

        //TASK  2

        String n1="200",n2="-50";
        int number1=Integer.parseInt(n1);
        int number2=Integer.parseInt(n2);
        System.out.println("The greatest value is = " + Math.max(number1,number2));
        System.out.println("The smallest value is = " + Math.min(number1,number2));
        System.out.println("The average is = " +(((number1+number2)/2)));
        System.out.println("The absolute difference is = " + Math.abs(number1-number2)+"\n\n");

        //TASK  3
        double quarters3=0.75,dime1=0.10,nickles2=0.10, penny1=0.01;
        System.out.println((int)(24/0.96)+" "+"days");
        System.out.println((int)(168/0.96)+" "+"days");
        System.out.println("$"+(5*30)*0.96+"\n\n");

        //TASK  4
        double jessieSave=1_250,perDay=62.5;
        System.out.println((int)(jessieSave/perDay)+"\n\n");

        //TASK  5

        double danSave=14_265,option1=475.50,option2=951;
        System.out.println("Option 1 will take "+" "+(int)(danSave/option1)+" "+"months");
        System.out.println("Option 2 will take "+" "+(int)(danSave/option2)+" "+"months"+"\n\n");

        //TASK  6
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 2 numbers");
        int nbr1= scan.nextInt();
        int nbr2=scan.nextInt();

       // double newNumber1=nbr1;
      //  double newNumber2=nbr2;
        System.out.println((double)nbr1/nbr2);


    }
}

