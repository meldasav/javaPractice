package homePractice;

public class _Array_Int_To_String {
    public static void main(String[] args) {
        int[] number = {23, 23, 34, 56, 342, 2};
        String result = "[";
        for (int i = 0; i < number.length; i++) {
            if (i == number.length - 1) {
                result += number[i] + "]";

            }else{
                result+=number[i]+",";
            }
            }
            System.out.print(result);
        }
    }
