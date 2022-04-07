package array;

import java.util.Arrays;

public class DefaultValues {
    public static void main(String[] args) {
        String [] s= new String[5];
        System.out.println(Arrays.toString(s));
        int[] ints=new int[5];
        System.out.println(Arrays.toString(ints));

        char[] chars=new char[5];
        System.out.println(Arrays.toString(chars));

        boolean[] booleans= new boolean[5];
        System.out.println(Arrays.toString(booleans));
    }
}
