package projects;

import java.util.Arrays;

public class Project06SalihSolution {


    public static void main(String[] args) {
        //task 2
        /*
        Requirement:
        -Create a String array that stores cartoon cats
                below
        Garfield, Tom, Sylvester, Azrael

         */
        String[] cats = {"Garfield", " Tom", "Sylvester", " Azrael"};
        /*
        1. create a String and store data, create 2 flags(container) for checking
        2. Print the entire array sorted lexicographically
        3. Then, check if it contains Garfield and Felix
        -if it contains both, then print true
        -if it does not contain both, print false
         */
        boolean isGarfieldExisting = false;
        boolean isFelixExisting = false;

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        for (String cat : cats) {
            if (cat.equals("Garfield")) isGarfieldExisting = true;
            else if (cat.equals("Felix")) isFelixExisting = true;
        }
        System.out.println(isFelixExisting && isGarfieldExisting);
        // task 9
        String[] objects = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};
        int upper = 0;
        int lower = 0;
        int countBP = 0;
        int bookPen = 0;
        for (String object : objects) {
            if (Character.isUpperCase(object.charAt(0))) upper++;
            else if (Character.isLowerCase(object.charAt(0))) lower++;
            if (object.toLowerCase().charAt(0) == 'b' || object.toLowerCase().startsWith("p")) countBP++;
            if (object.toLowerCase().contains("book") || object.toLowerCase().contains("pen")) bookPen++;
        }
        System.out.println("Elements starts with uppercase = " + upper +
                "\nElements starts with lowercase = " + lower +
                "\nElements starting with B or P = " + countBP +
                "\nElements having ”book” or “pen”= " +bookPen);



    }
    }
