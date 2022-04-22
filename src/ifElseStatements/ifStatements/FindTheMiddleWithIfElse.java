package ifElseStatements.ifStatements;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMiddleWithIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        int number1 = scan.nextInt(), number2 = scan.nextInt(), number3 = scan.nextInt();

        System.out.println("You entered : " + number1 + " " + number2 + " " + number3);

        int mid = 0;
        int max = Math.max(number1, Math.max(number2, number3));
        int min = Math.min(number1, Math.min(number2, number3));

        if (number1 != max && number1 != min) mid = number1;
        else if (number2 != max && number2 != min) mid = number2;
        else mid = number3;

        System.out.println("middle number is = " + mid);






    }
}

