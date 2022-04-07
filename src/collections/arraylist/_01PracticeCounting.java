package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class _01PracticeCounting {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(13);
        numbers.add(13);
        numbers.add(8);
        numbers.add(9);
        numbers.add(9);

        int countPrime=0;
        for (int i = 2; i <numbers.size()/2 ; i++) {
            if(!(numbers.get(i)%i==0))countPrime++;
        }
        System.out.println(countPrime);
        int countBy5=0;
        for (Integer number : numbers) {
            if(number%5==0)countBy5++;
        }
        System.out.println(countBy5);

        int countMore10 = 0;
        for (Integer number : numbers) {
            if (number > 10) countMore10++;
        }
        System.out.println(countMore10);
        int countZero = 0;
        for (Integer number : numbers) {
            if (number == 0) countZero++;
        }
        System.out.println(countZero);

        int countNegative = 0;
        for (Integer number : numbers) {
            if (number < 0) countNegative++;

        }
        System.out.println(countNegative);

        int countPositive = 0;
        for (Integer number : numbers) {
            if (number > 0) countPositive++;
        }
        System.out.println(countPositive);
        int countEven = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) countEven++;
        }
        System.out.println(countEven);
        int counter = 0;
        for (Integer number : numbers) {
            if (number % 2 == 1) counter++;
        }
        System.out.println(counter);
        int counterOdds = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1) counter++;
        }
        System.out.println(counter);
/*
        Practices
        Evens
        Positives
        Negatives
        Zeros
        Numbers more than 10
        Numbers can be divided by 5
         */

        List<String> colors = new ArrayList<>();

        colors.add("Purple");
        colors.add("Yellow");
        colors.add("blue");
        colors.add("red");
        colors.add("Brown");
        colors.add("Black");
        colors.add("White");
        colors.add(" ");

        System.out.println(colors);
        int counterStar = 0;
        for (String color : colors) {
            char c = color.charAt(0);
            if (Character.isUpperCase(c)) counterStar++;
        }
        System.out.println(counterStar);

        //2.WAY
        for (int i = 0; i < colors.size(); i++) {
            if (Character.isUpperCase(colors.get(i).charAt(0))) counterStar++;
        }
        System.out.println(colors);

        int counterL = 0;
        for (String color : colors) {
            if (Character.isLowerCase(color.charAt(0))) counterL++;
        }
        System.out.println(counterL);

        int countEmpty = 0;
        for (String color : colors) {
            if (Character.isWhitespace(color.charAt(0))) countEmpty++;

        }
        System.out.println(countEmpty);
        int count4 = 0;
        for (String color : colors) {
            if (color.length() >= 4) count4++;

        }
        System.out.println(count4);
    }

}




