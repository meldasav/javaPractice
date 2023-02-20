package forLoops;

import java.util.Scanner;

public class Loop_Practice {

    public static void main(String[] args) {

        System.out.println("------------TASK 1 ------------");
        /**
         Write a program that prints all the numbers that are dividable by 7
         starting from 1 to 100 (1 and 100 are included)
         */
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            if (i % 7 == 0) sb.append(i).append("-");
        }
        System.out.println(sb.substring(0, sb.lastIndexOf("-")));

        /**
         Write a program that prints all the numbers that are dividable by
         both 2 and 3 starting from 1 to 50 (1 and 50 are included)
         */

        System.out.println("------------TASK 2 ------------");
        StringBuilder sb1 = new StringBuilder();
        for (int i = 1; i <= 50; i++) {
            if (i % 6 == 0) sb1.append(i).append("-");
        }
        System.out.println(sb1.substring(0, sb1.lastIndexOf("-")));

        System.out.println("------------TASK 3 ------------");
        /**
         Write a program that prints all the numbers that are dividable by 5
         starting from 100 to 50 (100 and 50 are included)
         */
        StringBuilder sb2 = new StringBuilder();
        for (int i = 100; i >= 50; i--) {
            if (i % 5 == 0) sb2.append(i).append("-");
        }
        System.out.println(sb2.substring(0, sb2.lastIndexOf("-")));

        System.out.println("------------TASK 4 ------------");
        /**
         * Write a program that prints the squares of all numbers starting from
         * 0 to 7 (0 and 7 are included)
         */
        int square;
        for (int i = 0; i <= 7; i++) {
            square = i * i;
            System.out.println("The square of " + i + "=" + square);
        }

        /**
         * Write a program that finds sum of the numbers starting from 1 to 10
         * Calculation => 1+2+3+4+5+6+7+8+9+10
         */
        System.out.println("------------TASK 5 ------------");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("------------TASK 6 ------------");
        int factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
        System.out.println("------------TASK 7 ------------");

        /**
         Write a program that asks user to enter their first and last name
         And count how many vowel letters they have in their first and last name
         Vowel letters = a, e, i, o, u
         */

        System.out.println("Please enter your full name");
        String fullName = scanner.nextLine();

        fullName = fullName.toLowerCase();
        int vowel = 0;
        for (int i = 0; i < fullName.length(); i++) {
            char c = fullName.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') vowel++;
        }
        System.out.println("There are " + vowel + " vowels in this full name");

        System.out.println("------------TASK 8 ------------");


        int sum1 =0;
        int number1;

        do {
            System.out.println("Please enter number");
            number1 = scanner.nextInt();
                sum1 += number1;
            number1++;
        }while (sum1<100);

        if(number1 == 1)System.out.println("This number is already more than 100");
        else  System.out.println("Sum of the entered numbers is at least 100");

        System.out.println("------------TASK 9 ------------");
        int n =0 ,n1=1,n2;
        StringBuilder str= new StringBuilder();
        for (int i = 0; i <=8; i++) {
            str.append(n).append("-");
            n2=n+n1;
            n=n1;
            n1=n2;
        }
        System.out.println(str.substring(0,str.lastIndexOf("-")));

        System.out.println("------------TASK 10 ------------");

       String name = " ";

        do{
            System.out.println("Please enter your name");
            name =scanner.next();

        }while(!name.toLowerCase().startsWith("j"));
        System.out.println("END OF THE PROGRAM");
    }
}
