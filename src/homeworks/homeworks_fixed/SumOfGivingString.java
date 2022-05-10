package homeworks.homeworks_fixed;

public class SumOfGivingString {
    public static void main(String[] args) {
        System.out.println(sumOfDigit5("melda1983"));
    }

    public static int sumOfDigit1(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt(String.valueOf(c));
            }
        }
        return sum;
    }

    public static int sumOfDigit2(String str) {
        int sum = 0;                //[\\D]
        str = str.replaceAll("[A-Za-z]", "");
        for (char c : str.toCharArray()) {
            sum += c - '0';
        }
        return sum;
    }

    public static int sumOfDigit3(String str) {
        int sum = 0;
        str = str.replaceAll("[\\D]", "");
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }

    public static int sumOfDigit4(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) {
                sum += Integer.parseInt("" + c);
            }
        }
        return sum;
    }
    public static int sumOfDigit5(String str) {
        return str.chars().filter(Character::isDigit).map(c->c -'0').sum();
    }
}