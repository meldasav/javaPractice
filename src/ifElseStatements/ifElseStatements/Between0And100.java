package ifElseStatements.ifElseStatements;

import java.util.Scanner;

public class Between0And100 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");

        int number = scan.nextInt();
        if (number >= 0 && number <= 100) System.out.println("it is in between 0 and 100");
        else System.out.println("it is not in between 0 and 100");
    }
}

