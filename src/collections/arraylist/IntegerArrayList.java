package collections.arraylist;

import java.util.AbstractList;
import java.util.ArrayList;

public class IntegerArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(5);
        numbers.add(7);
        numbers.add(10);
        System.out.println(numbers.size());//3
        System.out.println(numbers);//5,7,10
        System.out.println(numbers.get(0));
        for (Integer integer : numbers) {
            System.out.println(integer);

        }
        for (Integer number : numbers) { //you can write int instead of integer
            System.out.println(number);
        }
        int countEven=0;
        for (Integer number : numbers) {
            if(number%2==0)countEven++;
        }
        System.out.println(countEven);
    }
}
