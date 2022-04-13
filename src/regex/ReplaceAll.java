package regex;

public class ReplaceAll {
    public static void main(String[] args) {
        System.out.println(removeSpecials("%mel*d^a1983#"));
        String str = "Hello World12";
        str = str.replaceAll("[aeiouAEIOU]", ".");
        System.out.println(str);
        //removing digits
        String str2 = "hello123world";
        str2 = str.replaceAll("[^0-9]", "");
        System.out.println(str2);
        String str1 = "abc 123$#^";
        str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str1);
    }

    public static String removeSpecials(String str1) {
        StringBuilder s = new StringBuilder();
        for (char o : str1.toCharArray()) {
            if (Character.isLetter(o) || Character.isDigit(o)) {
                s.append(o);
            }
        }
        return s.toString();
    }
}



//
//         public static String removeDigit(String str){
//            StringBuilder s= new StringBuilder();
//            for (char o : str.toCharArray()) {
//                if(Character.isLetter(o))
//                s.append(o);
//            }
//            return s.toString();
//        }
//    }



