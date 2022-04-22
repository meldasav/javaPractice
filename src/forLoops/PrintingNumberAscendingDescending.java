package forLoops;

import java.util.Random;

public class PrintingNumberAscendingDescending {
    public static void main(String[] args) {
        /**
         * generate 2 random numbers between 0-25 print the number smallest to biggest if they are not divided by 5
         */
        Random random = new Random();
        int num1 = random.nextInt(26);
        int num2 = random.nextInt(26);
        System.out.println(num1);
        System.out.println(num2);
        StringBuilder str = new StringBuilder();
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 5 != 0) str.append(i).append(" - ");
        }
        if (str.length() > 0) System.out.println(str.substring(0, str.length() - 3));
        else System.out.println(str);
    }
}
