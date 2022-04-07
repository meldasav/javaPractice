package homeworks;


import java.util.Scanner;


public class ForLoopIsVowel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        char c='a';
        boolean cisVowel=false;
        String str="";
        for (int i = 0; i < str.length(); i++) {
            if(c==str.charAt(i)){
                cisVowel=true;
                break;
            }
        }
        if(cisVowel) System.out.println("is vowel");
        else System.out.println("is not vowel");




        }

    }













