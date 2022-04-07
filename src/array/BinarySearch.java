package array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        /*
         TASK-3
        Check if you have an element equals to "iPad"
        If so, print true
        Else, print false

        "Remote", "Mouse","Mouse", "Keyboard", "iPad"

        Arrays class has binarySearch() method that helps us find if our collection contains a specific element or not
        NOTE: To be able to use this method, your array MUST be sorted first

        This method is taking 2 args, first is your array collection and the second is the element you are looking for

        1.One element is found -> it returns the index of the element - more than or equal to zero
        2.Multiple elements are found -> it returns the index of last occurrence
        3.No element found -> always returns negative index (-possible index -1)

        System.out.println("\n--------TASK-3---------\n");

        Arrays.sort(objects); // My array is sorted "Keyboard", "Mouse","Mouse", "Remote", "iPad"
        //                       0         1       2        3       4

        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Apple") >= 0); // false
        System.out.println(Arrays.binarySearch(objects, "Keyboard") >= 0); // true
        System.out.println(Arrays.binarySearch(objects, "Key") >= 0); // false
         */

        int [] numbers={5,-2,0,-7,0,5,8,45,53};
        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers,5)>=0);
        System.out.println(Arrays.binarySearch(numbers,0)>=0);
        System.out.println(Arrays.binarySearch(numbers,45)>=0);
        System.out.println(Arrays.binarySearch(numbers,3)>=0);




    }
}
