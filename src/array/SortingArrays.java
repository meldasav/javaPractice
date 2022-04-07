package array;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
     int[] numbers ={10,-5,0,0,0,3,7,9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        char[] characters={'A','b','z','H'};
        System.out.println("my char array =" + Arrays.toString(characters));
        Arrays.sort(characters);
        System.out.println(Arrays.toString(characters));
        String[] names={"Adam","Alex","tom","ally","Adele","terry","Josh"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        int counter=0;
        for (int i = 0; i < names.length; i++) {


        }

    }
}
