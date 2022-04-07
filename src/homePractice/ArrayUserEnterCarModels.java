package homePractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserEnterCarModels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of cars you have");
        int numberOfCars= input.nextInt();
        input.nextLine();
        String [] myGarage=new String[numberOfCars];
        System.out.println(Arrays.toString(myGarage));
        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Please enter car + " + (i + 1)+ ":" );
            String carName= input.nextLine();
            myGarage[i]=carName;
        }
        System.out.println(Arrays.toString(myGarage));
        int counter=0;
        for (int i = 0; i < myGarage.length; i++) {
            if(myGarage[i].equalsIgnoreCase("bmw") || myGarage[i].equalsIgnoreCase("mercedes")){
                counter++;
                break;
            }
        }
            if(counter==0){
                System.out.println("you don't have a German car");
            }
    }

}

