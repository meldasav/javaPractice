package loops;

public class CountLetterFromString {
    public static void main(String[] args) {

        String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int count=0;
        for (int i = 0; i < address.length(); i++) {
            if(Character.isLetter(address.charAt(i))){
                count++;
            }

        }
        System.out.println(count);
    }
}