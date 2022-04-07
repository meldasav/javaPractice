package homeworks;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        // TASK 1//
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number 1?");
        int number1 = scan.nextInt();
        System.out.println("Please enter number 2?");
        int number2 = scan.nextInt();
        System.out.println("The average of the given 2 numbers is: " + ((number1 + number2) / 2) + "\n\n");
//        //TASK 2//
        System.out.println("Please enter number 1?");
        System.out.println("\"Please enter number 2?");
        System.out.println("The product of the given 2 numbers is: " + (scan.nextInt() * scan.nextInt()) + "\n\n");
//        //TASK3//
        System.out.println("Please enter 3 numbers ?");
        int nb1 = scan.nextInt(),nb2=scan.nextInt(),nb3 = scan.nextInt();

        System.out.println("The"+nb1+ " multiplied with"+nb1+ "is = " + (nb1 * nb2));
        System.out.println("The"+nb2+ " multiplied with"+nb2+ "is = " + (nb1 * nb2));
        System.out.println("The 10 multiplied with 10 is = " + (nb3 * nb3) + "\n\n");
//        //TASK4//
        System.out.println("Please enter number 1?");
        int nr1 = scan.nextInt();
        System.out.println("Please enter number 2?");
        int nr2 = scan.nextInt();
        System.out.println("The remainder of 25 % 8 = " + (nr1 % nr2) + "\n\n");
//        //TASK5//
        System.out.println("Please enter number 1?");
        int num1 = scan.nextInt();
        System.out.println("Please enter number 2?");
        int num2 = scan.nextInt();
        System.out.println("Please enter number 3?");
        int num3 = scan.nextInt();
        System.out.println("Please enter number 4?");
        int num4 = scan.nextInt();
        System.out.println("Please enter number 5?");
        int num5 = scan.nextInt();
        // int average = (num1 + num2 + num3 + num4 + num5) / 5;
        // System.out.println("The average of the given 5 numbers is: " + average + "\n\n");
        System.out.println("The average of the given 5 numbers is: " + (num1 + num2 + num3 + num4 + num5) / 5 + "\n\n");

//              //TASK 6//
        int number, total;
        System.out.println("Please enter  your multiplication table number ?");
        number = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
            total = number * i;
            System.out.println(number + "*" + i + "=" + total );

            //TASK 7
            System.out.println("Please enter a number ");
            int square = scan.nextInt();
            System.out.println("Perimeter of the square = " + (square * 4) + "\n" +
                    "Area of the square = " + (square * square));
        }
    }

}