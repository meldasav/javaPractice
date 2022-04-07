package loops;

import utilities.ScannerHelper;

public class ReverseString {
    public static void main(String[] args) {

       // Write a program that reads a name from user
      //  Reverse the name and print it back

//         //String name2 = name + "an";
//        //name = name + "an";
//        name += "an"; // Alexan
//        name += "d"; // Alexand
//        name += "e"; //Alexande
//        name += "r"; //Alexander

        String name= ScannerHelper.getStringFromUser();
        String reversedName="";
        for (int i = name.length()-1; i>=0 ; i--) {
           reversedName+=name.charAt(i);
        }
        System.out.println(((("the reversed name= " + reversedName))));
        System.out.println("the reversed name= "  + reversedName.toUpperCase());
     String name1="melda";
  for(int i=name1.length()-1;i>=0;i--){
      System.out.println(name1.charAt(i));
  }


    }
}
