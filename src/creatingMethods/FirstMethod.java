package creatingMethods;

public class FirstMethod {


      public static int sum(int num1,int num2){
                return num1+num2;
      }
      public static double doubleSum(double doubleNumber1,double doubleNumber2){
           return doubleNumber1+doubleNumber2;
      }
      public static int intDifference(int intNumber1,int intNumber2){
           return Math.abs( intNumber1-intNumber2);
      }
      public static double doubleDifference(double doubleNum1 , double doubleNum2){
           return Math.abs(doubleNum1-doubleNum2);
      }
      public static int numberProduct(int numProduct1,int numProduct2){
           return numProduct1*numProduct2;
      }
      public static double numberDoubleProduct(double numberDoubleProduct1,double numberDoubleProduct2){
           return numberDoubleProduct1*numberDoubleProduct2;
      }
          public static String myNameIs(String name){
              return "your name is  "+name ;
          }
          public  int ageFind(int birnYear){
           return 2022-birnYear;
          }


         public double averageOf5Number(int num1,int num2,int num3,int num4,int num5){
           return (double) (num1+num2+num3+num4+num5)/5;
         }
         public static int averageOf3Number(double num1,double num2,double num3){
           return (int) (num1+num2+num3)/3;
         }


        }


