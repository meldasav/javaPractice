package homePractice;

public class ArrayForeachLoop {
    public static void main(String[] args) {
        String[] colors = {"pink", "purple", "yellow", "green"};
        for (String favColor : colors) {
            System.out.println(favColor);

            for (String even : colors) {
                if (even.length() % 2 == 0) {
                    System.out.println(even);
                }
            }
            String[] phones = {"Iphone", "Samsung", "LG", "Google Pixel", "Motorola"};
            String[] phone2 = {"Iphone,Samsung,LG,Google Pixel,Motorola"};
            int counter = 0;
            if (phones.length == phone2.length) {
                for (int i = 0; i < phones.length; i++) {
                    String p = phones[i];
                    String p2 = phone2[i];
                    if (p.equals(p2)) {
                        counter++;
                    }
                }
            }
            if (counter == phones.length) {
                System.out.println("Arrays are same");
            } else {
                System.out.println("Arrays are different");
            }
        }

    }
}