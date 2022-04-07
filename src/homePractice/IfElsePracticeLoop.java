package homePractice;

public class IfElsePracticeLoop {
    public static void main(String[] args) {

         /*
        TASK-5 - Putting all together
        Write a program that characters from the below String.
        Then, print them with below messages

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        Expected result:
        Letters = 25
        LowerCases = 17
        UpperCases = 8
        Vowels = 10
        Consonants = 15
        Digits = 12
        Even digits = 9
        Odd digits = 3
        Spaces = 9
        Specials = 2

        Letters
            Uppercase or Lowercase
            Vowel or Consonant
        Digits
            Even
            Odd
        Spaces
        Specials
         */
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
           int letterCounter = 0, digitCounter = 0, spaceCounter = 0, specialCounter = 0,
                lowerCounter = 0, upperCounter = 0, vowelCounter = 0, consonantCounter = 0,
                 evenCounter = 0, oddCounter = 0;


           for(int i =0 ; i<address.length();i++){
               char c=address.charAt(i);
               if(Character.isUpperCase(c)){
                   upperCounter++;
               }
           }


    }
}

