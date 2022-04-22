package utilities;

import java.util.Scanner;

public class ScannerHelper {
    public static void main(String[] args) {
        int num =ScannerHelper.getNumberFromUser();

    }
    public static int getNumberFromUser(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("please enter a number");
        int number=scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    public static String getStringFromUser(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a word : ");
        String str=scan.nextLine();
        return str;

    }
    public static String getCountryFromUser(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a Country");
        String country= scan.nextLine();
        return country;
    }
    public static String getAddressFromUser(){
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your Address");
        String address= scan.nextLine();
        return address;
    }


}
