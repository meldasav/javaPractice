package projects;

import java.util.Arrays;
import java.util.Objects;

public class Project07 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 6, 7, 8, 15, 15};
        findGreatestAndSmallest(arr);
        findGreatestAndSmallestLoop(arr);
        findSecondGreatestAndSmallest(arr);
        String[] task5 = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(task5);
        findMostRepeatedElementInAnArray(task5);

    }

    //TASK1

    public static void findGreatestAndSmallest(int[] task1) {
        Arrays.sort(task1);
        System.out.println(" Smallest = " + task1[0]);
        System.out.println(" Greatest = " + task1[task1.length - 1]);
    }

    //TASK2
    public static void findGreatestAndSmallestLoop(int[] task2) {
        int min = 0;
        int max = 0;
        for (int i : task2) {
            if (min > i) min = i;
            if (max < i) max = i;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    //TASK3
    public static void findSecondGreatestAndSmallest(int[] task3) {
        Arrays.sort(task3);
        System.out.println("Second smallest = " + task3[1]);
        System.out.println("second biggest = " + task3[task3.length - 2]);
    }

    //TASK4
           public static int getMaxValue(int[] numbers, int first) {
            int maxValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > maxValue && first != numbers[i]) {
                    maxValue = numbers[i];
                }
            }
            return maxValue;
        }
        public static int getMinValue(int[] numbers, int firstMin) {
            int minValue = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < minValue && firstMin != numbers[i]) {
                    minValue = numbers[i];
                }
            }
            return minValue;
            }
        public static int  findSecondGreatestAndSmallest(int[] numbers, boolean isMax, int first) {
        int value = numbers[0];
        for (int number : numbers) {
            if (isMax)
                if (number > value && first != number)
                    value = number;
                else if (number < value && first != number)
                    value = number;
        }
        return value;
    }


    //TASK5
    public static void findDuplicatedElementsInAnArray(String[] task5) {
        for (int i = 0; i < task5.length - 1; i++) {
            for (int j = i + 1; j < task5.length; j++) {
                if (task5[i] == task5[j]) {
                    System.out.println(task5[j]);
                }
            }
        }
    }

    //TASK6
    public static void findMostRepeatedElementInAnArray(String[] task6) {
        String[] repeat = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        int[] arr = new int[task6.length];
        int deleteElement = -1;
        for (int i = 0; i < repeat.length; i++) {
            int repeatedElement = 1;
            for (int j = i + 1; j < repeat.length; j++) {
                if (Objects.equals(repeat[i], repeat[j])) {
                    repeatedElement++;
                    arr[j] = deleteElement;
                }
            }
            if (arr[i] != deleteElement) {
                arr[i] = repeatedElement;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != deleteElement) {
                System.out.println(repeat[i] + ":" + arr[i]);
            }
        }
    }


}

