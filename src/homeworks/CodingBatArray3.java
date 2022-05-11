package homeworks;

import java.util.Arrays;

public class CodingBatArray3 {
    public static void main(String[] args) {
        System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
        System.out.println(Arrays.toString(fix34(new int[]{1, 3, 1, 4})));
    }
    //maxSpan([1, 2, 1, 1, 3]) → 4 first number is 1 appear on the 4 place
    public static int maxSpan(int[] numS) {
        int ans = 0;
        for (int i = 0; i < numS.length; i++) {
            for (int j = 0; j < numS.length; j++) {
                if (numS[i] == numS[j]) {
                    int temp = i - j + 1;
                    temp = numS[i];
                    if (temp > ans) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
    public static int[] fix34(int[] numS) {
        for (int i = 0; i < numS.length; i++) {
            if(numS[i]==3){
                int temp=numS[i+1];
                numS[i+1]=4;
                for (int j = i+2; j <numS.length ; j++) {
                    if(numS[j]==4){
                        numS[j]=temp;
                    }

                }
            }

        }
        return numS;
    }
}