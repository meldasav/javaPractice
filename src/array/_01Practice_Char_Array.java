package array;

import java.util.Arrays;

public class _01Practice_Char_Array {
    public static void main(String[] args) {
        char[] characters = {'#', '$', '5', 'A', 'b', 'H'};
        int counter = 0;
        for (char character : characters) {
            if (Character.isDigit(character)) {
                counter++;
            }
        }
        System.out.println(counter);

        String str = "hello";
        char[] letters = str.toCharArray();
        System.out.println(Arrays.toString(letters));
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'l') count++;
        }

        int max=Integer.MIN_VALUE;
        System.out.println(max);


    }

}


