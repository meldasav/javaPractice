package characterClass;

import utilities.CharacterHelper;

public class UnderstandingCharacterClass {
    public static void main(String[] args) {
        boolean b = Character.isDigit('9');
        System.out.println(b);
        char c = 'c';
        boolean b1 = Character.isDigit(c);

        //return boolean Static you can call with class name

        System.out.println(Character.isUpperCase('a'));//return FALSE
        System.out.println(Character.isLetterOrDigit(' '));//FALSE
        System.out.println(Character.isSpaceChar(' '));//true
        System.out.println(Character.isWhitespace(' '));//TRUE
        char c2 = '$';
        System.out.println(!Character.isLetter(c2) && !Character.isSpaceChar(c2));//true
        char c3 = 'A';
        String s = "AEOUIaeiou";
        System.out.println(s.contains(String.valueOf(c3)));//true is contain vowels use that
        char c4 = 'a';
        boolean isc4Vowel = false;
        for (int i = 0; i < s.length(); i++) {
            if (c4 == s.charAt(i)) {
                isc4Vowel = true;
                break;
            }

        }



            }

        }








