package homePractice.CodingBadString1;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
    }
       public static int[] seriesUp(int n){
           int[] array=new int[n*(n+1)/2];
           int index=0;
           for(int j = 0; j < n; j++){
               for(int k = 1; k < j+2; k++){
                   array[index] = k;
                   index++;
               }
           }
           return array;
       }
    }

