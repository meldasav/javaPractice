package methods;

import utilities.Calculator;

public class TestingCalculator {
    public static void main(String[] args){
        int i1=15,i2=2;
        int result= Calculator.divide(i1,i2);
        System.out.println(result);
        double d1=15,d2=2;
        double result2=Calculator.divide(d1,d2);
        System.out.println(result2);
        Introduction.introduce("wazwaz ","engineer" ,20 , "books");
        int max=Math.max(1,2);
        double max2=Math.max(15.2,10);
        System.out.println(Calculator.divide(d1,d2));

    }
}
