package creatingMethods;

import utilities.MathHelper;

public class CallMethod {
    public static void main(String[] args) {

//        System.out.println(FirstMethod.sum(3,7));
//        System.out.println((FirstMethod.doubleSum(23.4,13.5)));
//        System.out.println(FirstMethod.intDifference(-10,1));
//        System.out.println(FirstMethod.doubleDifference(33.33,66.32));
//        System.out.println(FirstMethod.numberProduct(3,8));
//        System.out.println(FirstMethod.numberDoubleProduct(55.99,103.45));
//        System.out.println(MathHelper.maxOfThree(2,3,4));
//        System.out.println(MathHelper.maxOfThree(22.1,33.4,44.2));
       // System.out.println(FirstMethod.myNameIs("melda"));
        //System.out.println(FirstMethod.ageFind(1983));
        FirstMethod firstMethod=new FirstMethod();
        System.out.println(firstMethod.ageFind(1976));
        System.out.println(firstMethod.averageOf5Number(2,5,6,9,5));

    }
}
