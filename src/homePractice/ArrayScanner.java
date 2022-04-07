package homePractice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        //String address = "2860 S River Rd Suite 350, Des Plaines IL, 60018";
        int[] ages={13,50,25,12,18};
        System.out.println(Arrays.toString(ages));

        String[] names={"melda","tarik","kerem","hatice"};
        System.out.println(names[0] + " " + " my son is " +names[2]);

        double[] numbers={45.99,23.5,11.50,33.33,99.99};
        numbers[4]=112.89;
        System.out.println(Arrays.toString(numbers));

        String[] colors={"pink","red","blue","white"};
        for (int i = 0; i < colors.length ; i++) {
            if(colors[i].length()>=4)
            System.out.println(colors[i]);
        }
       String[] students={"James","John","Adam","Elize","Jamie","Benzema"};
        Scanner scan =new Scanner(System.in);
        System.out.println("enter a string");
        String name = scan.nextLine();;
        for (int i = 0; i < students.length; i++) {
            String student =students[i];
            if(student.contains(name)){
                System.out.println(student);
            }
        }




        }
    }


