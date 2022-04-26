package recurstion;

public class _Practice03 {
    public static String reverse(String str) {
   if(str.length()<=1) return str;
    return reverse(str.substring(1)+str.charAt(0));

    }
}
