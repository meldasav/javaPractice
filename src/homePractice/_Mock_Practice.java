package homePractice;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _Mock_Practice {
    public static void main(String[] args) {
        // is prime 2,3,5,7,11.......
        String word = "Hello world Chicago windy";
        System.out.println(word.split(" ").length);


        boolean isPrime = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number?");
        int number = scan.nextInt();

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);


        //task2
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};
        //find the first positive and first negative number
        boolean isPositive = false;
        boolean isNegative = false;
        for (int i = 0; i <= numbers.length; i++) {
            if (numbers[i] > 0) {
                isPositive = true;
                System.out.println(numbers[i]);
            } else {
                isNegative = true;
                System.out.println(numbers[i]);
            }
            if (isPositive && isNegative)
                break;
        }


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2, 4};

        for (int task : arr1) {
            for (int i : arr2) {
                if (task == i) {
                    System.out.println(task);
                }
            }
        }

        String str = "Java is aun";
        // System.out.println(Arrays.toString(str.split(" ")));
        System.out.println(str.split(" ").length);
        String[] word1 = str.split(" ");
        int countA = 0;
        for (String word2 : word1) {
            if (word2.toLowerCase().startsWith(" a")) countA++;
        }
        System.out.println(countA);
        int[] arr5 = {1, 2, 3};
        boolean isEven = false;
        for (int number1 : numbers) {
            if (number1 % 2 == 0) {
                isEven = true;
                System.out.println(number1);
                break;
            }
        }
        if (!isEven) System.out.println("There is no even number");
        String s2 = "Hello";
        int counter = 0;
        char[] c = s2.toCharArray();
        for (char character : c) {
            if (character == 'l') counter++;
        }
        System.out.println(counter);


        String[] objects = {"Remote", "Mouse", "Keyboard", "iPad"};
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0 && Arrays.binarySearch(objects, "Remote") >= 0);
        AbstractList<String> obj = new ArrayList<String>();
        obj.add("CHAIR");

        int[] arr = {1, 3, 2, 1, 3, 4, 3, 2, 6};
        //there are 2 occurrences of number 1,there are 3 occurrences of number 3,there are 2 number 2
        //1,1,2,2,3,3,3,4,6
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (arr[i] != arr.length - 1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j])
                        count++;
                    else
                        break;
                }
                System.out.println("there are " + count + " occurrences of number " + arr[i]);
                i += (count - 1);
            }
        }

    }
}
