package homePractice;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));

    }
        /**
         Kullanicidan alinan 3 basamakli pozitif bir tamsayinin rakamlar toplamini bulun
         */
        public static int sumOfDigits(int number){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 3 digit number");
         number = scanner.nextInt();

        int onesPlace = 0;
        int sum = 0;
        for (int i = 0; i < 3; i++) {

            onesPlace = number % 10;
            sum = sum + onesPlace;
            number = number / 10;
        }
            return sum;
        }
}
