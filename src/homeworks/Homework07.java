package homeworks;

import java.util.Scanner;

public class Homework07 {
    public static void main(String[] arg) {
        // TASK 1
        int random1 = (int) (Math.random() * 11);
        int random2 = (int) (Math.random() * 11);
        int random3 = (int) (Math.random() * 11);
        int random4 = (int) (Math.random() * 11);
        int number = 5;
        System.out.println("Number is = " + random1);
        System.out.println("Number is = " + random2);
        System.out.println("Number is = " + random3);
        System.out.println("Number is = " + random4);

        System.out.println("Absolute difference of " + random1 + " with " + number + " is = " + Math.abs(random1 - number));
        System.out.println("Absolute difference of " + random2 + " with " + number + " is = " + Math.abs(random2 - number));
        System.out.println("Absolute difference of " + random3 + " with " + number + " is = " + Math.abs(random3 - number));
        System.out.println("Absolute difference of " + random4 + " with " + number + " is = " + Math.abs(random4 - number));
        System.out.println("Greatest number is = " + Math.max(Math.max(random1, random2), Math.max(random3, random4)));
        System.out.println("Smallest number is = " + Math.min(Math.min(random1, random2), Math.min(random3, random4)) + "\n");

        //TASK 2
        int number1 = (int) (Math.random() * 101) - 50;
        int number2 = (int) (Math.random() * 101) - 50;
        int number3 = (int) (Math.random() * 101) - 50;
        int number4 = (int) (Math.random() * 101) - 50;
        int number5 = (int) (Math.random() * 101) - 50;
        int number6 = (int) (Math.random() * 101) - 50;
        int number7 = (int) (Math.random() * 101) - 50;
        int number8 = (int) (Math.random() * 101) - 50;
        int maximumNumber = Math.max(Math.max(Math.max(Math.max(number1, number2), Math.max(number3,
                number4)), Math.max(number5, number6)), Math.max(number7, number8));
        int minimumNumber = Math.min(Math.min(Math.min(Math.min(number1, number2), Math.min(number3,
                number4)), Math.min(number5, number6)), Math.min(number7, number8));
        System.out.println("Number 1 =  " + number1);
        System.out.println("Number 2 =  " + number2);
        System.out.println("Number 3 =  " + number3);
        System.out.println("Number 4=  " + number4);
        System.out.println("Number 5 =  " + number5);
        System.out.println("Number 6 =  " + number6);
        System.out.println("Number 7 =  " + number7);
        System.out.println("Number 8 =  " + number8);
        System.out.println("Greatest number is = " + maximumNumber);
        System.out.println("Smallest number is = " + minimumNumber);
        System.out.println("Average of 8 numbers is = " + (number1 + number2 + number3 + number4 + number5 + number6 + number8) / 8);
        System.out.println("Absolute difference between smallest and greatest is = " + (Math.abs(minimumNumber - maximumNumber)));
        //System.out.println("3rd number is positive " + (number3>0);instead of if else we can use this
        if (number3 > 0) System.out.println(" 3 rd number is :" + number3 + " and Positive");
        else System.out.println(" 3 rd number is :" + number3 + " negative");
        if (number5 < 0) System.out.println(" 5th number is :" + number5 + " negative");
        else System.out.println(" 5th number is :" + number5 + " positive");
        //System.out.println("5 th number is positive " + (number5<0);instead of if else we can use this
        if (number1 == 0 || number2 == 0 || number3 == 0 || number4 == 0 || number5 == 0 || number6 == 0 || number7 == 0 || number8 == 0)
            System.out.println("There is at least one zero among those numbers ");
        else System.out.println("There isn't at least one zero among those numbers " + "\n");

//        //TASK 3
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter 7 numbers between 0 and 50");
        int n1 = scan.nextInt(), n2 = scan.nextInt(), n3 = scan.nextInt(), n4 = scan.nextInt(), n5 = scan.nextInt(),
                n6 = scan.nextInt(), n7 = scan.nextInt();
        System.out.println("Number 1 = " + n1 + "\n" +
                "Number 2 = " + n2 + "\n" +
                "Number 3 = " + n3 + "\n" +
                "Number 4 = " + n4 + "\n" +
                "Number 5 = " + n5 + "\n" +
                "Number 6 = " + n6 + "\n" +
                "Number 7 = " + n7 + "\n");
        System.out.println("the greatest number is = " + Math.max(Math.max(Math.max(Math.max(n1, n2),
                Math.max(n3, n4)), Math.max(n5, n6)), n7));
        System.out.println("the smallest number is = " + Math.min(Math.min(Math.min(Math.min(n1, n2),
                Math.min(n3, n4)), Math.min(n5, n6)), n7));
        System.out.println("The average of 7 numbers is = " + (n1 + n2 + n3 + n4 + n5 + n6 + n7) / 7);

        if (n1 >= 10) System.out.println("First number is greater than or equal to 10  ");
        else System.out.println("First number is not greater than or equal to 10 ");

        if (n7 <= 40) System.out.println("Last number is less than or equal to 40");
        else System.out.println("false");

        if (n1 > 25 && n7 > 25) System.out.println("Both first and last numbers are greater than 25");
        else System.out.println("false");

        if (n1 == 0 || n1 == 50 || n2 == 0 || n2 == 50 || n3 == 0 || n3 == 50 || n4 == 0 || n4 == 50 || n6 == 0 || n6 == 50 || n7 == 0 || n7 == 50)
            System.out.println("At least one of those numbers is 0 or 50");
        else System.out.println("Non of these numbers 0 or 50");

        System.out.println("n6 is between 40 and 50");

        if (n1 >= 40 && n1 <= 50 || n2 >= 40 && n2 <= 50 || n3 >= 40 && n3 <= 50 || n4 >= 40 && n4 <= 50 || n5 >= 40 && n5 <= 50 || n6 >= 40 && n6 <= 50 || n7 >= 40 && n7 <= 50) {
            System.out.println(" There is number between 40 and 50");
        } else {
            System.out.println("There is no number between 40 and 50 " + "\n");
        }
        //TASK4
        int randomNumber1 = (int) (Math.random() * 101);
        int randomNumber2 = (int) (Math.random() * 101);
        int randomNumber3 = (int) (Math.random() * 101);
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);
        System.out.println(randomNumber3);

