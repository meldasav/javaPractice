package lwhileLoop;

import utilities.RandomNumberGenerator;

public class PrintNumbersAscending {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            System.out.println(i);
        }
//        int i = 1;
//        while (i <= 7) {
//            System.out.println(i);
//            i++;
        int i = 1;
        while (i <= 30) {
            if (i % 3 == 0)
                System.out.println(i);
                i++;


        }
    }
}