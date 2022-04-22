package loops.controlStatements;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        /**ASK USER ENTER 2 NUMBER PRINT THE NUMBER BIGGER TO SMALLER BUT DO NOT PRINT NUMBER LESS THAN 10
         *
         */
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
//        if (Math.max(num1, num2) >= 10) {
//            for (int i = Math.max(num1, num2); i >= Math.min(num1, num2); i--) {
//                System.out.println(i);
//                if (i == 10) break;
//            }
//        }

        for (int i = Math.min(num1,num2); i <=Math.max(num1,num2) ; i++) {
            if(i==5)continue;
            System.out.println(i);

        }
    }
}