package homeworks;

import java.util.ArrayList;
import java.util.List;

public class Homework16Gulizar {


        //  TASK 1
        public static int countWords(String str) {
            int countSpaces = 0;
            for (int element : str.trim().toCharArray())
                if (element == ' ' && element > 0) countSpaces++;
            return (countSpaces + 1);

        }
        //  TASK 2

        public static int countA(String str) {
            int count = 0;
            for (int i = 0; i < str.length(); i++)
                if (str.toLowerCase().charAt(i) == 'a' && str.length() > 0) count++;
            return count;

        }
        //  TASK 3

        public static int countPos(int[] arr) {
            int countPos = 0;
            for (int element : arr)
                if (element > 0) countPos++;
            return countPos;
        }

        //  TASK 4

        public static List<Integer> removeDuplicateNumbers(List<Integer> arr) {
            int j = 0;
            for (int i = 0; i < arr.size(); i++)
                for (j = i + 1; j < arr.size(); j++)
                    if (arr.get(i).equals(arr.get(j)))
                        arr.remove(j);
            return arr;
        }


        //  TASK 5

        public static List<String> removeDuplicateElements(List<String> str){
            for(int i = 0; i < str.size(); i++)
                for(int j = i + 1; j < str.size(); j++)
                    if(str.get(i).toLowerCase().equals(str.get(j)))
                        str.remove(j);

            return str;
        }
        //  TASK 6

        public static String removeExtraSpaces(String str){

            return str.trim().replaceAll("  +", " ");

        }
        //  TASK 7
                /*
                Requirement:
            Write a method add() that takes 2 int[] arrays as arguments and
            returns a new array with sum of given arrays elements.
            Test data 1:
            int[] arr1 = {3, 0, 0, 7, 5, 10};
            int[] arr2 = {6, 3, 2};
            Expected output 1:
            [9, 3, 2, 7, 5, 10]
            Test data 1:
            int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
            int[] arr2 = {10, 3, 6, 3, 2};
            Expected output 1:
            [16, 11, 9,  3, 2, 7, 5, 10, 34]
                 */

//    public static int[] add(int[] arr1, int[] arr2) {
//
//
//    }
        // TASK 8
                        /*
                        Requirement:
                    Write a method findClosestTo10() that takes an int[] array
                    as an argument, and returns the closest element to 10
                    from given array
                    Test data 1:
                    int[] numbers = {10, -13, 5, 70, 15, 57};
                    Expected output 1:
                    5
                    Test data 2:
                    int[] numbers = {10, -13, 8, 12, 15, -20};
                    Expected output 2:
                    8
                         */
        // public static int findTheClosestTo10(int[] arr) {



        // }
        public static void main(String[] args) {
            System.out.println("..............TASK 1 ..........................");
            String str2 = "    Java is fun     ";
            System.out.println(countWords(str2));

            System.out.println("..............TASK 2 ..........................");

            String str = "QA stands for Quality Assurance";
            System.out.println(countA(str));

            System.out.println("..............TASK 3 ..........................");

            int[] numbers =  {-23, -4, 0, 2, 5, 90, 123};
            System.out.println(countPos(numbers));

            System.out.println("..............TASK 4 ..........................");
            List<Integer> number = new ArrayList<>(); //[10, 20, 35, 20, 35, 60, 70, 60]
            number.add(10);
            number.add(20);
            number.add(35);
            number.add(20);
            number.add(35);
            number.add(60);
            number.add(70);
            number.add(60);
            System.out.println(removeDuplicateNumbers(number));


            System.out.println("..............TASK 5 ..........................");
            List<String> words = new ArrayList<>();   // ["java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"]
            words.add("java");
            words.add("C#");
            words.add("ruby");
            words.add("JAVA");
            words.add("ruby");
            words.add("C#");
            words.add("C++");
            System.out.println(removeDuplicateElements(words));

            System.out.println("..............TASK 6 ..........................");

            String str5 = "   I   am      learning     Java      ";
            System.out.println(removeExtraSpaces(str5));

            System.out.println("..............TASK 7 ..........................");
            int[] arr1 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
            int[] arr2 = {10, 3, 6, 3, 2};



            System.out.println("..............TASK 8 ..........................");

            int[] number2 = {10, -13, 5, 70, 15, 57};


        }
    }



