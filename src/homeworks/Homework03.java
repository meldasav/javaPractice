package homeworks;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {


      //                      TASK 1
           Scanner simpleNumber=new Scanner(System.in);

//        System.out.println("What is the first number?");
//        int number1=simpleNumber.nextInt();
//
//        System.out.println("What is the second number?");
//        int number2=simpleNumber.nextInt();
//
//        System.out.println(" The number 1 entered by user is = " +number1 + " \n\n"  +
//                " The number 2 entered by user is = " + number2 + " \n\n" +
//                " The sum of number 1 and 2 entered by user is =\n " +
//                (number1 + number2));
//
// //                             TASK 2
//
//        System.out.println("What is the first number?");
//        double nmb1=simpleNumber.nextDouble();
//
//        System.out.println("What is the second number?");
//        int nmb2=simpleNumber.nextInt();
//
//        System.out.println(" The number 1 entered by user is = " + nmb1 + " \n\n " +
//                "The number 2 entered by user is = " + nmb2 + " \n\n " +
//                "The division of number 1 and 2 entered by user is \n= " + nmb1/nmb2);
//
// //                           TASK 3
//
        int a=10,b=7,c=5,d=72,e=24,f=9,g=3,h=18,j=6;
        System.out.println("1." + "\t" + ((b*c)-a));
        System.out.println("2." + "\t" + ((d+e)%e));
        System.out.println("3." + "\t" + (a+-(g)*(f/f)));
        System.out.println("4." + "\t" + (c+((h/g)*g)-(j%g)));
//
//        //                TASK 4
//
//        System.out.println("What is the first number?");
//        double first=simpleNumber.nextDouble();
//        System.out.println("What is the second number?");
//        double second=simpleNumber.nextDouble();
//        double sum3=first+second;
//        double product=first*second;
//        double subtract=first-second;
//        double div=first/second;
//        double reminder=first%second;
//
//        System.out.println("The sum of the given numbers is = " + sum3 + "\n" +
//                "The product of the given numbers is = " + product + "\n" +
//                "The subtraction of the given numbers is = " + subtract + "\n" +
//                "The division of the given numbers is = " + div + "\n" +
//                "The remainder of the given numbers is = " + reminder );
//
//
//  //                          TASK 5
//
//        double wid=7.5,hei=10.5;
//        double area=(7.5*10.5);
//        double perimeter=2*(7.5+10.5);
//
//        System.out.println("The area of the rectangle = " + area + "\n"+
//                "The perimeter of the rectangle = " + perimeter);
//
//        //                     TASK 6

        double averageSalary=90_000.00;
        int year=3;
        double salaryThree=(year*averageSalary);
        System.out.println("A Software Engineer in Test can earn " + salaryThree + " in " + "\n" +
                "3 years.");

        }
    }

