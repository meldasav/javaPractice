package utilities;

public class CharacterHelper {
    public static void main(String[] args) {

        System.out.println(isSpace(' '));
        System.out.println(isLetter('g'));
        System.out.println(isLetter('5'));
        System.out.println(isLetter('A'));
        System.out.println(isVowel('A'));
        System.out.println(isVowel('G'));
        System.out.println(isConsonant('k'));
    }

    //TASK 1//
    public static boolean isSpace(char character) {
    // return character==32;
        if (character == 32)
            return true;
         else
            return false;
    }

    //TASK 2//
    public static boolean isDigit(char digit) {
    // return digit >= 48 && digit <= 57;
        if (digit >= 48 && digit <= 57) {
            return true;
        } else {
            return false;
        }
    }

    //TASK 3//
    public static boolean isUpperCase(char upperCase) {
         return upperCase >= 65 && upperCase <= 90;
        //String final=( upperCase >= 65 && upperCase <= 90)?"big":"small";
//        if (upperCase >= 65 && upperCase <= 90) {
//            return true;
//        } else {
//            return false;
//        }
    }

    //TASK 4//
    public static boolean isLowercase(char lowercase) {
        String finalLowerCase=(lowercase >= 97 && lowercase <= 122)?"lower":"upper";
        return lowercase >= 97 && lowercase <= 122;
    }

    //TASK 5//
    public static boolean isLetter(char mineLetter) {
        boolean isLow = isLowercase(mineLetter);
        boolean isUp = isUpperCase(mineLetter);
        return isLow || isUp;

    }
    //TASK 6//

    public static boolean isVowel(char mineVowel) {
      //  String target = "AEOUaeuoi";
       // return target.indexOf(mineVowel) > -1;
        if (mineVowel == 'A' ||
                mineVowel == 'E' ||
                mineVowel == 'O' ||
                mineVowel == 'U' ||
                mineVowel == 'a' ||
                mineVowel == 'e' ||
                mineVowel == 'o' ||
                mineVowel == 'u' ||
                mineVowel == 'i') {
            return true;
        } else {
            return false;
        }
    }

    //TASK 7//
    public static boolean isConsonant(char mineVowel) {
        return !isVowel(mineVowel);
    }
}
