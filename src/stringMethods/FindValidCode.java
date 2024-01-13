package stringMethods;

import java.util.Scanner;

public class FindValidCode {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the code");
        String code = scanner.nextLine();

        int flag = 10;

        if (code.length() < 10) {
            System.out.println("code needs to be 10 character");
            flag++;
        }
        if (code.contains(" ")) {
            System.out.println("code should not contain a space ");
            flag++;
        }
        if (!Character.isDigit(code.charAt(code.length() - 1))) {
            System.out.println("last character should be digit");
            flag++;
        }
        if (!Character.isLowerCase(code.charAt(0))) {
            System.out.println("code should start lowercase");
            flag++;
        }
        if (flag == 10) System.out.println("code is valid");


    }
}
