package homeworks.homeworks_fixed;

import java.util.Random;
import java.util.Scanner;

public class HomeWork_08 {
    public static void main(String[] args) {
        Random random = new Random();
        int random1 = random.nextInt(51);
        System.out.println(random1);
        System.out.println(random1 >= 10 && random1 <= 25);

        System.out.println(">>>>>>task2<<<<<<<");
        /**
         * 1st quarter is 1-25
         * 2nd quarter is 26-50
         * 3rd quarter is 51-75
         * 4th quarter is 76-100
         * 1st half is 1-50
         * 2nd half is 51-100
         */
        int random2 = random.nextInt(101);
        System.out.println(random2);
        if (random2 <= 50) {
            System.out.println("Number is in the first half");
            if (random2 <= 25) {
                System.out.println("Number is in the 1st quarter");
            } else {
                System.out.println("Number is in the 2nd quarter");
            }

        } else {
            System.out.println("Number is in the second half");
            if (random2 <= 75) {
                System.out.println("Number is the 3th quarter");
            } else {
                System.out.println("Number is in the 4th quarter");
            }
        }

        System.out.println(">>>>>>task3<<<<<<<");
        /**
         * 1st  number will be multiplied by 5 and added as points
         * 2nd number will be multiplied by 4 and added as points
         * 3rd number will be multiplied by 3 and added as points
         * 4th number will be multiplied by 2 and added as points
         * 5th number will be multiplied by 1 and added as points
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(), n4 = scan.nextInt(), n5 = scan.nextInt();
        int point = 0;
        if (n1 >= 1 && n1 <= 10) point += n1 * 5;
        if (n2 >= 1 && n2 <= 10) point += n2 * 4;
        if (n3 >= 1 && n3 <= 10) point += n3 * 3;
        if (n4 >= 1 && n4 <= 10) point += n4 * 2;
        if (n5 >= 1 && n5 <= 10) point += n5;
        System.out.println(point);

    }

}
