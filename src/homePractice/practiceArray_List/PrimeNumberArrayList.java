package homePractice.practiceArray_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberArrayList {
    public static void main(String[] args) {
        //prime number divisible by 1 and itself
        //number greater than 1 ---->2,3,5,7,11,13.....
        //is number prime?
        Scanner scan =new Scanner(System.in);
        System.out.println("please enter a number");
        int number= scan.nextInt();
        boolean isPrime=true;
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);


        //prime number nested loop
        ArrayList<Integer> primeNumbers=new ArrayList<>();
        for (int i = 2; i <=100 ; i++) {
            boolean isPrime1=true;
            for (int j = 2; j <=i/2 ; j++) {
                if(i%j==0){
                 isPrime1=false;
                 break;
                }
            }
            if(isPrime1){
                primeNumbers.add(i);
            }
        }
        System.out.println("Prime numbers 1 to 100 are : ");
        String str="";
        for (Integer primeNumber : primeNumbers) {
            str+=primeNumber+" - ";
        }
        System.out.print(str.substring(0,str.length()-3));
    }
}
