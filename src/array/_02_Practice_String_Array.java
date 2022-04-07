package array;

import java.util.Arrays;

public class _02_Practice_String_Array {
    public static void main(String[] args) {
        String[] students = {"Alex", "Tom", "James", "Jordon", "Lionel", "Adam"};
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println("sorted array" + students);
        System.out.println("first name " + students[0]);
        System.out.println("last name " + students[students.length - 1]);
        int counter = 0;
        for (String student : students) {
          if (student.toUpperCase().contains("A") || (student.toUpperCase().contains("E")) ) {
               counter++;
            }
        }
        System.out.println(counter);
        int count = 0;
        for (String student : students) {
            if(student.length()>=5){
                count++;
        }
        }
        System.out.println(count);
    }
    }
