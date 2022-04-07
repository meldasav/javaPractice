package homePractice;

import utilities.CharacterHelper;

import java.util.Scanner;

public class Homework11SalihSolution {
    public static void main(String[] args) {
        //TASK 7
        /*
        -Create scanner object for getting the full nama
        -create a counter outside
        -create fori loop check vowels
        print out our message
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();
        int counter = 0;
        for (int i = 0; i < fullName.length(); i++) {
            if (CharacterHelper.isVowel(fullName.charAt(i))) {
                counter++;
            }
        }
        System.out.println("THere are" + counter + "vowel letters in this full name");

        //TASK 8
       /*
       CREATE DO WHILE LOOP
       GET NUMBER FROM USER WITH SCANNER ADD THEM TO SUM
       IF THEY ARE MORE THAN OR EQUAL TO 100 PRINT MESSAGE "THIS NUMBER IS ALREADY MORE THAN 100
       CREATE CONTAINER FOR COUNTER ,SUM AND NUMBER .

        */
        int num = 0;//for getting number from user
        int sum = 0;//for getting sum of given numbers
        int attempt = 1;//checking how many times this loop run


        do {
            System.out.println("please enter a number");
            num = scanner.nextInt();
            System.out.println("This number is more than 100");
            if (attempt == 1 && num >= 100) {//attempt means first time run
                System.out.println("this number is already more than 100");
                break;
            } else {
                sum += num;
                if (sum >= 100) {
                    System.out.println("Sum of the entered is at least 100");
                }
            }
            attempt++;//for updating how many times we ran the loop
        } while (sum < 100);

        //TASK 9
        /*
        TWO CONTAINERS FOR 0,1 AND ANOTHER ONE FOR THE SUM,String for message
        CREATE FORI LOOP
           n1 n2 total
    i=  0  0   1  1
    i=  1  1   1  2
    i=  2  1   2  3
  */
        int n1 = 0;
        int n2 = 0;
        int total = 0;
        String message = "";
        for (int i = 0; i < 7; i++) {
            message+=n1 + "-";
            total = n1 + n2;
            n1 = n2;
            n2 = total;

        }
        System.out.println(message.substring(0,message.length()-3));

        //homework10 TASK 1 SOLUTION
        String s="TechGlobal";
        if(s.isEmpty()){//s.length==0 or s.length()<1
            System.out.println("Length is zero");
        }else{
            System.out.println(s.length());
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(s.length()-1));
            if(s.toLowerCase().contains("a") || s.toLowerCase().contains("e") || s.toLowerCase().contains("i")
            || s.toLowerCase().contains("o") || s.toLowerCase().contains("u")){

            }else{
                System.out.println("There is no vowel in the string");
            }
        }








    }
}
