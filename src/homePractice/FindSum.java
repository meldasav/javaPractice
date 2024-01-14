package homePractice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class FindSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sum(new int[]{1,2,3})));
        System.out.println(findMin1(new int[]{5,3,4}));

        /**
         Verilen sayinin rakamlarinin toplamini bulma
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();

        int sayininUzunlugu = (number + " ").length();
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int girilenSayi = number;

        for (int i = 0; i < sayininUzunlugu; i++) {

            birlerBasamagi = girilenSayi%10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi /= 10;
        }

        System.out.println(rakamlarToplami);

    }

    public static int[] sum(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]+=3;
        }
        return numbers;
    }
    public static int findMax(int[] numbers){
        int max=Integer.MIN_VALUE;
        for (int number : numbers) {
            if(number>max)max=number;
        }
        return max;
    }
    public static int findMin1(int[] numbers){
        TreeSet<Integer> number=new TreeSet<>();
        for (int i : numbers) number.add(i);
         return number.first();
        }
    }







