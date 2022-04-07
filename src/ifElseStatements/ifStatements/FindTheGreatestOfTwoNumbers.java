package ifElseStatements.ifStatements;

public class FindTheGreatestOfTwoNumbers {
    public static void main(String[] args) {
         int random=(int)(Math.random()*11);
         int random1=(int)(Math.random()*11);
        System.out.println(random);
        System.out.println(random1);
        if(random>random1){
            System.out.println("the greatest of " + random + "and" + random1 + "is = " + random);
        }else{
            System.out.println("the greatest of " + random + "and" + random1 + "is = " + random1);
        }
    }
}
