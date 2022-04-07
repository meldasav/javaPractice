package homeworks;

import utilities.ScannerHelper;

public class ExtraPractice {

    //public static String luckyUnluckyNumber(int num) {
//        if (num == -11) return "you hit the unlucky number!";
//        else if (num == 9) return "you hit the unlucky numbers";
//        else if (num > -50 && num < 0) return "the number is negative and more than -50";
//        else if (num > 0 && num < 50) return "the number is positive and less than 50";
//        else if (num == 0) return "the number is zero";
//        return"the number you provided is not good for this game";

        /*
    luckyUnluckyGame
        Create a method which will take an int as an argument and returns a String.
        •If the int number is in between -50/ 0 return "The number is negative and more than -50"
        •If the int number is in between 0/ 50 return "The number is positive and less than 50"
        •If the int number is  0 return "The number is zero"
        •If the number is 9 return "You have hit the lucky number!"
        •If the number is -11 return "You have hit the unlucky number!"
        -77
     */

//        public static String luckyUnluckyGame(int num){
//            if(num == -11) return "You have hit the unlucky number!";
//            else if(num == 9) return "You have hit the lucky number!";
//            else if(num > -50 && num < 0) return "The number is negative and more than -50";
//            else if(num > 0 && num < 50) return "The number is positive and less than 50";
//            else if(num == 0) return "The number is zero";
//
//            return "The number you provided is not good for this game";
//        }

        public static void main(String[] args) {

            int day =ScannerHelper.getNumberFromUser();

            switch (day){
                case 1:
                    System.out.println("today is monday");
                    break;
                case 2:
                    System.out.println("today is tuesday");
                    break;
                case 3:
                    System.out.println("today is wednesday");
                    break;
                case 4:
                    System.out.println("today is thursday");
                    break;
                case 5:
                    System.out.println("today is friday");
                    break;
                case 6:
                case 7:
                    System.out.println("today is weekend");
                break;
                default:
                    System.out.println("you enter invalid number");
            }


            //EDGE CASES - BOUNDARY CASES
//            System.out.println(luckyUnluckyGame(-11));
//            System.out.println(luckyUnluckyGame(9));
//            System.out.println(luckyUnluckyGame(0));
//            System.out.println(luckyUnluckyGame(-12));
//            System.out.println(luckyUnluckyGame(49));
//            System.out.println(luckyUnluckyGame(-75));
//            System.out.println(luckyUnluckyGame(34223));

            String na=ScannerHelper.getStringFromUser();
            System.out.println(na);
        }


        public static String getName(int age ,String name){
            String namE= ScannerHelper.getStringFromUser();
            int aGe =ScannerHelper.getNumberFromUser();
            char naMe=name.charAt(0);
            if(aGe>30 && naMe >= 65 && naMe <= 90)
                return "Age and letter checks out";
            else if(aGe >= 97 && aGe <= 122) return "Age checks out but letter doesn't";
            else if(aGe<=30 )return "Age doesn't check out but letter does";
            return "nothing checks out";








        }





}