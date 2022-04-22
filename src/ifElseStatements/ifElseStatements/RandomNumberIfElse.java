package ifElseStatements.ifElseStatements;

public class RandomNumberIfElse {
    public static void main(String[] args) {
        //number between -10 and 10 check if number is positive,negative,zero
        // end point + start point +1 =start point

        int random = (int) ((Math.random() * 21) - 10);
        System.out.println(random);

        if (random > 0) System.out.println("The number is positive");
        else if (random < 0) System.out.println("The number is negative");
        else System.out.println("The number is zero");
    }
}
