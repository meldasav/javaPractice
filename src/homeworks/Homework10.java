package homeworks;

import utilities.CharacterHelper;
import utilities.ScannerHelper;
import utilities.StringHelper;

public class Homework10 {
    public static void main(String[] args) {
        //TASK 1


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
        //TASK 2
        String task2 = "toyota";
        if (task2.length() < 3) {
            System.out.println("Length is less than 3");
        } else {
            if (task2.length() % 2 == 1) {
                System.out.println("" + task2.charAt(task2.length() / 2));
            } else {
                System.out.println("" + task2.charAt(task2.length() / 2 - 1) + task2.charAt(task2.length() / 2));
            }
        }
        //TASK 3
        String task3 = "Python";
        if (task3.length() < 4) System.out.println("INVALID INPUT");
         else System.out.println("First 2 characters are = " + task3.substring(0, 2));
              System.out.println("Last 2 characters are = " + task3.substring(task3.length() - 2));
              System.out.println("The other characters are = " + task3.substring(2, task3.length() - 2));

        //TASK 4
        String task4 = "";
        String first2 = task4.substring(0, 2);
        String last2 = task4.substring(task4.length() - 2);
        if (task4.length() < 2) {
            System.out.println("Length is less than 2");
        } else
            System.out.println(first2.equals(last2));

        //TASK 5
        String s1 = "1234";
        String s2 = "Green";
        if ( s1.length()<2 || s2.length() < 2 && s1.contains(" ") && s2.contains(" ")) System.out.println("INVALID INPUT");
        else System.out.println("" + s1.substring(1, s1.length() - 1) + s2.substring(1, s2.length() - 1));

        //TASK 6
        String task6 = "xxbluexx";
        if (task6.length() < 4) System.out.println("INVALID INPUT");
        else System.out.println(task6.startsWith("xx") && task6.endsWith("xx"));


    }
}