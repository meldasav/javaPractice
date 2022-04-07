package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class MathGrade {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Hey David! Please enter your balance?");
        double balance= scan.nextDouble();
        if(balance>=600){
            System.out.println("Awesome !you have enough money!");
        }else{
            System.out.println("sorry you are poor");
        }



    }
}
