package array;

import java.util.Arrays;

public class UnderstandingArrays {//ARRAY IS A CLASS STATIC
     // ARRAY SYNTAX
    //dataType[] variableName=new datatype[length]
    //dataType[] variableName={element1,element2}
     //NULL IS A KEYWORD YOU CAN NOT USE A VARIABLE NAME
    public static void main(String[] args) {
       // initialize array ---->String[] names = new String [5];
        String name;
        name="John";
        int age=45;
        System.out.println("Name is = " + name);
        System.out.println("Age is= " + age);
        String[] names={"Alex","Abe","Melda"};
        int [] ages={20,21,22};
        char[] favCharacters={'A','%','G'};
        double [] balances={5.6,15,23.6};
        boolean[] doTheyLikeJava={false,true,true};
        //how to print Array/how to get single Array
        System.out.println(Arrays.toString(names));
        System.out.println(names[1]);//Abe
        System.out.println(names[0]);//Alex
     // System.out.println(names[5]);//ArrayIndexOutOfBounds

        //how to update
        names[1]="Abraham";
        System.out.println(Arrays.toString(names));

        int [] ageA={20};
        char[] favCharacters1={'A'};
        double [] balances1={5.6};
        boolean[] doTheyLikeJava1={false};
        System.out.println("'s age is " +ageA[0]);
        for(int i=0; i<=2 ;i++){
            System.out.println(names[i]);
        }


    }
}
