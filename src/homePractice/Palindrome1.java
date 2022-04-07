package homePractice;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome1 {
    public static void main(String[] args) {


        int[] numbers1={5,3,0,-5,10,20};
        int maxNumber=Integer.MIN_VALUE;
        for(int number:numbers1){
            if(number>maxNumber)maxNumber=number;
        }
        System.out.println(maxNumber);
        String[] objects={"Remote","Mouse","Mouse","Keyboard","iPad"};
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects,"mouse")>=0 );




        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
       boolean hasZero=false;
       int countZero=0;
       for(int number:numbers) {
           if (number == 0) {
               countZero++;
           }
       }
        System.out.println(countZero);


        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
        int sum1 = 0;
        for (int i = 0; i <= 2; i++) {
            sum1 += numbers[i];
        }
        System.out.println(sum1);
        int sum2 = 0;
        for (int i = numbers.length - 5; i <= numbers.length - 1; i++) {
            sum2 += numbers[i];
        }
        System.out.println(sum2);

        int product = 1;
        for (int i = numbers.length - 4; i <= numbers.length - 1; i++) {
            if (numbers[i] != 0) product *= numbers[i];
        }
        System.out.println(product);

        int product1 = 1;
        for (int i = 0; i <= numbers.length - 5; i++) {
            if (numbers[i] != -7) product1 *= numbers[i];
        }
        System.out.println(product1);

        String[] cartoons = {"Garfield", "Tom", "Sylvester", "Azrael","Felix"};
        boolean isGarfieldExist = false;
        boolean isFelixExist = false;

        for (String cartoon : cartoons) {
            if (cartoon.equals("Garfield")) isGarfieldExist = true;
            else if(cartoon.equals("Felix"))isFelixExist=true;

        }
        System.out.println(isFelixExist && isGarfieldExist);


    }

}




