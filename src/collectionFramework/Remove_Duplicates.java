package collectionFramework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Remove_Duplicates {
     /**
    Write a method that takes an int array argument and returns the array back with all duplicates removed
    NOTE: the order of elements returned is not an issue.
    TEST DATA:
    [0, 5, 4, 0, 0]
    EXPECTED OUTPUT:
    [0, 4, 5]
     */
     public static int[] removeDuplicates1(int[] array){
          HashSet<Integer> uniques=new HashSet<>();
          for (int i : array)uniques.add(i);
          int[] arr=new int[uniques.size()];
          int index=0;
          for (Integer unique : uniques) arr[index++]=unique;
           return arr;
          }

     public static String[] removeDuplicatesString(String[] str){
          return new HashSet<>(Arrays.asList(str)).toArray(new String[0]);
     }

     public static void main(String[] args) {
          System.out.println(Arrays.toString(removeDuplicates1(new int[]{0, 5, 4, 0, 0})));
          System.out.println(Arrays.toString(removeDuplicatesString(new String[]{"foo", "bar","foo", "123", "bar"})));
     }

          }



