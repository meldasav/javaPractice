package stringMethods;

import utilities.ScannerHelper;

import java.util.Locale;

public class _12_contains {

     /*
        Method Task: It is used to find out if a String contains another string or character
        -It is non-static, and we can call it with an object
        -it is a return type, and it returns a boolean
        -It takes a String argument
         */

    public static void main(String[] args) {
        String address = ScannerHelper.getAddressFromUser();
        if(address.toLowerCase().contains("chicago")){
            System.out.println("You are in the club");
        }else{
            System.out.println("You are not in the club");
        }
        //address.toLowerCase().contains("chicago")?"You are in the club":"You are not in the club"



    }


}
