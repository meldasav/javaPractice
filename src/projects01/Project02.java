package projects01;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {
                     //TASK 1
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your first number?");
        int first=scan.nextInt();
        System.out.println("Please enter your second number?");
        int second=scan.nextInt();
        System.out.println("Please enter your third number?");
        int third= scan.nextInt();
        System.out.println("The product of the numbers entered is = " + (first*second*third)+"\n\n");

                     //TASK 2
        System.out.println("What is your first name?");
        String name= scan.nextLine();
        scan.nextLine();
        System.out.println("What is your last name?");
        String lastName= scan.nextLine();
        System.out.println("What is your year of birth?");
        int year=scan.nextInt();
        int currentAge=(2022-year);
        System.out.println("Jennifer Worley’s age is = " + currentAge +".\n\n");

                    //TASK 3
        System.out.println("What is your full name?");
        String fullName=scan.nextLine();
        scan.nextLine();
        System.out.println("What is your weight?");
        double weight= scan.nextDouble();
        System.out.println("Alex Morgan’s weight is = " + (weight*2.205)+" "+ "Ibs.\n\n");

                    //TASK 4
        System.out.println("What is your full name?");
        String fullNm=scan.nextLine();
        scan.nextLine();
        System.out.println("What is your age?");
        int age1= scan.nextInt();
        System.out.println("What is your full name?");
        String fullNm1=scan.nextLine();
        scan.nextLine();
        System.out.println("What is your age?");
        int age2= scan.nextInt();
        System.out.println("What is your full name?");
        String fullNm2=scan.nextLine();
        scan.nextLine();
        System.out.println("What is your age?");
        int age3= scan.nextInt();
        System.out.println("Scott Wender’s age is " + age1+".");
        System.out.println("Ben Meeder’s age is " + age2+".");
        System.out.println("Matt Chris’s age is " + age3+".");
        System.out.println("The average age is "+ (age1+age2+age3)/3);
        System.out.println("The eldest age is " + (Math.max(Math.max(age1,age2),(age3)))+".");
        System.out.println("The youngest age is " + (Math.min(Math.min(age1,age2),(age3)))+".");
    }
}
