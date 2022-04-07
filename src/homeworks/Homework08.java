package homeworks;

import utilities.RandomNumberGenerator;

import java.util.Scanner;

public class Homework08 {
    public static void main(String[] args) {


        // TASK 1

//        int randomNumber1 = (int) (Math.random() * 51);
//        System.out.println(randomNumber1);
//
//        if (randomNumber1 >= 10 && randomNumber1 <= 25) {
//            System.out.println("true");
//
//        } else {
//            System.out.println("false");
//        }

        // TASK 2

        int number = RandomNumberGenerator.getRandomNumber(1, 100);
        System.out.println(number);
        //option 1
//        if (number <= 50)
//            System.out.println("is in the 1st half");
//        else
//            System.out.println("is in the 2st half");
//
//        if (number <= 25)
//            System.out.println("is in the 1st quarter");
//        else if (number > 25 && number <= 50)
//            System.out.println("is in the 2st quarter");
//        else if (number > 50 && number <= 75)
//            System.out.println("is in the 3st quarter");
//        else if (number > 75)
//            System.out.println("is in the 4st quarter");

        //option 2
        if (number <= 50) {
            System.out.println("is in the 1st half");
            if (number <= 25)
                System.out.println("is in the 1st quarter");
            else if (number > 25 && number <= 50)
                System.out.println("is in the 2st quarter");
        } else {
            System.out.println("is in the 2st half");
            if (number > 50 && number <= 75)
                System.out.println("is in the 3st quarter");
            else if (number > 75)
                System.out.println("is in the 4st quarter");
        }

        //a marka süt
        String urun="sut";
        String renk ="beyaz";
        String kaynak="Inek, koyun, keçi";
        int sonkullanma=7;

        if(urun.equals("sut")&&renk.equals("beyaz")&&sonkullanma==7 && (kaynak.contains("Inek")||kaynak.contains("Koyun") || kaynak.contains("Keci"))){

        }



//        int randomNumber2 = (int) (Math.random() * 100) + 1;
//        System.out.println(randomNumber2);
//
//
//        if (randomNumber2 >= 1 && randomNumber2 <= 50) {                 //if
//            System.out.println(randomNumber2 + " is in the 1st half");
//        }
//        if (randomNumber2 >= 51 && randomNumber2 <= 100) {                 //if
//            System.out.println(randomNumber2 + " is in the 2nd  half");
//        } else if (randomNumber2 >= 1 && randomNumber2 <= 25) {            //else
//            System.out.println(randomNumber2 + " is in the 1st quarter");
//        } else if (randomNumber2 >= 26 && randomNumber2 <= 50) {           //else
//            System.out.println(randomNumber2 + " is in the 2nd quarter");
//        }
//        if (randomNumber2 >= 51 && randomNumber2 <= 75) {
//            System.out.println(randomNumber2 + " is in the 3rd quarter");     //else
//        } else if
//        (randomNumber2 >= 76 && randomNumber2 <= 100)
//            System.out.println(randomNumber2 + " is in the 4th quarter");     //if
//

        // TASK 3

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter 5 numbers between 1 to 10");
//        int number1 = scan.nextInt(), number2 = scan.nextInt(), number3 = scan.nextInt(), number4 = scan.nextInt(), number5 = scan.nextInt();
//        int points=0;
//
//        if(number1>=1 && number1<=10) {
//            points += number1 * 5;
//        }
//            if (number2 >= 1 && number2 <= 10) {
//                points += number2 * 4;
//            }
//                if (number3 >= 1 && number3 <= 10) {
//                    points += number3 * 3;
//                }
//                    if (number4 >= 1 && number4 <= 10) {
//                        points += number4 * 2;
//                    }
//                        if (number5 >= 1 && number5 <= 10) {
//                            points += number5;
//
//
//
//                        }
//        System.out.println(points);


    }

}




