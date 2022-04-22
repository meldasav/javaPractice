package homePractice;

public class IsVowel {
    public static void main(String[] args) {
        char c3 = 'A';
        String s2 = "AEOUIaeiou";
        System.out.println(s2.contains(c3 + ""));


        char c = 'a';
        String s = "AEOUIaeiou";
        boolean iscVowel = false;
        for (int i = 0; i < s.length(); i++) {
            if (c == s.charAt(i)) {
                iscVowel = true;
                break;

            }
        }
        if (iscVowel) System.out.println("c is vowel");
        else System.out.println("c is not vowel");


    }

    public static String removeVowel(String str) {
        String s = "AEOUIaeiou";
        StringBuilder s1 = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!str.contains(s)) {
                s1.append(str.charAt(i));
            }
        }
        return s1.toString();
    }


}

