package homePractice;

public class RecursionPractice {
/**
 * Write a method that finds the sum of  the numbers 1-n
 */

   public static int recursiveSum(int n){
       if(n>0) return n + recursiveSum(n-1);
       return 0;
   }
    /**
     * Write a method that finds the product of  the numbers 1-n
     */
   public static int product(int n){
       if(n>1) return n * product(n-1);
       return 1;
   }
   //2.way
    public static int product1(int n){
       if(n==1)return 1;
       return n * recursiveSum(n-1);
    }
    /**
     *
     * reverse string
     */
     public static String reverse(String str){
         if(str.length()<=1)return str;
         return reverse(str.substring(1)) + str.charAt(0);
     }

    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }
}
