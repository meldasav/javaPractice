package homeworks.homeworks_fixed;

import java.util.Scanner;

public class Project_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str = scan.nextLine();
        int count = 0;
        if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') count++;
            }
        } else {
            System.out.println("this sentence does not have multiple words");
        }
        System.out.println(count + 1);


        System.out.println("Please enter a word");
        String word = scan.next();
        StringBuilder reversed = new StringBuilder();
        if (!word.isEmpty()) {
            for (int i = word.length() - 1; i >= 0; i--) reversed.append(word.charAt(i));
            if (word.equals(reversed.toString())) System.out.println("this is palindrome");
            else System.out.println("this is not palindrome");
        } else {
            System.out.println("This word does not have 1 or more characters");
        }
        /**
         * Write a program that asks user to enter a sentence as a String and count how many a or A
         * letters that sentence has and print it with given below message.
         * NOTE: Write a program that handles any String
         * NOTE: First check if the given sentence has 1 character at least.
         * If not, then just print “This sentence does not have any characters”.
         */
        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        sentence= scan.nextLine();
        int countA = 0;
        if (sentence.length()>=1) {
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.toLowerCase().charAt(i) == 'a') countA++;
            }
            System.out.println("there are " + countA + " a in the sentence");
        } else System.out.println("There is not enough character in there");
        /**
         * Write a program that asks user to enter a positive number.
         * Print all the number starting from 1 to given number.
         * But, print “Foo” for the numbers divided by 2,
         * “Bar” for the numbers divided by 3 and “FooBar” for the numbers divided by both 2 and 3.
         */
        System.out.println("Please enter a number");
        int number=scan.nextInt();
        for (int i = 1; i <=number ; i++) {
            if(i%6==0) System.out.println("FooBar");
            else if(i%2==0) System.out.println("Bar");
            else if(i%3==0) System.out.println("Foo");
            else System.out.println(i);

        }
    }
}