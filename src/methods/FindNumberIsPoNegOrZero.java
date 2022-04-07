package methods;

import utilities.MathHelper;
import utilities.ScannerHelper;

import java.util.Scanner;

public class FindNumberIsPoNegOrZero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int number1 = scan.nextInt();
        if (MathHelper.isPositive(number1)) {
            System.out.println(" The number is positive");
        } else if (MathHelper.isNegative(number1)) {
        System.out.println("The number is negative");
         }else{
            System.out.println("The number is zero");
         }
    int num= ScannerHelper.getNumberFromUser();


    }
}
