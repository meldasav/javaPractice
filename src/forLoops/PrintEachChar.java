package forLoops;

public class PrintEachChar {
    public static void main(String[] args) {
        String str = "TechGlobal School";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
        String str1 = "TechGlobal School";
        int strAll = str.length();
        int strReplace = str.replace("o", "").length();
        int nEw = strAll - strReplace;
        System.out.println(nEw);

        int countC = 0;
        char[] c =str.toLowerCase().toCharArray();
        for (char c1 : c) {
            if(c1=='c')countC++;
        }
        System.out.println(countC);
    }

}

