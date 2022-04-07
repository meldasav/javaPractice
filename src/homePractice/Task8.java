package homePractice;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] array = new int[3];//doing this you are allocating some data in the memory
        int[] arrays = {1, 2, 3};
        System.out.println(array);//[I@1540e19d it is a location /address /it shows where is the array store
        // System.out.println(arrays[3]);//ArrayIndexOutOfBoundsException
        //CHAR RETURNS ----- EMPTY
        char[] character = new char[4];//returns output like that [, , ,]
        System.out.println(arrays[2]);
        String[] names = {"John", "Adam", "joe"};
        names[1] = "Abe";//reassign the name Adam out Abe in replace
        int[] ages = {18, 25, 16};
        for (int i = 0; i < names.length; i++) {//how to loop in array
            System.out.println(names[i] + "'s age is " + ages[i]);
            String[] name = new String[4];
            name[0] = "Apple";
            name[3] = "banana";
            System.out.println(Arrays.toString(name));

        }
        //reverse string

        String str = "Tech Global";
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);


        }
        System.out.println(reversed);

        String str1 = "TechGlobal School";
        for (int i = 0; i <= 16; i = i + 1) {
            System.out.println(str1.charAt(i));


        }

    }
}