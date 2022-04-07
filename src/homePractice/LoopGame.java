package homePractice;

import java.util.Scanner;

public class LoopGame {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("how many would you like to enter");
//        int howMany = scan.nextInt();
//        int sumOf2 = 0;
//
//        for (int i = 0; i < howMany; i++) {
//            int value = scan.nextInt();
//            if (value > 100) {
//                System.out.println("your number is bigger than 100");
//                howMany += 1;
//                continue;
//            } else {
//                sumOf2 += value;
//            }
//        }
//        System.out.println("--------TASK 10----------");
//
//        String task10 = "";
//        do {
//            System.out.println("please " + (task10.equals("") ? "" : "re") + "enter a name");
//            task10 = scan.nextLine();
//        } while (!task10.toLowerCase().startsWith("j"));
//        System.out.println("end of the program");

            String word ="";
          if (word.length() <= 0) {
            System.out.println("Length is zero");
        } else {
            System.out.println("length is = " + word.length());
            System.out.println("First char is = " + word.charAt(0));
            System.out.println("Last char is = " + word.charAt(word.length() - 1));
            if (word.toLowerCase().contains("a")
                    || word.contains("e")
                    || word.contains("i")
                    || word.contains("u")
                    || word.contains("o")) {
                System.out.println("This String has vowel");
            }else{
                System.out.println("This String does not have vowel");
            }


        }
    }


}