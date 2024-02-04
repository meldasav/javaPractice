package array;

import java.util.Arrays;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {

        int[] array ={1,3,4,5,6,7,7,4,3,2,1};
        printElementFrequency(array,7);
        String[] objects = {"Remote", " Mickey Mouse", " Mickey Mouse", "Keyboard", "ipad"};
        boolean isOneOfTheElementIsBoard = false;
        for (String object : objects) {
            if (object.equals("board")) {
                isOneOfTheElementIsBoard = true;
                break;
            }

        }
        System.out.println(isOneOfTheElementIsBoard);
        System.out.println(Arrays.toString(objects).contains("board"));
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects,"Keyboard")>=0);//return true or false

    }
    /**
     * Create a method that checks if a given element exists in an array
     * and if it does, print how many times it has been used.
     */

    public static void printElementFrequency(int[] arr , int number){
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
             if(arr[i] == number){
                 count++;
             }
        }
        if(count == 0){
            System.out.println("Element is not exist in the array");
        }else{
            System.out.println("Element " + number + " is repeated " + count + " times in the array");
        }
    }
}