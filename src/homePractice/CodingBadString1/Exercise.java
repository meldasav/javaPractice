package homePractice.CodingBadString1;

public class Exercise {

        public static void main(String[] args) {
            homePractice.CodingBadString1.Exercise exercise = new homePractice.CodingBadString1.Exercise();
            System.out.println(exercise.helloName("Melda"));
            exercise.helloName1("Melda");
            System.out.println(homePractice.CodingBadString1.Exercise.helloName2("Melda"));
            homePractice.CodingBadString1.Exercise.helloName3("Melda");
            System.out.println(exercise.makeAbba("Melda", "Tarik"));
            exercise.makeAbba1("MELDA", "TARIK");
            System.out.println(homePractice.CodingBadString1.Exercise.makeAbba2("MELDA", "tarik"));
            homePractice.CodingBadString1.Exercise.makeAbba3("KEREM", "MELDA");
            System.out.println(exercise.makeOutWord("<<>>", "KEREM"));
            homePractice.CodingBadString1.Exercise.makeOutWord1("<<>>", "TARIK");
            String s = "<<>>";
            String s1 = "Melda";
            System.out.println(s.substring(0, 2) + s1 + s.substring(2));
            System.out.println( exercise.extraEnd("MELDA"));
        }

        //Hello Bob "Hello Bob!"
        public String helloName(String name) {
            return "Hello ".concat(name).concat("!");
        }

        public void helloName1(String name) {
            System.out.println("Hello ".concat(name).concat("!"));
        }

        public static String helloName2(String name) {
            return "Hello ".concat(name).concat("!");
        }

        public static void helloName3(String name) {
            System.out.println("Hello ".concat(name).concat("!"));
        }

        //"HiByeByeHi" makeAbba
        //write a method takes 2 string argument return string non static
        public String makeAbba(String a, String b) {
            return a + b + b + a;
        }

        //write a void non static  method takes 2 String argument
        public void makeAbba1(String a, String b) {
            System.out.println(a.concat(b).concat(b).concat(a));
        }

        //WRITE A STATIC method takes 2 argument return String
        public static String makeAbba2(String a, String b) {
            return a.concat(b).concat(b).concat(a);
        }

        //make static void takes 2 string argument
        public static void makeAbba3(String a, String b) {
            System.out.println(a.concat(b).concat(b).concat(a));
        }

        //write a method takes 2 String argument return string non static <<Melda>>

        public String makeOutWord(String s, String s1) {
            return s.substring(0, 2) + s1 + s.substring(2);
        }

        public static void makeOutWord1(String s, String s1) {
            System.out.println(s.substring(0, 2) + s1 + s.substring(2));
        }

        public String extraEnd(String str) {
            String str1=str.substring(str.length()-2);
            return str1+str1+str1;
        }
    }

