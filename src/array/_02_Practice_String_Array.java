package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        String[] students = {"Alex", "Tom", "James", "Jordon", "Lionel", "Adam"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("sorted array" + Arrays.toString(students));
        System.out.println("first name " + students[0]);
        System.out.println("last name " + students[students.length - 1]);
        int counter = 0;
        for (String student : students) {
            if (student.toUpperCase().contains("A") || (student.toUpperCase().contains("E"))) {
                counter++;
            }
            System.out.println(counter);
        }
        /**
         * 2.way
         *
         */
        int countA = 0;
        for (String student : students) {
            if (student.toLowerCase().charAt(0) == 'a') countA++;
        }
        System.out.println(countA);

        int count = 0;
        for (String student : students) {
            if (student.length() >= 5) {
                count++;
            }
        }
        System.out.println(count);
        Arrays.sort(students);
        Arrays.toString(students);
        System.out.println(Arrays.binarySearch(students,"James")>=0);

        /**
         * count positive negative zeros
         */

        int[] array={1,7,9,-3,-6,0,4,0};
        int countPos=0,countNegative=0;
        for(int number:array){
            if(number>0)countPos++;
            else if(number<0)countNegative++;
        }
        System.out.println(countPos);
        System.out.println(countNegative);
        System.out.println(array.length-countPos-countNegative);//count zero
    }
}