        if (randomNumber1 > 25 && randomNumber2 > 25 && randomNumber3 > 25)
            System.out.println("true");
        else System.out.println("false");

        if (randomNumber1 <= 25 || randomNumber2 <= 25 || randomNumber3 <= 25) {
            System.out.println("false");
        } else {
            System.out.println("numbers are bigger than 25");
        }

        //TASK5
        System.out.println("Please enter  your number");
        int day = scan.nextInt();

        switch (day) {
            case 1:
                System.out.println("The number entered returns MONDAY");
                break;
            case 2:
                System.out.println("The number entered returns TUESDAY");
                break;
            case 3:
                System.out.println("The number entered returns WEDNESDAY");
                break;
            case 4:
                System.out.println("The number entered returns THURSDAY");
                break;
            case 5:
                System.out.println("The number entered returns FRIDAY");
                break;
            case 6:
                System.out.println("The number entered returns SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("you enter invalid number");
        }

        // TASK6
        System.out.println("Please enter  your number");
        int randomNumber = scan.nextInt();
        if (randomNumber > -10 && randomNumber < 10) {
            System.out.println("You entered valid number");
        } else
            System.out.println("Your number not valid Please select the number between -10 to 10");
        if (randomNumber > 0) {
            System.out.println("Number entered is POSITIVE");
        } else if (randomNumber < 0) {
            System.out.println("Number entered is NEGATIVE");
        } else {
            System.out.println("Number entered is ZERO ");
        }
        if (randomNumber % 2 == 0) {
            System.out.println("Number entered is EVEN");
        } else if (randomNumber % 2 == 1)
            System.out.println("Number entered is ODD");


        //  TASK 7
        System.out.println("Tell me your exam results");
        int grade1 = scan.nextInt(), grade2 = scan.nextInt(), grade3 = scan.nextInt();
        int averageGrades = (grade1 + grade2 + grade3) / 3;
        if (averageGrades >= 70) System.out.println("YOU PASSED!");
        else System.out.println("YOU FAILED!");

        // TASK  8

        System.out.println("Please enter 3 numberS");
        int numberEnter1 = scan.nextInt(), numberEnter2 = scan.nextInt(), numberEnter3 = scan.nextInt();
        if (numberEnter2 == numberEnter3 && numberEnter1 == numberEnter3) {
            System.out.println("TRIPLE MATCH");
        } else if (numberEnter2 == numberEnter3 || numberEnter1 == numberEnter3 || numberEnter1 == numberEnter2) {
            System.out.println("DOUBLE MATCH");
        } else {
            System.out.println("NO MATCH");
        }

    }
}



