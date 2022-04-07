package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class UnderstandingArrayList {
    public static void main(String[] args) {
        String[] names=new String[5];//Array you need the declair the size but arraylist you dont need to
        ArrayList<String> nameList=new ArrayList<String>();//we dont need to mention about size
        // get the size of ArrayList with size() method
        System.out.println(nameList.size());
        //dataType[]variableName=new dataType[size]; declaring an arraylist
        //Getting size of the Array
        //store in lenghtOfArray =variableName.length
        nameList.add("Abe");//add method is boolean void method
        nameList.add(4,"Data");//you can not jump to indexof 4 indexoutofboundexception wrong
        System.out.println(nameList);
        nameList.set(2,"lionel"); //set is replacing if you don't speciafy any index it will go at the end
        //your bound is 1 more then the whole array//return method
        //you can add same name no problem//it allows duplicates
        nameList.add(null);//you can store data as a null
        //size is zero but capacity is 10

        nameList.remove(20);
        nameList.get(3);//MAX print the element with get()method
        nameList.indexOf("regina");//0
        nameList.lastIndexOf("regina");//7
        nameList.contains("kaly");//false
        nameList.removeAll(nameList);//clear everything //takes collection
        System.out.println(nameList.size());
        nameList.clear();//remove all//void method
        System.out.println(nameList.isEmpty());//returns true false

    }
}
