package homePractice;

import methods.FindSpaceInStringMethod;

import java.util.Scanner;

public class UpperCaseFirstLetter {

    public static void main(String[] args) {
        String name = "melda";
        String lastLetter = name.substring(name.length() - 1);
        String firstLetter=name.substring(0,1);
        String middle=name.substring(1,name.length()-1);
        System.out.println(""+lastLetter+middle+firstLetter);
        //OUTPUT aeldm
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
        //OUTPUT Melda
        Scanner scan=new Scanner(System.in);
        System.out.println("please tell me your first and last name");
        String name1= scan.nextLine();
        System.out.println(FindSpaceInStringMethod.countSpace(name1));
    }

}
