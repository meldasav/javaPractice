package array;

import java.util.Arrays;
import java.util.Scanner;

public class CreateNewArray {
    public static void main(String[] args) {
        int[] array = newArray();
        System.out.println(Arrays.toString(array));

    }

    /**
     * Write a method that takes the size of the array and the elements from the user,
     * creates the array, and returns it
     */

    public static int[] newArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size will be your array");
        int size = scan.nextInt();
        int[] newArray = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println(" enter a number for " + i + " . index");
            newArray[i] = scan.nextInt();
        }
        return newArray;
    }
}
