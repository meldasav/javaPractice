package loops;

import methods.FindSpaceInStringMethod;

public class CountingSpaceFromString {
    public static void main(String[] args) {
        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";

        int count = 0;
        for (int i = 0; i < address.length(); i++) {
            if (Character.isSpaceChar(address.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);

        for (int i = 0; i <address.length(); i++) {
            if(Character.isWhitespace(' ')){
                count++;
            }
        }

    }
}
