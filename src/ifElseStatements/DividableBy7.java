package ifElseStatements;

import java.util.Scanner;

public class DividableBy7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("write a number");
        int number= scan.nextInt();
        if(number%7==0){
            System.out.println("The number you entered is dividable by 7!");
        }else{
            System.out.println("The number you entered is not dividable by 7!");
        }
    }
}
