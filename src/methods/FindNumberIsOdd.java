package methods;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

public class FindNumberIsOdd {
    public static void main(String[] args) {
          int r1=(RandomNumberGenerator.getRandomNumber(17,43));
          if(MathHelper.isEven(r1)){
              System.out.println("The number generated is EVEN");
        }
          else{
              System.out.println("The number generated is ODD");
          }
        System.out.println("end of the program");
    }

}
