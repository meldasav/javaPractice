package HomeworkRecap.methods;

public class Method_Has_Vowel {
    public static void main(String[] args) {
        System.out.println(hasVowel1("hello world"));
    }

    /**
     * Create a method called hasVowel()
     * -This method will take one String argument and it will return a
     * boolean checking if String has any vowel or not
     */
    public static boolean hasVowel(String word) {
        word = word.toLowerCase().trim();
        boolean hasVowel = false;
        if (!word.isEmpty()) {
            for (char c : word.toCharArray()) {
                if (c == 'a' || c == 'e' ||
                        c == 'u' || c == 'i' ||
                        c == 'o') ;
                hasVowel = true;
                break;
            }
        }
        return hasVowel;
    }

    public static boolean isVowel(char character) {
        return (character == 'A' ||
                character == 'E' ||
                character == 'O' ||
                character == 'U' ||
                character == 'I' ||
                character == 'a' ||
                character == 'e' ||
                character == 'i' ||
                character == 'u' ||
                character == 'o');

    }

    public static boolean hasVowel1(String str) {
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i))) {
                isVowel = true;
                break;
            }
        }
        return isVowel;
    }
}