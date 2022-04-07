package ifElseStatements.ifElseStatements;

public class IfElseIfElse {
    public static void main(String[] args) {
        int random=(int)(Math.random()*21)-10;
        //number between -10 to 10  //1.generate a number2.create if statements for checking 3 different possibilities

        if(random>0){                                      //do the proper action for every single possibility
            System.out.println("number is positive");
        }else if( random<0){
            System.out.println("number is negative");
        }else{
            System.out.println("number is zero");
        }
    }
}
