package characterClass;

import utilities.CharacterHelper;

public class CountCharacters {
    public static void main(String[] args) {
        // Write a program that counts spaces for below String
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
       // TASK-1
        //Write a program that counts spaces for below String.


      //  Expected result:


        System.out.println("\n---TASK-1---\n");
       // String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count1 = 0;

        for (int i = 0; i <= address.length()-1; i++) {
            if(Character.isSpaceChar(address.charAt(i))) {
                count1++;
            }
        }

        System.out.println(count1);



        /*
        TASK-2
        Write a program that counts letters for below String.
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        25
         */
        System.out.println("\n---TASK-2---\n");
        int count2 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) count2++;
        }

        System.out.println(count2);

        /*
        TASK-3
        Write a program that counts uppercase and lowercase letters for below String.
        Then, find the difference between lowercase letters and uppercase letters
        Basically, find totalCountOfLowercaseLetters - totalCountOfUppercaseLetters
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        9
         */

        System.out.println("\n---TASK-3---\n");

        int countL = 0, countU = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) countU++;
            else if(Character.isLowerCase(c)) countL++;
        }

        System.out.println(Math.abs(countL - countU));

        System.out.println("\n---TASK-3 - Second Way---\n");

        int count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);
            if(Character.isUpperCase(c)) count3++;
            else if(Character.isLowerCase(c)) count3--;
        }

        //String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        System.out.println(Math.abs(count3));

        System.out.println("\n---TASK-3 - Third Way---\n");

        count3 = 0;

        for (int i = 0; i < address.length(); i++) {
            char c = address.charAt(i);

            if(Character.isLetter(c)){
                if(Character.isUpperCase(c)) count3++;
                else count3--;
            }
        }

        System.out.println(Math.abs(count1));






        }



    }
//    char c4='a';
//    boolean isc4Vowel=false;
//        for (int i = 0; i <s.length() ; i++) {
//        if(c4==s.charAt(i)){
//        isc4Vowel=true;
//        break;