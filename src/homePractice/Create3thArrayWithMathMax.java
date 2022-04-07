package homePractice;

import java.util.Arrays;

public class Create3thArrayWithMathMax {
    public static void main(String[] args) {
        int[] first = {5, 8, 13, 1, 2, 2, 9};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[Math.max(first.length, second.length)];
        for (int i = 0; i < third.length; i++) {
            if(i<Math.min(first.length,second.length)){
                third[i]=Math.max(first[i],second[i]);
            }else if(first.length > second.length){
            third[i] = first[i]; // getting the rest
        }else{
            third[i] = second[i];// getting the rest
        }

        }
        System.out.println("1st array is = " + Arrays.toString(first) +
                "\n2nd array is = " + Arrays.toString(second) +
                "\n3rd array is = " + Arrays.toString(third));

    }
}