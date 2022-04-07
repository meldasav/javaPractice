package homePractice;

import java.util.Scanner;

public class FindtheSmallestFromUser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println(num1 > num2 ? num1 + "" + " is bigger number" : num2 + " is bigger number");

    }
}
