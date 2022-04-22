package casting;

import java.util.Scanner;

public class ExerciseConvertingDateTypes {
    public static void main(String[] args) {

    String num1="23";
    String num2="25";
        int num1Int=Integer.parseInt(num1);//first way.string convert to int
        int num2Int=Integer.parseInt(num2);//first way

        Integer num1Integer=Integer.valueOf(num1);//second way
        Integer num2Integer=Integer.valueOf(num1);//second way
        System.out.println(num1);
        System.out.println(num2);
        System.out.println((num1Int+num2Int)/2);

        String save="390";
        String day="15.60";

        double saveDouble=Double.parseDouble(save); //first way.string convert to int
        double dayDouble=Double.parseDouble(day);

        System.out.println((int)(saveDouble/dayDouble));


          int x=56; // convert primitives to string
          int y=34;
          String str =""+x+y;//it is going to read 5634

        //second way to convert primitives to string
        //String.valueOf()--->String str =String.valueOf(x+y);
        //String str = String.valueOf(x)+String.valueOf(y);

        //converting string to primitives
        String price="$33.99";
        String withOutDolor=price.substring(1);
        String withOutDolor1=price.replace("$","");
        Double myDouble=Double.parseDouble(withOutDolor);
        System.out.println(myDouble);

    }
}
