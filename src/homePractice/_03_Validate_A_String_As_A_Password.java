package homePractice;

public class _03_Validate_A_String_As_A_Password {
    public static void main(String[] args) {
        System.out.println(validatePassword(""));
        System.out.println(validatePassword("abc"));
        System.out.println(validatePassword("Abcd1234"));
        System.out.println(validatePassword("Abc12$"));
        System.out.println(validatePassword("Abc d512$"));
        System.out.println(validatePassword("Abcd512$abcdefdabc"));
        System.out.println(validatePassword("Abcd123!"));
    }
    public static boolean validatePassword(String str){
        if(str.contains(" ") || str.length()<8 || str.length()>16)return false;
        boolean upperCase=false;
        boolean lowerCase=false;
        boolean digit=false;
        boolean special=false;

        for(char c:str.toCharArray()){
            if(Character.isUpperCase(c))upperCase=true;
            else if(Character.isUpperCase(c))lowerCase=true;
            else if(Character.isDigit(c))digit=true;
            else special=true;
        }
        return upperCase && lowerCase && digit && special;
    }

}
