package homeworks;

import utilities.ScannerHelper;

import java.util.Locale;

public class Practice01 {
    public static void main(String[] args) {
        String str = "SDLC is step by step procedure to create an application";

//        System.out.println(str.length());
//        System.out.println(str.indexOf("SDLC"));
//        System.out.println(str.indexOf("application"));


//        String str1 = " I know how to code with Python ";
//        String str2=str1.trim().toUpperCase();
//        System.out.println(str2.replace("PYTHON","JAVA"));

        String str1 ="   SDLC has planning, design, development, testing, deployment and maintenance phases   ".trim();
        System.out.println(str1.charAt(0));
        System.out.println("Last char that is not space is = " + str1.charAt(str1.length()-1));

//        String s1 = "TECH";
//        String s2 = "glo";
//        String s3 = "BAL";
//

//        String s1 = " TECH ".trim().toLowerCase().replace("t", "T");
//        String s2 = " glo  ".trim().replace("g", "G");
//        String s3 = " BAL       ".trim().toLowerCase();
//
//        System.out.println(s1 + s2 + s3);
//
////TechGlobal
//
//        String s4 = s1.trim().replace("ECH", "ech") + s2.trim().replace("g", "G") +
//                s3.trim().toLowerCase();
//
//      String color= ScannerHelper.getColorFromUser();
//        System.out.println("1st character is =" +color.charAt(0));
//        System.out.println("2nd character is = " +color.charAt(color.length()-1));
//        System.out.println("First 3 characters are " +color.substring(0,3));
//        System.out.println("Last 3 characters are " +color.substring(color.length()-3));

//        String sentence=ScannerHelper.getAddressFromUser();
//        String sentence1=sentence.toLowerCase();
//        System.out.println(sentence1.substring(0,sentence1.indexOf(' ')));
//        System.out.println(sentence1.trim().substring(sentence1.lastIndexOf(' ')+1));

        String sentence3=ScannerHelper.getAddressFromUser();
        if(sentence3.contains("$")){
            System.out.println("this sentence contains $ character"+"\n$ character's index is = " +sentence3.indexOf('$'));
        }else{
            System.out.println("this sentence contains $ character");
            System.out.println(sentence3.contains("$") ?
                    "This sentence contains $ character" + "\n$ character's index is = " + sentence3.indexOf('$') :
                    "This sentence does not contain $ character");

        }
    }
}
