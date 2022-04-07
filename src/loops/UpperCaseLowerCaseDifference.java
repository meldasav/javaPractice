package loops;

import methods.FindTheLastLetterOfTheName;

public class UpperCaseLowerCaseDifference {
    public static void main(String[] args) {
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int countUp=0;
        int countL=0;
        for (int i = 0; i < address.length(); i++) {
            if(Character.isUpperCase(address.charAt(i))) countUp++;
            else if(Character.isLowerCase(address.charAt(i)))countL++;
        }
        System.out.println(Math.abs(countL-countUp));
    }
}
