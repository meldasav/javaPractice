package stringMethods;

import java.util.Arrays;

public class _15_toCharArray {
    public static void main(String[] args) {
        String s = "Java";
        char[] chars = s.toCharArray();
        System.out.println(Arrays.toString(chars));
        System.out.println(Arrays.toString("HELLO".toCharArray()));

        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'l') count++;
        }
        System.out.println(count);

        String str = "i like java";
        System.out.println(Arrays.toString(str.split("")));

    }
}