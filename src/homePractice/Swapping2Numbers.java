package homePractice;

public class Swapping2Numbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Before swapping values are " + a + " " + b);

        //create 3 th variable
        int c = a;
        a = b;
        b = c;
        System.out.println("after swapping values are " + a + " " + b);
    }
}
