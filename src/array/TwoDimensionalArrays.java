package array;

import java.util.Arrays;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        String[][] studentGroups = {
                {"Kaly", "Gulizar", "Melda"}
                , {"Torrie", "David"},
                {"Abe", "Data"}};
        System.out.println(studentGroups[0][1]);//Gulizar
        System.out.println(studentGroups[1][0]);//torrie
        System.out.println(studentGroups[2][1]);
        System.out.println(studentGroups.length);//3
        //how to get size of second group
        System.out.println(studentGroups[1].length);//2
        System.out.println(studentGroups[2].length);
        //how to print the 3 th group
        System.out.println( Arrays.toString(studentGroups[2]));
        System.out.println(Arrays.deepToString(studentGroups));
        for (String[] group :studentGroups){
            System.out.println(Arrays.toString(group));

/*
            How to print each group member in separate lines

            RESULT:
            Kaly
                    Guluzar
            Melda
                    Torrie
            David
                    Abe
            Data
                    */

            System.out.println("\n------Printing all members with fori loop--------\n");
            for (int i = 0; i < studentGroups.length; i++) {
                for (int j = 0; j < studentGroups[i].length; j++) {
                    System.out.println(studentGroups[i][j]);
                }
            }


            System.out.println("\n------Printing all members with for each loop--------\n");
            for(String[] group1 : studentGroups){
                for(String member : group1){
                    System.out.println(member);
                }
            }


            }
                }

            }




