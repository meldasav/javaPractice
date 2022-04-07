package array;

import java.util.Arrays;

public class NumbersCollection {
    public static void main(String[] args) {
        int[] numbers=new int [3];
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));
        //2nd way
        int[] numbers2={1,2,3};
        System.out.println(numbers2);
        //3 th way
        int[] numbers3 =new int[]{1,2,3};
        System.out.println(Arrays.toString(numbers3));




    }
}
