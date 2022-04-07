package ifElseStatements.nestedIfStatements;

public class NumberPositiveAndOdd {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 101) - 50;
        System.out.println(random);


        if(random%2==1) {     //random%2!=0 number is odd
            System.out.println("Number is positive and odd");
        }else{
            System.out.println("number is positive and even");
        }

    }

}