package projects;

import utilities.ScannerHelper;

public class Project06 {
    public static void main(String[] args) {
        System.out.println("--------Task 1--------");
        String task1Word = ScannerHelper.getStringFromUser();
        String task1Word1=task1Word.trim();
        int counter = 1;
        for (int i = 0; i < task1Word1.length() - 1; i++) {
            if ((task1Word1.charAt(i) == ' ') && (task1Word1.charAt(i + 1) != ' ')) {
                counter++;
            }
        }
        if (task1Word1.length() <= 2) {
            System.out.println("This sentence does not have multiple words");
        } else {
            System.out.println("This sentence has " + counter + " " + "words");
        }
        System.out.println("--------Task 2--------");

        String task2word = ScannerHelper.getStringFromUser();
        String empty = "";
        for (int i = task2word.length() - 1; i >= 0; i--) {
            empty += task2word.charAt(i);

        }
        boolean palindrome = true;
        for (int i = 0; i < task2word.length(); i++) {
            if (empty.charAt(i) != task2word.charAt(i)) {
                palindrome = false;
                break;
            }
        }
        if (task2word.length() == 0) {
            System.out.println("This word does not have 1 or more characters");
        } else if (palindrome) {
            System.out.println("This word is palindrome");
        } else {
            System.out.println("This word is not palindrome");
        }
        System.out.println("--------Task 3--------");

        String task3Word = ScannerHelper.getStringFromUser();
        int count = 0;
        char c = 'A';
        char c1 = 'a';
        boolean isA = false;
        for (int i = 0; i < task3Word.length(); i++) {
            if (c == task3Word.charAt(i) || c1 == task3Word.charAt(i)) {
                count++;
            }
        }
        if (task3Word.length() == 0) {
            System.out.println("This sentence does not have any characters");
        } else {
            System.out.println("This sentence has " + count + " " + c1 + " " + "or" + " " + count + " " + c + " " + "letters.");
        }
        System.out.println("--------Task 4--------");

        int number = ScannerHelper.getNumberFromUser();
        for (int i = 1; i <=number; i++) {
            if (i % 6==0) {
                System.out.print("FooBar");
            } else if (i % 2 == 0) {
                System.out.println("Foo");
            } else if (i % 3 == 0) {
                System.out.println("Bar");
            } else {
                System.out.println(i);
            }
        }

            }

        }

