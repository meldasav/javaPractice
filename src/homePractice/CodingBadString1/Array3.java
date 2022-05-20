package homePractice.CodingBadString1;

import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3)));
        System.out.println((countClumps(new int[]{1,2,2,3,4,4})));
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
       public static int countClumps(int[] num){
        int count=0;
           for (int i = 0; i < num.length; i++) {
               if(i==0 || num[i]!=num[i-1] && (i!=num.length-1 && num[i]!=num[i+1])){
                   count++;
               }
           }
           return count;
       }
    }

