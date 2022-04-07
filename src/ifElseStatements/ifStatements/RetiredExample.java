package ifElseStatements.ifStatements;

import java.util.Scanner;

public class RetiredExample {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);//create a scanner object.Ask a question about their age.retrieve age
        System.out.println("Please enter your age");//use if statement and properaction in curly braces
        int age= scan.nextInt();
        if(age>=55){
            System.out.println("it is your time to get retired!");
        }else{
            System.out.println("you are not gonna retire");
        }

        System.out.println("enter your grade");
        int grade= scan.nextInt();

    }
}
