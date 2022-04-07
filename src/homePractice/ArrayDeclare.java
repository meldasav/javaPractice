package homePractice;

import java.util.Arrays;

public class ArrayDeclare {
    public static void main(String[] args) {
//        String[] names = new String[3];
//        // String[] names={"melda","tarik","kerem"};
//        names[0] = "tarik";
//        names[1] = "melda";
//        names[2] = "kerem";
//
//        System.out.println(Arrays.toString(names));

        String [] cars={"Mercedes","BMW","Tesla"};

        for(int i=0; i< cars.length;i++){
           if(cars[i].equalsIgnoreCase("tesla")){
               System.out.println(cars[i]);
           }
        }

       // System.out.println(cars[0]);


    }
}