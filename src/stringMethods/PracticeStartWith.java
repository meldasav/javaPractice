package stringMethods;

import utilities.ScannerHelper;

public class PracticeStartWith {
    public static void main(String[] args) {
        String name= ScannerHelper.getStringFromUser();
        boolean nameNew=name.startsWith("a");
        boolean nameNew1=name.startsWith("A");
        if(nameNew || nameNew1 ){
            System.out.println("You are in the club A");
        }else{
            System.out.println("You are not in the club A");
        }
        System.out.println(name.toLowerCase().startsWith("a")?"You are in the club A":"You are not in the club A");
        // ternary //
        if(name.toUpperCase().startsWith("A")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name.toLowerCase().startsWith("a")){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name.charAt(0) == 'A' || name.charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name.toUpperCase().charAt(0) == 'A'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name.toLowerCase().charAt(0) == 'a'){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name.charAt(0) == 65 || name.charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

        if(name.toUpperCase().charAt(0) == 65){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }


        if(name.toLowerCase().charAt(0) == 97){
            System.out.println("You are in the club A");
        }
        else{
            System.out.println("You are not in the club A");
        }

       String name5="melda";


    }


}
