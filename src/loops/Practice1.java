package loops;

import utilities.ScannerHelper;

public class Practice1 {
    public static void main(String[] args) {
//        int number1= ScannerHelper.getNumberFromUser();
//        int number2= ScannerHelper.getNumberFromUser();
//
//        for (int i =Math.max(number2,number1); i >=Math.min(number2,number1); i--) {
//            System.out.println(i);
//            if(i==10) break;
//            }
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int countU=0;
        int countL=0;
        for (int i = 0; i < address.length(); i++) {
            if(Character.isLowerCase(address.charAt(i))){
                countL++;
            }else if(Character.isUpperCase(address.charAt(i))){
                countU++;

            }
        }
        System.out.println(Math.abs(countL-countU));

        for(int i=1;i<=20;i++){
            for(int j=1;j<=i;j++){
                System.out.print("M");
            }
            System.out.println();
        }


        }
    }

