package stringMethods;

public class _09_Trim {
    public static void main(String[] args) {
        String str="   hello  ";
        System.out.println(str);
        System.out.println(str.length());//12
        System.out.println(str.trim());//it will take off all the space from beginning and after
        System.out.println(str.trim().length());//it will not remove any space between words

        String str2="     good       Morning     ";
        String str3=str.trim();
        System.out.println(str3);//good      morning
        /*
        Method Task: It is used to remove whitespaces from both ends of a String
        -It is non-static, and we can call with object name
        -It is return type and return a String
        -It does not take any argument
        NOTE: trim() method will not remove any extra space between the words,
        it only removes extra spaces before and after the first and last chars in the String
         */
         String name ="Method is function";
        System.out.println(name.toUpperCase().substring(0,6));
    }
}
