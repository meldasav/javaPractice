package homeworks;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework11 {
    public static void main(String[] args) {
        System.out.println("--------TASK 1---------");
        String task1 = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) task1 += i + " - ";
        }
        System.out.println(task1.substring(0, task1.indexOf("-", 13))
                + "... " + task1.substring(49, task1.length() - 3));

        System.out.println("--------TASK 2----------");
        String task2 = "";
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0 && i % 3 == 0) task2 += i + " - ";
        }
        System.out.println(task2.substring(0, task2.indexOf("-", 8))
                + "... " + task2.substring(24, task2.length() - 3));

        System.out.println("--------TASK 3----------");
        String task3 = "";
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) task3 += i + " - ";
        }
        //100 - 95 - 90 - 85 - 80 - 75 - 70 - 65 - 60 - 55 - 50 -
        System.out.println(task3.substring(0, task3.indexOf("-", 10))
                + "... " + task3.substring(task3.lastIndexOf("-", 39), task3.length() - 3));

        System.out.println("--------TASK 4----------");
        int square;
        for (int i = 0; i <= 7; i++) {
            square = i * i;
            System.out.println("The square of " + i + " is = " + square);
        }
        System.out.println("--------TASK 5----------");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("--------TASK 6----------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        scan.nextLine();
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        System.out.println("--------TASK 7----------");

        System.out.println("Please enter your full name");
        String fullName = scan.nextLine();
        String name = fullName.toLowerCase();
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                count++;
            }

        }
        System.out.println("count of vowel is = " + count);

        System.out.println("--------TASK 8----------");

        System.out.println("how many would you like to enter");
        int howMany = scan.nextInt();
        int counter=howMany;
        int sumOf2 = 0;
        do {
            System.out.println("enter your "+ number);
            int value = scan.nextInt();
            scan.nextLine();
            if (value >= 100) {
                System.out.println("your number is bigger than 100 enter new number");
            } else {
                counter-=1;
                sumOf2 += value;
            }
        } while (counter>0);
        System.out.println("Grand Total: " + sumOf2);

        System.out.println("--------TASK 9----------");
        int numFib1=0;
        int numFib2=1;
        int numFib3;
        for(int i=0;i<=6;i++){
            System.out.print(numFib1 +"-");
            numFib3=numFib1+numFib2;
            numFib1=numFib2;
            numFib2=numFib3;
        }

        System.out.println("\n"+"--------TASK 10----------");

        String task10="";
        do{
            System.out.println("please enter a name");
            task10= scan.nextLine();
        }while(!task10.toLowerCase().startsWith("j"));
        System.out.println("end of the program");
    }
}








