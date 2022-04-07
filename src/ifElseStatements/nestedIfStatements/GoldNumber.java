package ifElseStatements.nestedIfStatements;

public class GoldNumber {
    public static void main(String[] args) {
        int random=(int)(Math.random()*101)-50;
        System.out.println(random);
        if(random>0){
            System.out.println("we will win 10 points");
            if(random>25) {
                System.out.println("then we will win extra 10 points");
            }
            }
            if(random==-7){
                System.out.println("then we will win extra 10 points");
            }


    }
}
