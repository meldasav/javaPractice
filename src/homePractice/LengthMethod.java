package homePractice;

import utilities.ScannerHelper;

import java.util.Scanner;

public class LengthMethod {

    public static void main(String[] args) {
        String sentences="TechGlobal";

        boolean checkSentence=sentences.startsWith("Tech");
        System.out.println(checkSentence);




//        String str = "Java is an object-oriented programming language";
//
//
//        String str1 = str.substring(0, 4);
//        String str2 = str.substring(11, 26);
//        System.out.println(str1);
//        System.out.println(str2);


//        String name=ScannerHelper.getNameFromUser();
//        System.out.println(name.charAt(name.length()-1));


//        String n="melda";
//        String nm="melda";
//        System.out.println(n.equals(nm));
//       boolean all= n.equals(nm);
//
//        Scanner scan=new Scanner(System.in);
//        System.out.println("enter 2 words");
//        String word1=scan.nextLine(),word2=scan.nextLine();
//        if(word1.equals(word2)) System.out.println("equal");
//        else System.out.println("not equal");

        //String words = ScannerHelper.getAStringFromUser();
       // String w1 = ScannerHelper.getAStringFromUser();
       // System.out.println(words.equals(w1));
        // String name= "Alex";
        // char firstChar=name.charAt(0);
    }

    public static String askUserFavoriteBook() {
        Scanner scan = new Scanner(System.in);
        String book = scan.nextLine();
        System.out.println("PLEASE ENTER YOUR BOOK");
        return book;

    }

}





