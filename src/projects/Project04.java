package projects;

public class Project04 {
    /**
     * CREATE A METHOD CALLED isSpACE()if the given char is a space return true
     */
    public static boolean isSpaCE(char c) {
        return c == ' ';
    }

    /**
     * CREATE A METHOD CALLED isDiGit()if the given char is a digit return true
     */
    public static boolean isDiGIT(char c) {
        return c >= 48 && c <= 57;
    }

    /**
     * CREATE A METHOD CALLED isUpperCase()if the given char is a uppercase return true
     */
    public static boolean isUpperCAse(char c) {
        return c >= 65 && c <= 90;
    }

    /**
     * CREATE A METHOD CALLED isLowerCase()if the given char is a lowercase return true
     */
    public static boolean isLowerCAse(char c) {
        return c >= 97 && c <= 122;
    }

    /**
     * CREATE A METHOD CALLED isLetter()if the given char is a letter return true
     */
    public static boolean isLetTer(char c) {
        //  return c>=65 && c<=97 || c>=97 && c<=122;
        /**
         * 2.way
         */
        return isUpperCAse(c) || isLowerCAse(c);
    }

    /**
     * CREATE A METHOD CALLED isVowel()if the given char is a VOWEL return true
     */
    public static boolean isVowelL(char c) {
        return c == 'A' || c == 'E' || c == 'I' || c == 'U'
                || c == 'O' || c == 'a' || c == 'e' || c == 'i'
                || c == 'o' || c == 'u';
    }

    public static boolean isCoNsoNAnt(char c){
        return isLetTer(c)||!isVowelL(c);
    }
}