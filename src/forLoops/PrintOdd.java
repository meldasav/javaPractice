package forLoops;

import utilities.ScannerHelper;

public class PrintOdd {
    public static void main(String[] args) {
//        int number= ScannerHelper.getNumberFromUser();
//
//        for (int i = 1;i<= number; i++) {
//            if(i%2==1){
//                System.out.println(i);
//            }
//
//        }
        //TASK 4
//        String task4 ="";
//        String first2 = task4.substring(0, 2);
//        String last2 = task4.substring(task4.length() - 2);
//        if (task4.length() < 2) {
//            System.out.println("Length is less than 2");
//        } else if (first2.equals(last2)) {
//            System.out.println("true");
//        } else {
//            System.out.println("false");
//        }

        System.out.println(">>>>>>>>>>>>>>>TASK4<<<<<<<<<<<<<<<<<<");

        String word4 = "abba";

        if (word4.length() < 2) {
            System.out.println("length is less than 2");
        }
        else{
            System.out.println(word4.charAt(0) == word4.charAt(word4.length() - 1) && word4.charAt(1) == word4.charAt(word4.length() - 2));
        }
    }

}
