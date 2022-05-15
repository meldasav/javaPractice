package homePractice.whiteBoardQuestions;



public class SumOfDigitInString {
    public static void main(String[] args) {
        System.out.println(sumOfDigit("melda19831"));
    }
    public static int sumOfDigit(String str) {
        int sum = 0;
        str = str.replaceAll("[A-Za-z]", "");
        for (char c : str.toCharArray()) {
            sum += c-'0';
        }
        return sum;
    }
}
