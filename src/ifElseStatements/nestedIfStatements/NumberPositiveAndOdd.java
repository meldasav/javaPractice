package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 101) - 50;
        System.out.println(random);

        if (random > 0) {
            System.out.println("Number is positive");
            if (random % 2 == 0) {//positive and even
                System.out.println("number is positive and even");
            } else {
                System.out.println("number is positive and odd");
            }
        } else if (random < 0) {
            System.out.println("Number is negative");
            if (random % 2 == 0) {
                System.out.println("Negative and even");
            } else {
                System.out.println("Negative and odd");
            }
        } else {
            System.out.println("Number is zero");
        }

    }
}