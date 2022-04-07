package homePractice;

public class IsVowel {
    public static void main(String[] args) {

            char c='a';
            String s="AEOUIaeiou";
            boolean iscVowel=false;
        for (int i = 0; i < s.length(); i++) {
            if(c==s.charAt(i)){
                iscVowel=true;
                break;

        }
        }
        if(iscVowel) System.out.println("c is vowel");
        else System.out.println("c is not vowel");


        }
    }

