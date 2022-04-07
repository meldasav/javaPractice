package homeworks;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {

        Scanner collect=new Scanner(System.in);
        System.out.println("what is your full name?");
        String fullName=collect.nextLine();

        System.out.println("how old are you?");
        int age=collect.nextInt();

        System.out.println("what is your email address?");
        String email=collect.nextLine();

         String emailAddress=collect.nextLine();
        collect.nextLine();
        System.out.println("what is your phone number?");
        String phone=collect.nextLine();

        System.out.println("what is your address?");
        String address=collect.nextLine();

        System.out.println("\tUser who joined this program is " +fullName+ ".John’s age is \n"+
             age+ ".John’s email address is " + emailAddress
                + ",phone number " + phone + ",an address is " +address );

        System.out.println("what is your favorite book?");
        String book=collect.nextLine();

        System.out.println("what is your favorite color?");
        String color= collect.nextLine();

        System.out.println("what is your favorite number?");
        int number=collect.nextInt();

        System.out.println("User’s favorite book is: " + book + "\n"+
                "User’s favorite color is: " + color + "\n" +
                "User’s favorite number is: " + number );

//        System.out.println("What is number 1?");
//        int number1=collect.nextInt();
//
//        System.out.println("What is number 2?");
//        int number2=collect.nextInt();
//
//        System.out.println("The number 1 entered by user is = " + number1 + "\n" +
//                "The number 2 entered by user is = " + number2 + "\n" +
//        "The sum of number 1 and 2 entered by user is = " + (number2+number1));

//        System.out.println("What is number 1?");
//        double number1= collect.nextDouble();
//        System.out.println("What is number 2?");
//        double number2= collect.nextDouble();
//        System.out.println("The number 1 entered by user is = " + number1 + "\n" +
//        "The number 2 entered by user is = " + number2 + "\n"+
//        "The division of number 1 and 2 entered by user is = " + (number1/number2));

//        int a= 10,b=7,c=5,d=72,e=24,f=3,g=9,h=18,k=6;
//        System.out.println("1.\t"+((-10)+(7*5))+"\n");
//        System.out.println("2.\t"+(72+24)%24+"\n");
//        System.out.println("3.\t"+(10+(-3*(9/9)))+"\n");
//        System.out.println("4.\t"+((5+((18/3)*3))-(6%3)));

//        System.out.println( -10 + 7 * 5);

//        double area=7.5,perimeter=10.5;
//        System.out.println("The area of the rectangle = " + (area*perimeter));
//        System.out.println("The area of the rectangle = " + (2*(area+perimeter)));

          double annualSalary=90_000;
          double nextThreeYears=(3*annualSalary);
        System.out.println("A Software Engineer in Test can earn " + nextThreeYears + " in \n" +
                "3 years.");
    }
}
