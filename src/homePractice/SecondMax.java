package homePractice;

import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(secondMax(new int[]{1, 2,2,-9, 4, 7})));
        System.out.println(Arrays.toString(secondMin(new int[]{1, 2,2,-9, 4, 7})));
    }
    public static int[] secondMax(int[] number){
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for (int i : number) {
            if(i>max)max=i;
        }
        for (int i : number) {
            if(i>secondMax && i!=max)secondMax=i;
        }
        return new int[]{secondMax};
    }

    public static int[] secondMin(int[] number){
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for (int i : number) {
            if(i<min)min=i;
        }
        for (int i : number) {
            if(i<secondMin && i!=min)secondMin=i;
        }
        return new int[]{secondMin};
    }
}
