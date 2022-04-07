package utilities;

import com.apple.eawt.AppEvent;
import creatingMethods.FirstMethod;

public class Calculator {
    public static int divide(int num1 , int num2){
        return num1/num2;
    }
    public static double divide(double num1,double num2){
        return num1/num2;
    }

    public static void main(String[] args) {
        FirstMethod firstMethod = new FirstMethod();
//        System.out.println(firstMethod.averageOf5Number(1,2,3,4,5));
//        System.out.println(FirstMethod.averageOf3Number(5.1,8,6));
//        System.out.println(RandomNumberGenerator.getRandomNumber(32,22));
        System.out.println(MathHelper.minOfThree((byte)1,(byte)2,(byte)3));
    }
}
